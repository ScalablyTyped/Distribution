package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See {@link XConfigurationController} for a description of the configuration controller.
  *
  * This service is used at the moment by the {@link XControllerManager} to create a configuration controller. This allows developers to replace the
  * default implementation of the configuration controller with their own. This may not be a useful feature. Furthermore the sub controllers may need a
  * tighter coupling than the interfaces allow. These are reasons for removing this service in the future and let the controller manager create the sub
  * controllers directly.
  */
trait ConfigurationController extends XConfigurationController {
  def create(xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController): scala.Unit
}

object ConfigurationController {
  @scala.inline
  def apply(
    CurrentConfiguration: XConfiguration,
    RequestedConfiguration: XConfiguration,
    addConfigurationChangeListener: (XConfigurationChangeListener, java.lang.String, js.Any) => scala.Unit,
    addResourceFactory: (java.lang.String, XResourceFactory) => scala.Unit,
    create: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    getCurrentConfiguration: () => XConfiguration,
    getRequestedConfiguration: () => XConfiguration,
    getResource: XResourceId => XResource,
    getResourceFactory: java.lang.String => XResourceFactory,
    hasPendingRequests: () => scala.Boolean,
    lock: () => scala.Unit,
    notifyEvent: ConfigurationChangeEvent => scala.Unit,
    postChangeRequest: XConfigurationChangeRequest => scala.Unit,
    removeConfigurationChangeListener: XConfigurationChangeListener => scala.Unit,
    removeResourceFactoryForReference: XResourceFactory => scala.Unit,
    removeResourceFactoryForURL: java.lang.String => scala.Unit,
    requestResourceActivation: (XResourceId, ResourceActivationMode) => scala.Unit,
    requestResourceDeactivation: XResourceId => scala.Unit,
    restoreConfiguration: XConfiguration => scala.Unit,
    unlock: () => scala.Unit,
    update: () => scala.Unit
  ): ConfigurationController = {
    val __obj = js.Dynamic.literal(CurrentConfiguration = CurrentConfiguration, RequestedConfiguration = RequestedConfiguration, addConfigurationChangeListener = js.Any.fromFunction3(addConfigurationChangeListener), addResourceFactory = js.Any.fromFunction2(addResourceFactory), create = js.Any.fromFunction1(create), getCurrentConfiguration = js.Any.fromFunction0(getCurrentConfiguration), getRequestedConfiguration = js.Any.fromFunction0(getRequestedConfiguration), getResource = js.Any.fromFunction1(getResource), getResourceFactory = js.Any.fromFunction1(getResourceFactory), hasPendingRequests = js.Any.fromFunction0(hasPendingRequests), lock = js.Any.fromFunction0(lock), notifyEvent = js.Any.fromFunction1(notifyEvent), postChangeRequest = js.Any.fromFunction1(postChangeRequest), removeConfigurationChangeListener = js.Any.fromFunction1(removeConfigurationChangeListener), removeResourceFactoryForReference = js.Any.fromFunction1(removeResourceFactoryForReference), removeResourceFactoryForURL = js.Any.fromFunction1(removeResourceFactoryForURL), requestResourceActivation = js.Any.fromFunction2(requestResourceActivation), requestResourceDeactivation = js.Any.fromFunction1(requestResourceDeactivation), restoreConfiguration = js.Any.fromFunction1(restoreConfiguration), unlock = js.Any.fromFunction0(unlock), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[ConfigurationController]
  }
}

