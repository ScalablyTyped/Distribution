package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to get and set cell contents (values, text or formulas) for a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  * @since OOo 1.1.2
  */
trait XCellRangeFormula
  extends StObject
     with XInterface {
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  var FormulaArray: SafeArray[SafeArray[String]]
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  def getFormulaArray(): SafeArray[SafeArray[String]]
  
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array is interpreted the same way as the argument to a
    * {@link com.sun.star.table.XCell.setFormula()} call for the corresponding cell.
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setFormulaArray(aArray: SeqEquiv[SeqEquiv[String]]): Unit
}
object XCellRangeFormula {
  
  inline def apply(
    FormulaArray: SafeArray[SafeArray[String]],
    acquire: () => Unit,
    getFormulaArray: () => SafeArray[SafeArray[String]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormulaArray: SeqEquiv[SeqEquiv[String]] => Unit
  ): XCellRangeFormula = {
    val __obj = js.Dynamic.literal(FormulaArray = FormulaArray.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFormulaArray = js.Any.fromFunction0(getFormulaArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormulaArray = js.Any.fromFunction1(setFormulaArray))
    __obj.asInstanceOf[XCellRangeFormula]
  }
  
  extension [Self <: XCellRangeFormula](x: Self) {
    
    inline def setFormulaArray(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "FormulaArray", value.asInstanceOf[js.Any])
    
    inline def setGetFormulaArray(value: () => SafeArray[SafeArray[String]]): Self = StObject.set(x, "getFormulaArray", js.Any.fromFunction0(value))
    
    inline def setSetFormulaArray(value: SeqEquiv[SeqEquiv[String]] => Unit): Self = StObject.set(x, "setFormulaArray", js.Any.fromFunction1(value))
  }
}
