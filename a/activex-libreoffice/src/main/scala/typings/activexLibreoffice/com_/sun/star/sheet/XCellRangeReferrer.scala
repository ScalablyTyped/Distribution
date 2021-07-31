package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows direct access to the cells in a named range or to the cells which are visible in a view, without the need to get the document object first.
  * @see com.sun.star.sheet.NamedRange
  * @see com.sun.star.sheet.DatabaseRange
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XCellRangeReferrer
  extends StObject
     with XInterface {
  
  /** returns the cell range object that is represented. */
  val ReferredCells: XCellRange
  
  /** returns the cell range object that is represented. */
  def getReferredCells(): XCellRange
}
object XCellRangeReferrer {
  
  @scala.inline
  def apply(
    ReferredCells: XCellRange,
    acquire: () => Unit,
    getReferredCells: () => XCellRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangeReferrer = {
    val __obj = js.Dynamic.literal(ReferredCells = ReferredCells.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReferredCells = js.Any.fromFunction0(getReferredCells), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangeReferrer]
  }
  
  @scala.inline
  implicit class XCellRangeReferrerMutableBuilder[Self <: XCellRangeReferrer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReferredCells(value: () => XCellRange): Self = StObject.set(x, "getReferredCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReferredCells(value: XCellRange): Self = StObject.set(x, "ReferredCells", value.asInstanceOf[js.Any])
  }
}
