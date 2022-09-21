package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to execute operations on a cell range or ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetOperation
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    acquire: () => Unit,
    clearContents: Double => Unit,
    computeFunction: GeneralFunction => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSheetOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearContents = js.Any.fromFunction1(clearContents), computeFunction = js.Any.fromFunction1(computeFunction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetOperation]
  }
  
  extension [Self <: XSheetOperation](x: Self) {
    
    inline def setClearContents(value: Double => Unit): Self = StObject.set(x, "clearContents", js.Any.fromFunction1(value))
    
    inline def setComputeFunction(value: GeneralFunction => Double): Self = StObject.set(x, "computeFunction", js.Any.fromFunction1(value))
  }
}
