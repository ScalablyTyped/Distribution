package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extends the interface {@link XFormulaParser} by an attribute that specifies the namespace URL of the supported formula language. */
trait XFilterFormulaParser extends XFormulaParser {
  /** Specifies the namespace URL of the formula language supported by this implementation. */
  var SupportedNamespace: String
}

object XFilterFormulaParser {
  @scala.inline
  def apply(
    SupportedNamespace: String,
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String
  ): XFilterFormulaParser = {
    val __obj = js.Dynamic.literal(SupportedNamespace = SupportedNamespace.asInstanceOf[js.Any], parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
    __obj.asInstanceOf[XFilterFormulaParser]
  }
}

