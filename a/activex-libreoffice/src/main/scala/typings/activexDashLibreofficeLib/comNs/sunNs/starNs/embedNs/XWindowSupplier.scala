package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a VCL window implementation. */
trait XWindowSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
}

object XWindowSupplier {
  @scala.inline
  def apply(
    Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    acquire: () => scala.Unit,
    getWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window, acquire = js.Any.fromFunction0(acquire), getWindow = js.Any.fromFunction0(getWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWindowSupplier]
  }
}

