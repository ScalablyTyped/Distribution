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

