package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XFillAcrossSheet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** copies data between ranges onto different sheets in the document. */
  def fillAcrossSheets(nContentFlags: scala.Double): scala.Unit
}

object XFillAcrossSheet {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    fillAcrossSheets: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("fillAcrossSheets")(fillAcrossSheets)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFillAcrossSheet]
  }
}

