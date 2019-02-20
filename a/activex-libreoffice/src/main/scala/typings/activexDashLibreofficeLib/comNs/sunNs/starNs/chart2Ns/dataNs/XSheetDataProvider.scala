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

