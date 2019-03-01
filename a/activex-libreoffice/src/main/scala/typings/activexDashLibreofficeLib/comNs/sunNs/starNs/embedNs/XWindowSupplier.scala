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
    acquire: js.Function0[scala.Unit],
    getWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Window")(Window)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getWindow")(getWindow)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XWindowSupplier]
  }
}

