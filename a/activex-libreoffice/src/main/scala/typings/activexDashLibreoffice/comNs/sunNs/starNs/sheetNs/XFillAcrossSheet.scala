package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XFillAcrossSheet extends XInterface {
  /** copies data between ranges onto different sheets in the document. */
  def fillAcrossSheets(nContentFlags: Double): Unit
}

object XFillAcrossSheet {
  @scala.inline
  def apply(
    acquire: () => Unit,
    fillAcrossSheets: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fillAcrossSheets = js.Any.fromFunction1(fillAcrossSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFillAcrossSheet]
  }
}

