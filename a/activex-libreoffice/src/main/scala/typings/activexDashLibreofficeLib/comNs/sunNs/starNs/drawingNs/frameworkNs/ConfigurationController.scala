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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentConfiguration")(CurrentConfiguration)
    __obj.updateDynamic("RequestedConfiguration")(RequestedConfiguration)
    __obj.updateDynamic("addConfigurationChangeListener")(addConfigurationChangeListener)
    __obj.updateDynamic("addResourceFactory")(addResourceFactory)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getCurrentConfiguration")(getCurrentConfiguration)
    __obj.updateDynamic("getRequestedConfiguration")(getRequestedConfiguration)
    __obj.updateDynamic("getResource")(getResource)
    __obj.updateDynamic("getResourceFactory")(getResourceFactory)
    __obj.updateDynamic("hasPendingRequests")(hasPendingRequests)
    __obj.updateDynamic("lock")(lock)
    __obj.updateDynamic("notifyEvent")(notifyEvent)
    __obj.updateDynamic("postChangeRequest")(postChangeRequest)
    __obj.updateDynamic("removeConfigurationChangeListener")(removeConfigurationChangeListener)
    __obj.updateDynamic("removeResourceFactoryForReference")(removeResourceFactoryForReference)
    __obj.updateDynamic("removeResourceFactoryForURL")(removeResourceFactoryForURL)
    __obj.updateDynamic("requestResourceActivation")(requestResourceActivation)
    __obj.updateDynamic("requestResourceDeactivation")(requestResourceDeactivation)
    __obj.updateDynamic("restoreConfiguration")(restoreConfiguration)
    __obj.updateDynamic("unlock")(unlock)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ConfigurationController]
  }
}

