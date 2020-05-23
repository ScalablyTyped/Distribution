package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration controller is responsible for the management of the set of active resources.
  *
  * There are two configurations of resources: The current configuration contains the set of currently active resources.The requested configuration
  * describes what the current configuration should be. The requested configuration is changed usually by calling {@link requestResourceActivation()} and
  * {@link requestResourceDeactivation()} .
  *
  * When the two configurations differ then the current configuration is updated eventually to reflect the requested configuration. An update takes place
  * when the following three conditions are fulfilled.  1. when the last pending request for configuration changes has been processed, 2. when the {@link
  * update()} method is called. 3. when the configuration manager it is unlocked after formerly being locked.
  *
  * Requests for configuration changes are handled in a two step process:  1. First the requested configuration is updated iteratively: Every request that
  * is being made by calling {@link requestResourceActivation()} or {@link requestResourceDeactivation()} results in one or more function objects, that
  * each implement the {@link XConfigurationChangeRequest} interface. These are inserted into a queue. The request objects in the queue are processed
  * asynchronously one at a time in the order in which they are inserted. Only when one request object is processed a change to the requested
  * configuration is made. These changes are broadcasted to registered {@link XConfigurationChangeListener} objects. Listeners may decide to make requests
  * that then are added to the queue. For example when the view in the center pane is replaced by another view, some listeners may want to turn some side
  * panes on or off, or show other views in the side panes.
  *
  *
  *
  * This process goes on until the queue of request objects becomes empty. Until this point only the requested configuration has been modified. No
  * resources have been activated or deactivated.
  *
  *
  *
  *  2.
  *
  * The second update step activates or deactivates resources so that the current configuration (the one that comprises the actually active resources)
  * reflects the requested configuration.
  *
  *
  *
  * The order in which resources are activated or deactivated depends on the dependency between the resources. For example a view depends on the pane it
  * is displayed in. Resources that other resources depend on are activated first and deactivated last. The order is undefined for unrelated resources.
  *
  *
  *
  * Note that the second update step may not be able to activate (or even to deactivate) all the requested resources. Either because they are temporarily
  * or permanently unavailable. For example, during the start-up of a new Impress application the side panes are displayed with a visible delay because
  * they are not provided sooner by the underlying framework. Such unavailable resources are not forgotten but remain in the requested configuration.
  * Every time the configuration controller updates its current configuration these resources are requested once more.
  *
  * The configuration controller sends the following events: ResourceActivationRequested is sent when the activation of a resource has been requested and
  * the resource is not yet active in the requested configuration. The event is sent when the configuration change request is executed, not when the
  * {@link requestResourceActivation()} call is made.
  *
  *
  *
  * The {@link ConfigurationChangeEvent.ResourceId} member is set to the requested resource. The ResourceObject member is not set.
  *
  * ResourceDeactivationRequested is sent when the deactivation of a resource has been requested and the resource is active in the requested
  * configuration. The event is sent when the configuration change request is executed that is created when for example {@link
  * requestResourceDeactivation()} is called.
  *
  *
  *
  * The {@link ResourceId} member is set to the requested resource. The ResourceObject member is not set.
  *
  * ConfigurationUpdateStart is sent before the update of the current configuration starts.
  *
  *
  *
  * The requested configuration is available in the {@link ConfigurationChangeEvent.Configuration} member. The {@link ResourceId} and ResourceObject
  * members are not set.
  *
  * ConfigurationUpdateEnd is sent after the update of the current configuration ends.
  *
  *
  *
  * The requested configuration is available in the {@link ConfigurationChangeEvent.Configuration} member. The {@link ResourceId} and ResourceObject
  * members are not set.
  *
  * ResourceActivation is sent when a resource is activated, i.e. when a new object of a resource is created (or taken from a cache).
  *
  *
  *
  * The {@link ResourceId} and ResourceObject members are set to the {@link XResourceId} and object reference of the activated resource.
  *
  * ResourceDeactivation is sent when a resource is deactivated, i.e. when an object that previously was part of the configuration is removed from the
  * configuration.
  *
  *
  *
  * The {@link ResourceId} and ResourceObject members are set to {@link XResourceId} and object reference of the deactivated resource.
  */
trait XConfigurationController
  extends XConfigurationControllerRequestQueue
     with XConfigurationControllerBroadcaster
     with XResourceFactoryManager {
  /**
    * Return a copy of the current configuration.
    *
    * Modifications to the returned configuration have no effect on the drawing framework.
    */
  val CurrentConfiguration: XConfiguration
  /**
    * Return a copy of the requested configuration.
    *
    * Modifications to the returned configuration have no effect on the drawing framework.
    */
  val RequestedConfiguration: XConfiguration
  /**
    * Return a copy of the current configuration.
    *
    * Modifications to the returned configuration have no effect on the drawing framework.
    */
  def getCurrentConfiguration(): XConfiguration
  /**
    * Return a copy of the requested configuration.
    *
    * Modifications to the returned configuration have no effect on the drawing framework.
    */
  def getRequestedConfiguration(): XConfiguration
  /**
    * Return the active resource specified by the given resource id.
    * @param xResourceId A valid resource id. This should, but does not have to be, the resource id of an active resource.
    * @returns When the given resource id specifies an active resource then that resource is returned. Otherwise an empty reference is returned.
    */
  def getResource(xResourceId: XResourceId): XResource
  /**
    * Lock the processing of configuration change requests.
    *
    * This is only necessary when more than one change request is being made in a row. It prevents an update being made (with all the visible UI changes)
    * before all change requests are being made.
    *
    * Recursive {@link lock()} calls are recognized: the configuration controller is locked while {@link lock()} was called more often than {@link unlock()}
    * .
    */
  def lock(): Unit
  /**
    * Request the activation of a resource.
    *
    * The request is processed asynchronously. Notifications about configuration changes are sent after this call returns.
    * @param xResourceId The resource whose activation is requested.
    * @param eMode  When eMode is REPLACE then, before adding the resource activation to the request queue, similar resources linked to the same anchor are re
    */
  def requestResourceActivation(xResourceId: XResourceId, eMode: ResourceActivationMode): Unit
  /**
    * Request the deactivation of a resource.
    *
    * The request is processed asynchronously. Notifications about configuration changes are sent after this call returns.
    *
    * Requesting the deactivation of a resource that is not active is not an error.
    * @param xResourceId The resource whose deactivation is requested.
    */
  def requestResourceDeactivation(xResourceId: XResourceId): Unit
  /**
    * Replace the requested configuration with the given configuration and schedule an update of the current configuration.
    *
    * Together with the {@link getCurrentConfiguration()} and {@link getRequestedConfiguration()} methods this allows the saving and restoring of
    * configurations. However, the given configuration can have other origins then these methods.
    *
    * The given configuration is transformed into a list of change requests so that the resulting requested configuration equals the given configuration.
    * This has the advantage that not only the resource activations and deactivations but all configuration changes are properly broadcasted.
    *
    * Note that because of the configuration change notifications listeners can make more configuration change requests, so that the resulting requested
    * configuration can be different from the given configuration.
    * @param xConfiguration This typically is a configuration that was obtained with an earlier {@link getRequestedConfiguration()} call.
    */
  def restoreConfiguration(xConfiguration: XConfiguration): Unit
  /**
    * Unlock the processing of configuration change requests.
    *
    * When {@link unlock()} is called as many times as {@link lock()} and the queue of configuration change requests is not empty the configuration
    * controller continues the processing of the change requests. An update of the current configuration will eventually being made.
    */
  def unlock(): Unit
  /**
    * Explicitly request an update of the current configuration.
    *
    * Call it when a resource is activated or deactivated without the control and knowledge of the drawing framework. Calling this method (from outside the
    * drawing framework) should hardly every be necessary.
    */
  def update(): Unit
}

object XConfigurationController {
  @scala.inline
  def apply(
    CurrentConfiguration: XConfiguration,
    RequestedConfiguration: XConfiguration,
    addConfigurationChangeListener: (XConfigurationChangeListener, String, js.Any) => Unit,
    addResourceFactory: (String, XResourceFactory) => Unit,
    getCurrentConfiguration: () => XConfiguration,
    getRequestedConfiguration: () => XConfiguration,
    getResource: XResourceId => XResource,
    getResourceFactory: String => XResourceFactory,
    hasPendingRequests: () => Boolean,
    lock: () => Unit,
    notifyEvent: ConfigurationChangeEvent => Unit,
    postChangeRequest: XConfigurationChangeRequest => Unit,
    removeConfigurationChangeListener: XConfigurationChangeListener => Unit,
    removeResourceFactoryForReference: XResourceFactory => Unit,
    removeResourceFactoryForURL: String => Unit,
    requestResourceActivation: (XResourceId, ResourceActivationMode) => Unit,
    requestResourceDeactivation: XResourceId => Unit,
    restoreConfiguration: XConfiguration => Unit,
    unlock: () => Unit,
    update: () => Unit
  ): XConfigurationController = {
    val __obj = js.Dynamic.literal(CurrentConfiguration = CurrentConfiguration.asInstanceOf[js.Any], RequestedConfiguration = RequestedConfiguration.asInstanceOf[js.Any], addConfigurationChangeListener = js.Any.fromFunction3(addConfigurationChangeListener), addResourceFactory = js.Any.fromFunction2(addResourceFactory), getCurrentConfiguration = js.Any.fromFunction0(getCurrentConfiguration), getRequestedConfiguration = js.Any.fromFunction0(getRequestedConfiguration), getResource = js.Any.fromFunction1(getResource), getResourceFactory = js.Any.fromFunction1(getResourceFactory), hasPendingRequests = js.Any.fromFunction0(hasPendingRequests), lock = js.Any.fromFunction0(lock), notifyEvent = js.Any.fromFunction1(notifyEvent), postChangeRequest = js.Any.fromFunction1(postChangeRequest), removeConfigurationChangeListener = js.Any.fromFunction1(removeConfigurationChangeListener), removeResourceFactoryForReference = js.Any.fromFunction1(removeResourceFactoryForReference), removeResourceFactoryForURL = js.Any.fromFunction1(removeResourceFactoryForURL), requestResourceActivation = js.Any.fromFunction2(requestResourceActivation), requestResourceDeactivation = js.Any.fromFunction1(requestResourceDeactivation), restoreConfiguration = js.Any.fromFunction1(restoreConfiguration), unlock = js.Any.fromFunction0(unlock), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XConfigurationController]
  }
}

