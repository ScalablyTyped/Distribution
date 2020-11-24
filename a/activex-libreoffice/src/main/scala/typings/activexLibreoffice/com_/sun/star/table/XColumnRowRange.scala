package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
@js.native
trait XColumnRowRange extends XInterface {
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  val Columns: XTableColumns = js.native
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  val Rows: XTableRows = js.native
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  def getColumns(): XTableColumns = js.native
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  def getRows(): XTableRows = js.native
}
object XColumnRowRange {
  
  @scala.inline
  def apply(
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: () => Unit,
    getColumns: () => XTableColumns,
    getRows: () => XTableRows,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XColumnRowRange = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColumnRowRange]
  }
  
  @scala.inline
  implicit class XColumnRowRangeOps[Self <: XColumnRowRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumns(value: XTableColumns): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: XTableRows): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumns(value: () => XTableColumns): Self = this.set("getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => XTableRows): Self = this.set("getRows", js.Any.fromFunction0(value))
  }
}
