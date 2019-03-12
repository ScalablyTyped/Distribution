package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to get and set cell contents (values, text or formulas) for a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  * @since OOo 1.1.2
  */
trait XCellRangeFormula
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  var FormulaArray: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  def getFormulaArray(): stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array is interpreted the same way as the argument to a
    * {@link com.sun.star.table.XCell.setFormula()} call for the corresponding cell.
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setFormulaArray(
    aArray: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Unit
}

object XCellRangeFormula {
  @scala.inline
  def apply(
    FormulaArray: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    acquire: () => scala.Unit,
    getFormulaArray: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormulaArray: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Unit
  ): XCellRangeFormula = {
    val __obj = js.Dynamic.literal(FormulaArray = FormulaArray, acquire = js.Any.fromFunction0(acquire), getFormulaArray = js.Any.fromFunction0(getFormulaArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormulaArray = js.Any.fromFunction1(setFormulaArray))
  
    __obj.asInstanceOf[XCellRangeFormula]
  }
}

