package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XColumnRowRange
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  val Columns: XTableColumns
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  val Rows: XTableRows
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  def getColumns(): XTableColumns
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  def getRows(): XTableRows
}
object XColumnRowRange {
  
  inline def apply(
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: () => Unit,
    getColumns: () => XTableColumns,
    getRows: () => XTableRows,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XColumnRowRange = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColumnRowRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XColumnRowRange] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: XTableColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumns(value: () => XTableColumns): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    inline def setGetRows(value: () => XTableRows): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    inline def setRows(value: XTableRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
