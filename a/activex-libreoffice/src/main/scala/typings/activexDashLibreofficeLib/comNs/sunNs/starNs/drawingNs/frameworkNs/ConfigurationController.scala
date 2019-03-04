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
    addConfigurationChangeListener: js.Function3[XConfigurationChangeListener, java.lang.String, js.Any, scala.Unit],
    addResourceFactory: js.Function2[java.lang.String, XResourceFactory, scala.Unit],
    create: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    getCurrentConfiguration: js.Function0[XConfiguration],
    getRequestedConfiguration: js.Function0[XConfiguration],
    getResource: js.Function1[XResourceId, XResource],
    getResourceFactory: js.Function1[java.lang.String, XResourceFactory],
    hasPendingRequests: js.Function0[scala.Boolean],
    lock: js.Function0[scala.Unit],
    notifyEvent: js.Function1[ConfigurationChangeEvent, scala.Unit],
    postChangeRequest: js.Function1[XConfigurationChangeRequest, scala.Unit],
    removeConfigurationChangeListener: js.Function1[XConfigurationChangeListener, scala.Unit],
    removeResourceFactoryForReference: js.Function1[XResourceFactory, scala.Unit],
    removeResourceFactoryForURL: js.Function1[java.lang.String, scala.Unit],
    requestResourceActivation: js.Function2[XResourceId, ResourceActivationMode, scala.Unit],
    requestResourceDeactivation: js.Function1[XResourceId, scala.Unit],
    restoreConfiguration: js.Function1[XConfiguration, scala.Unit],
    unlock: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): ConfigurationController = {
    val __obj = js.Dynamic.literal(CurrentConfiguration = CurrentConfiguration, RequestedConfiguration = RequestedConfiguration, addConfigurationChangeListener = addConfigurationChangeListener, addResourceFactory = addResourceFactory, create = create, getCurrentConfiguration = getCurrentConfiguration, getRequestedConfiguration = getRequestedConfiguration, getResource = getResource, getResourceFactory = getResourceFactory, hasPendingRequests = hasPendingRequests, lock = lock, notifyEvent = notifyEvent, postChangeRequest = postChangeRequest, removeConfigurationChangeListener = removeConfigurationChangeListener, removeResourceFactoryForReference = removeResourceFactoryForReference, removeResourceFactoryForURL = removeResourceFactoryForURL, requestResourceActivation = requestResourceActivation, requestResourceDeactivation = requestResourceDeactivation, restoreConfiguration = restoreConfiguration, unlock = unlock, update = update)
  
    __obj.asInstanceOf[ConfigurationController]
  }
}

