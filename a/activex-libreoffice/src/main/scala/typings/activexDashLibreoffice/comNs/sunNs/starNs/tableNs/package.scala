package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration

  /**
    * represents a cell cursor in a table.
    *
    * A cell cursor is simply a cell range which provides methods to move through the table (i.e. relative to the current position).
    */
  type CellCursor = XCellCursor
  /** defines the binding to a single cell in a table document, which can be used to transfer a list position into the cell. */
  type ListPositionCellBinding = CellValueBinding
  /**
    * represents an enumeration of table charts.
    * @see com.sun.star.table.TableCharts
    */
  type TableChartsEnumeration = XEnumeration
  /**
    * represents an enumeration of table columns.
    * @see com.sun.star.table.TableColumns
    */
  type TableColumnsEnumeration = XEnumeration
  /**
    * represents an enumeration of table rows.
    * @see com.sun.star.table.TableRows
    */
  type TableRowsEnumeration = XEnumeration
}
