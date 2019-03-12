package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of collections of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XUniqueCellFormatRangesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a collection of equal-formatted cell range collections.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    *
    * All equal-formatted ranges are consolidated into one collection. These collections are the members contained in a {@link UniqueCellFormatRanges}
    * collection.
    * @returns the collection of equal-formatted cell range collections.
    * @see com.sun.star.sheet.UniqueCellFormatRanges
    */
  val UniqueCellFormatRanges: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns a collection of equal-formatted cell range collections.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    *
    * All equal-formatted ranges are consolidated into one collection. These collections are the members contained in a {@link UniqueCellFormatRanges}
    * collection.
    * @returns the collection of equal-formatted cell range collections.
    * @see com.sun.star.sheet.UniqueCellFormatRanges
    */
  def getUniqueCellFormatRanges(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XUniqueCellFormatRangesSupplier {
  @scala.inline
  def apply(
    UniqueCellFormatRanges: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: () => scala.Unit,
    getUniqueCellFormatRanges: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XUniqueCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(UniqueCellFormatRanges = UniqueCellFormatRanges, acquire = js.Any.fromFunction0(acquire), getUniqueCellFormatRanges = js.Any.fromFunction0(getUniqueCellFormatRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUniqueCellFormatRangesSupplier]
  }
}

