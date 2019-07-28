package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** converts between text and token representations of formulas. */
trait XFormulaParser extends js.Object {
  /** parses a formula into a sequence of tokens. */
  def parseFormula(aFormula: String, aReferencePos: CellAddress): SafeArray[FormulaToken]
  /** converts a formula into a string. */
  def printFormula(aTokens: SeqEquiv[FormulaToken], aReferencePos: CellAddress): String
}

object XFormulaParser {
  @scala.inline
  def apply(
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
  
    __obj.asInstanceOf[XFormulaParser]
  }
}

