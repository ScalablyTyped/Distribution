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
  ): activexDashInteropLib.SafeArray[FormulaToken]
  /** converts a formula into a string. */
  def printFormula(
    aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken],
    aReferencePos: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  ): java.lang.String
}

object XFormulaParser {
  @scala.inline
  def apply(
    parseFormula: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      activexDashInteropLib.SafeArray[FormulaToken]
    ],
    printFormula: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String
    ]
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseFormula")(parseFormula)
    __obj.updateDynamic("printFormula")(printFormula)
    __obj.asInstanceOf[XFormulaParser]
  }
}

