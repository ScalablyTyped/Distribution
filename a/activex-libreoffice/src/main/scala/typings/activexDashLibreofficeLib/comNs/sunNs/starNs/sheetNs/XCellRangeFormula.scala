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
  var FormulaArray: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  def getFormulaArray(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
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
    FormulaArray: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]],
    acquire: js.Function0[scala.Unit],
    getFormulaArray: js.Function0[
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[java.lang.String]]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormulaArray: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Unit
    ]
  ): XCellRangeFormula = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FormulaArray")(FormulaArray)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFormulaArray")(getFormulaArray)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFormulaArray")(setFormulaArray)
    __obj.asInstanceOf[XCellRangeFormula]
  }
}

