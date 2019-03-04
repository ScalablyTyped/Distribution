package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the interface {@link XFormulaParser} by an attribute that specifies the namespace URL of the supported formula language. */
trait XFilterFormulaParser extends XFormulaParser {
  /** Specifies the namespace URL of the formula language supported by this implementation. */
  var SupportedNamespace: java.lang.String
}

object XFilterFormulaParser {
  @scala.inline
  def apply(
    SupportedNamespace: java.lang.String,
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
  ): XFilterFormulaParser = {
    val __obj = js.Dynamic.literal(SupportedNamespace = SupportedNamespace, parseFormula = parseFormula, printFormula = printFormula)
  
    __obj.asInstanceOf[XFilterFormulaParser]
  }
}

