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
    acquire: () => scala.Unit,
    getError: () => scala.Double,
    getFormula: () => java.lang.String,
    getType: () => CellContentType,
    getValue: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormula: java.lang.String => scala.Unit,
    setFormulaResult: scala.Double => scala.Unit,
    setFormulaString: java.lang.String => scala.Unit,
    setValue: scala.Double => scala.Unit
  ): XCell2 = {
    val __obj = js.Dynamic.literal(Error = Error, Formula = Formula, Type = Type, Value = Value, acquire = js.Any.fromFunction0(acquire), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setFormulaResult = js.Any.fromFunction1(setFormulaResult), setFormulaString = js.Any.fromFunction1(setFormulaString), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XCell2]
  }
}

