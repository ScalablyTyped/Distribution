package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.FormulaToken
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface specific to spreadsheet data provider backend. */
trait XSheetDataProvider extends XInterface {
  def createDataSequenceByFormulaTokens(aTokens: SeqEquiv[FormulaToken]): XDataSequence
  def createDataSequenceByFormulaTokensPossible(aTokens: SeqEquiv[FormulaToken]): Boolean
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
}

