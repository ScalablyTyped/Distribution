package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The module controller is responsible for loading a module (ad-don, plugin, whatever the name) when it is first used.
  *
  * For this there is a list in the office configuration which associates resource URLs with service names which in turn are associated with modules (or
  * dlls). The path to the office configuration list is MultiPaneGUI/Framework/ResourceFactories in the Impress.xcu file.
  */
trait XModuleController extends js.Object {
  /** When the specified resource is requested for the first time then create a new instance of the associated factory service. */
  def requestResource(sResourceTypeURL: java.lang.String): scala.Unit
}

object XModuleController {
  @scala.inline
  def apply(requestResource: java.lang.String => scala.Unit): XModuleController = {
    val __obj = js.Dynamic.literal(requestResource = js.Any.fromFunction1(requestResource))
  
    __obj.asInstanceOf[XModuleController]
  }
}

