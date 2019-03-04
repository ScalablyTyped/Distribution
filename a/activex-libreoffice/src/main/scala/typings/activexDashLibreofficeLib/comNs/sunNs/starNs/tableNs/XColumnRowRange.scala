package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XColumnRowRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    acquire: js.Function0[scala.Unit],
    getColumns: js.Function0[XTableColumns],
    getRows: js.Function0[XTableRows],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XColumnRowRange = {
    val __obj = js.Dynamic.literal(Columns = Columns, Rows = Rows, acquire = acquire, getColumns = getColumns, getRows = getRows, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XColumnRowRange]
  }
}

