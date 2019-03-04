package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface specific to spreadsheet data provider backend. */
trait XSheetDataProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def createDataSequenceByFormulaTokens(
    aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken]
  ): XDataSequence
  def createDataSequenceByFormulaTokensPossible(
    aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken]
  ): scala.Boolean
}

object XSheetDataProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createDataSequenceByFormulaTokens: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken], 
      XDataSequence
    ],
    createDataSequenceByFormulaTokensPossible: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetDataProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, createDataSequenceByFormulaTokens = createDataSequenceByFormulaTokens, createDataSequenceByFormulaTokensPossible = createDataSequenceByFormulaTokensPossible, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSheetDataProvider]
  }
}

