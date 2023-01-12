package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** converts between text and token representations of formulas. */
trait XFormulaParser extends StObject {
  
  /** parses a formula into a sequence of tokens. */
  def parseFormula(aFormula: String, aReferencePos: CellAddress): SafeArray[FormulaToken]
  
  /** converts a formula into a string. */
  def printFormula(aTokens: SeqEquiv[FormulaToken], aReferencePos: CellAddress): String
}
object XFormulaParser {
  
  inline def apply(
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
    __obj.asInstanceOf[XFormulaParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XFormulaParser] (val x: Self) extends AnyVal {
    
    inline def setParseFormula(value: (String, CellAddress) => SafeArray[FormulaToken]): Self = StObject.set(x, "parseFormula", js.Any.fromFunction2(value))
    
    inline def setPrintFormula(value: (SeqEquiv[FormulaToken], CellAddress) => String): Self = StObject.set(x, "printFormula", js.Any.fromFunction2(value))
  }
}
