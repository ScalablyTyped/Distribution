package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface specific to spreadsheet data provider backend. */
@js.native
trait XSheetDataProvider extends XInterface {
  def createDataSequenceByFormulaTokens(aTokens: SeqEquiv[FormulaToken]): XDataSequence = js.native
  def createDataSequenceByFormulaTokensPossible(aTokens: SeqEquiv[FormulaToken]): Boolean = js.native
}

object XSheetDataProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDataSequenceByFormulaTokens: SeqEquiv[FormulaToken] => XDataSequence,
    createDataSequenceByFormulaTokensPossible: SeqEquiv[FormulaToken] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetDataProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataSequenceByFormulaTokens = js.Any.fromFunction1(createDataSequenceByFormulaTokens), createDataSequenceByFormulaTokensPossible = js.Any.fromFunction1(createDataSequenceByFormulaTokensPossible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetDataProvider]
  }
  @scala.inline
  implicit class XSheetDataProviderOps[Self <: XSheetDataProvider] (val x: Self) extends AnyVal {
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
    def setCreateDataSequenceByFormulaTokens(value: SeqEquiv[FormulaToken] => XDataSequence): Self = this.set("createDataSequenceByFormulaTokens", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateDataSequenceByFormulaTokensPossible(value: SeqEquiv[FormulaToken] => Boolean): Self = this.set("createDataSequenceByFormulaTokensPossible", js.Any.fromFunction1(value))
  }
  
}

