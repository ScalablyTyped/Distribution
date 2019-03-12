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
    acquire: () => scala.Unit,
    getColumnSpan: () => scala.Double,
    getError: () => scala.Double,
    getFormula: () => java.lang.String,
    getRowSpan: () => scala.Double,
    getType: () => CellContentType,
    getValue: () => scala.Double,
    isMerged: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormula: java.lang.String => scala.Unit,
    setValue: scala.Double => scala.Unit
  ): XMergeableCell = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan, Error = Error, Formula = Formula, RowSpan = RowSpan, Type = Type, Value = Value, acquire = js.Any.fromFunction0(acquire), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getRowSpan = js.Any.fromFunction0(getRowSpan), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), isMerged = js.Any.fromFunction0(isMerged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XMergeableCell]
  }
}

