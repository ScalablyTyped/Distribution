package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access information about a cell that is mergeable with other sells.
  * @see com.sun.star.table.Cell
  */
trait XMergeableCell extends XCell {
  /** returns the number of rows this cell spans. */
  val ColumnSpan: scala.Double
  /** returns the number of columns this cell spans. */
  val RowSpan: scala.Double
  /** returns the number of rows this cell spans. */
  def getColumnSpan(): scala.Double
  /** returns the number of columns this cell spans. */
  def getRowSpan(): scala.Double
  /** returns `TRUE` if this cell is merged with another cell. */
  def isMerged(): scala.Boolean
}

