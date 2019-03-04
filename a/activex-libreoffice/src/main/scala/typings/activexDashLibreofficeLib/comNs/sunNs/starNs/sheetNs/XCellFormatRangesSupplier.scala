package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XCellFormatRangesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  val CellFormatRanges: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  def getCellFormatRanges(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XCellFormatRangesSupplier {
  @scala.inline
  def apply(
    CellFormatRanges: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getCellFormatRanges: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(CellFormatRanges = CellFormatRanges, acquire = acquire, getCellFormatRanges = getCellFormatRanges, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCellFormatRangesSupplier]
  }
}

