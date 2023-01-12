package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to find the used area of the entire sheet.
  *
  * The used area is the smallest cell range that contains all cells of the spreadsheet with any contents (values, text, formulas) or visible formatting
  * (borders and background color).
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XUsedAreaCursor
  extends StObject
     with XInterface {
  
  /**
    * points the cursor to the end of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoEndOfUsedArea(bExpand: Boolean): Unit
  
  /**
    * points the cursor to the start of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoStartOfUsedArea(bExpand: Boolean): Unit
}
object XUsedAreaCursor {
  
  inline def apply(
    acquire: () => Unit,
    gotoEndOfUsedArea: Boolean => Unit,
    gotoStartOfUsedArea: Boolean => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XUsedAreaCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), gotoEndOfUsedArea = js.Any.fromFunction1(gotoEndOfUsedArea), gotoStartOfUsedArea = js.Any.fromFunction1(gotoStartOfUsedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUsedAreaCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XUsedAreaCursor] (val x: Self) extends AnyVal {
    
    inline def setGotoEndOfUsedArea(value: Boolean => Unit): Self = StObject.set(x, "gotoEndOfUsedArea", js.Any.fromFunction1(value))
    
    inline def setGotoStartOfUsedArea(value: Boolean => Unit): Self = StObject.set(x, "gotoStartOfUsedArea", js.Any.fromFunction1(value))
  }
}
