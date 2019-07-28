package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to get and set cell contents (values, text or formulas) for a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  * @since OOo 1.1.2
  */
trait XCellRangeFormula extends XInterface {
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
  @scala.inline
  def apply(
    FormulaArray: SafeArray[SafeArray[String]],
    acquire: () => Unit,
    getFormulaArray: () => SafeArray[SafeArray[String]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormulaArray: SeqEquiv[SeqEquiv[String]] => Unit
  ): XCellRangeFormula = {
    val __obj = js.Dynamic.literal(FormulaArray = FormulaArray, acquire = js.Any.fromFunction0(acquire), getFormulaArray = js.Any.fromFunction0(getFormulaArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormulaArray = js.Any.fromFunction1(setFormulaArray))
  
    __obj.asInstanceOf[XCellRangeFormula]
  }
}

