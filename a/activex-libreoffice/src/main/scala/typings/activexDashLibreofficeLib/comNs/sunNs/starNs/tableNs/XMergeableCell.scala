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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnSpan")(ColumnSpan)
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("RowSpan")(RowSpan)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getColumnSpan")(getColumnSpan)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getRowSpan")(getRowSpan)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("isMerged")(isMerged)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[XMergeableCell]
  }
}

