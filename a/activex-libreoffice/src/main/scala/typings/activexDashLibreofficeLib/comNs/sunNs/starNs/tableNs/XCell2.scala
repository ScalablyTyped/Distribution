package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XCell} methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell2 extends XCell {
  /**
    * sets a formula result into the cell.
    *
    * When assigned, the formula cell's result will be set to this value and will not be calculated - unless a HardRecalc is executed.
    */
  def setFormulaResult(nValue: scala.Double): scala.Unit
  /**
    * sets a formula string into the cell.
    *
    * When assigned, the formula is set into the string. But is not compiled, tokenized or calculated. Its useful when loading a document and {@link
    * setFormulaResult()} is used. Otherwise it is compiled on trying to fetch a result value.
    */
  def setFormulaString(aFormula: java.lang.String): scala.Unit
}

object XCell2 {
  @scala.inline
  def apply(
    Error: scala.Double,
    Formula: java.lang.String,
    Type: CellContentType,
    Value: scala.Double,
    acquire: js.Function0[scala.Unit],
    getError: js.Function0[scala.Double],
    getFormula: js.Function0[java.lang.String],
    getType: js.Function0[CellContentType],
    getValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setFormulaResult: js.Function1[scala.Double, scala.Unit],
    setFormulaString: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): XCell2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setFormulaResult")(setFormulaResult)
    __obj.updateDynamic("setFormulaString")(setFormulaString)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[XCell2]
  }
}

