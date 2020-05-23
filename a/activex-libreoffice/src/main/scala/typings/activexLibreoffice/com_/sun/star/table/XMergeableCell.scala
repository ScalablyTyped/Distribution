package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access information about a cell that is mergeable with other sells.
  * @see com.sun.star.table.Cell
  */
trait XMergeableCell extends XCell {
  /** returns the number of rows this cell spans. */
  val ColumnSpan: Double
  /** returns the number of columns this cell spans. */
  val RowSpan: Double
  /** returns the number of rows this cell spans. */
  def getColumnSpan(): Double
  /** returns the number of columns this cell spans. */
  def getRowSpan(): Double
  /** returns `TRUE` if this cell is merged with another cell. */
  def isMerged(): Boolean
}

object XMergeableCell {
  @scala.inline
  def apply(
    ColumnSpan: Double,
    Error: Double,
    Formula: String,
    RowSpan: Double,
    Type: CellContentType,
    Value: Double,
    acquire: () => Unit,
    getColumnSpan: () => Double,
    getError: () => Double,
    getFormula: () => String,
    getRowSpan: () => Double,
    getType: () => CellContentType,
    getValue: () => Double,
    isMerged: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula: String => Unit,
    setValue: Double => Unit
  ): XMergeableCell = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], RowSpan = RowSpan.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getRowSpan = js.Any.fromFunction0(getRowSpan), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), isMerged = js.Any.fromFunction0(isMerged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XMergeableCell]
  }
}

