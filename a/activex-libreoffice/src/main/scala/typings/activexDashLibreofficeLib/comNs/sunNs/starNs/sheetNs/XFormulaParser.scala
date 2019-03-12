package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** converts between text and token representations of formulas. */
trait XFormulaParser extends js.Object {
  /** parses a formula into a sequence of tokens. */
  def parseFormula(
    aFormula: java.lang.String,
    aReferencePos: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  ): stdLib.SafeArray[FormulaToken]
  /** converts a formula into a string. */
  def printFormula(
    aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken],
    aReferencePos: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  ): java.lang.String
}

object XFormulaParser {
  @scala.inline
  def apply(
    parseFormula: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress) => stdLib.SafeArray[FormulaToken],
    printFormula: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken], activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress) => java.lang.String
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
  
    __obj.asInstanceOf[XFormulaParser]
  }
}

