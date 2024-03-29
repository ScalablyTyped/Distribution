package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to an array formula as token sequence. */
trait XArrayFormulaTokens extends StObject {
  
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: SafeArray[FormulaToken]
  
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): SafeArray[FormulaToken]
  
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: SeqEquiv[FormulaToken]): Unit
}
object XArrayFormulaTokens {
  
  inline def apply(
    ArrayTokens: SafeArray[FormulaToken],
    getArrayTokens: () => SafeArray[FormulaToken],
    setArrayTokens: SeqEquiv[FormulaToken] => Unit
  ): XArrayFormulaTokens = {
    val __obj = js.Dynamic.literal(ArrayTokens = ArrayTokens.asInstanceOf[js.Any], getArrayTokens = js.Any.fromFunction0(getArrayTokens), setArrayTokens = js.Any.fromFunction1(setArrayTokens))
    __obj.asInstanceOf[XArrayFormulaTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XArrayFormulaTokens] (val x: Self) extends AnyVal {
    
    inline def setArrayTokens(value: SafeArray[FormulaToken]): Self = StObject.set(x, "ArrayTokens", value.asInstanceOf[js.Any])
    
    inline def setGetArrayTokens(value: () => SafeArray[FormulaToken]): Self = StObject.set(x, "getArrayTokens", js.Any.fromFunction0(value))
    
    inline def setSetArrayTokens(value: SeqEquiv[FormulaToken] => Unit): Self = StObject.set(x, "setArrayTokens", js.Any.fromFunction1(value))
  }
}
