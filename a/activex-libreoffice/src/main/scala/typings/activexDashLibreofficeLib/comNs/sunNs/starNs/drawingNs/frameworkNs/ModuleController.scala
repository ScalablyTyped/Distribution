package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See {@link XModuleController} for a description of the module controller.
  *
  * See {@link ConfigurationController} for a comment why this service may be removed in the future.
  *
  * The {@link ModuleController} object for an application can be obtained via the {@link XControllerManager} interface.
  */
trait ModuleController extends XModuleController {
  /** Create a new instance of a {@link ModuleController} as sub controller of the given XController object. */
  def create(xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController): scala.Unit
}

object ModuleController {
  @scala.inline
  def apply(
    create: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    requestResource: java.lang.String => scala.Unit
  ): ModuleController = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), requestResource = js.Any.fromFunction1(requestResource))
  
    __obj.asInstanceOf[ModuleController]
  }
}

