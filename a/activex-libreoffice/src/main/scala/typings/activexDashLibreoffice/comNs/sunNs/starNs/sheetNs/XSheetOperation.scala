package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to execute operations on a cell range or ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetOperation extends XInterface {
  /**
    * clears the specified contents of the current cell range(s).
    * @param nContentFlags a combination of {@link CellFlags} flags selecting the contents to be deleted.
    */
  def clearContents(nContentFlags: Double): Unit
  /**
    * computes a general function based on all cells in the current cell range(s).
    * @param nFunction is the function used to compute the result.
    * @returns the result of the calculation.
    */
  def computeFunction(nFunction: GeneralFunction): Double
}

object XSheetOperation {
  @scala.inline
  def apply(
    acquire: () => Unit,
    clearContents: Double => Unit,
    computeFunction: GeneralFunction => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearContents = js.Any.fromFunction1(clearContents), computeFunction = js.Any.fromFunction1(computeFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetOperation]
  }
}

