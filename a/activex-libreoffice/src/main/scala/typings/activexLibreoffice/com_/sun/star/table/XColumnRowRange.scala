package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XColumnRowRange extends XInterface {
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
}

