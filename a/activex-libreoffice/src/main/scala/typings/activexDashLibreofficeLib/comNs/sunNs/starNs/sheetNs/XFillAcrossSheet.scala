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
    acquire: () => scala.Unit,
    fillAcrossSheets: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fillAcrossSheets = js.Any.fromFunction1(fillAcrossSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFillAcrossSheet]
  }
}

