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

object XMergeableCell {
  @scala.inline
  def apply(
    ColumnSpan: scala.Double,
    Error: scala.Double,
    Formula: java.lang.String,
    RowSpan: scala.Double,
    Type: CellContentType,
    Value: scala.Double,
    acquire: js.Function0[scala.Unit],
    getColumnSpan: js.Function0[scala.Double],
    getError: js.Function0[scala.Double],
    getFormula: js.Function0[java.lang.String],
    getRowSpan: js.Function0[scala.Double],
    getType: js.Function0[CellContentType],
    getValue: js.Function0[scala.Double],
    isMerged: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): XMergeableCell = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan, Error = Error, Formula = Formula, RowSpan = RowSpan, Type = Type, Value = Value, acquire = acquire, getColumnSpan = getColumnSpan, getError = getError, getFormula = getFormula, getRowSpan = getRowSpan, getType = getType, getValue = getValue, isMerged = isMerged, queryInterface = queryInterface, release = release, setFormula = setFormula, setValue = setValue)
  
    __obj.asInstanceOf[XMergeableCell]
  }
}

