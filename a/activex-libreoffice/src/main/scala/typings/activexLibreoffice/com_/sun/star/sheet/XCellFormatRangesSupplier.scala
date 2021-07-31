package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XCellFormatRangesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  val CellFormatRanges: XIndexAccess
  
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  def getCellFormatRanges(): XIndexAccess
}
object XCellFormatRangesSupplier {
  
  @scala.inline
  def apply(
    CellFormatRanges: XIndexAccess,
    acquire: () => Unit,
    getCellFormatRanges: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(CellFormatRanges = CellFormatRanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCellFormatRanges = js.Any.fromFunction0(getCellFormatRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellFormatRangesSupplier]
  }
  
  @scala.inline
  implicit class XCellFormatRangesSupplierMutableBuilder[Self <: XCellFormatRangesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellFormatRanges(value: XIndexAccess): Self = StObject.set(x, "CellFormatRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellFormatRanges(value: () => XIndexAccess): Self = StObject.set(x, "getCellFormatRanges", js.Any.fromFunction0(value))
  }
}
