package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XCell} methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
@js.native
trait XCell2 extends XCell {
  /**
    * sets a formula result into the cell.
    *
    * When assigned, the formula cell's result will be set to this value and will not be calculated - unless a HardRecalc is executed.
    */
  def setFormulaResult(nValue: Double): Unit = js.native
  /**
    * sets a formula string into the cell.
    *
    * When assigned, the formula is set into the string. But is not compiled, tokenized or calculated. Its useful when loading a document and {@link
    * setFormulaResult()} is used. Otherwise it is compiled on trying to fetch a result value.
    */
  def setFormulaString(aFormula: String): Unit = js.native
}

object XCell2 {
  @scala.inline
  def apply(
    Error: Double,
    Formula: String,
    Type: CellContentType,
    Value: Double,
    acquire: () => Unit,
    getError: () => Double,
    getFormula: () => String,
    getType: () => CellContentType,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula: String => Unit,
    setFormulaResult: Double => Unit,
    setFormulaString: String => Unit,
    setValue: Double => Unit
  ): XCell2 = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setFormulaResult = js.Any.fromFunction1(setFormulaResult), setFormulaString = js.Any.fromFunction1(setFormulaString), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XCell2]
  }
  @scala.inline
  implicit class XCell2Ops[Self <: XCell2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetFormulaResult(value: Double => Unit): Self = this.set("setFormulaResult", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFormulaString(value: String => Unit): Self = this.set("setFormulaString", js.Any.fromFunction1(value))
  }
  
}

