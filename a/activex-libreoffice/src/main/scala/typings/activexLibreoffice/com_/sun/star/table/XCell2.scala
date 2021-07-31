package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XCell} methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell2
  extends StObject
     with XCell {
  
  /**
    * sets a formula result into the cell.
    *
    * When assigned, the formula cell's result will be set to this value and will not be calculated - unless a HardRecalc is executed.
    */
  def setFormulaResult(nValue: Double): Unit
  
  /**
    * sets a formula string into the cell.
    *
    * When assigned, the formula is set into the string. But is not compiled, tokenized or calculated. Its useful when loading a document and {@link
    * setFormulaResult()} is used. Otherwise it is compiled on trying to fetch a result value.
    */
  def setFormulaString(aFormula: String): Unit
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
  implicit class XCell2MutableBuilder[Self <: XCell2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetFormulaResult(value: Double => Unit): Self = StObject.set(x, "setFormulaResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormulaString(value: String => Unit): Self = StObject.set(x, "setFormulaString", js.Any.fromFunction1(value))
  }
}
