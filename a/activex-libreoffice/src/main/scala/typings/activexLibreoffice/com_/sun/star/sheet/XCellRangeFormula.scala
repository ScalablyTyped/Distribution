package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XCellRangeFormula extends XInterface {
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  var FormulaArray: SafeArray[SafeArray[String]] = js.native
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains the same string that would be returned by {@link com.sun.star.table.XCell.getFormula()} for the corresponding
    * cell.
    */
  def getFormulaArray(): SafeArray[SafeArray[String]] = js.native
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array is interpreted the same way as the argument to a
    * {@link com.sun.star.table.XCell.setFormula()} call for the corresponding cell.
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setFormulaArray(aArray: SeqEquiv[SeqEquiv[String]]): Unit = js.native
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
    val __obj = js.Dynamic.literal(FormulaArray = FormulaArray.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFormulaArray = js.Any.fromFunction0(getFormulaArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormulaArray = js.Any.fromFunction1(setFormulaArray))
    __obj.asInstanceOf[XCellRangeFormula]
  }
  @scala.inline
  implicit class XCellRangeFormulaOps[Self <: XCellRangeFormula] (val x: Self) extends AnyVal {
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
    def setFormulaArray(value: SafeArray[SafeArray[String]]): Self = this.set("FormulaArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFormulaArray(value: () => SafeArray[SafeArray[String]]): Self = this.set("getFormulaArray", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFormulaArray(value: SeqEquiv[SeqEquiv[String]] => Unit): Self = this.set("setFormulaArray", js.Any.fromFunction1(value))
  }
  
}

