package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to an array formula as token sequence. */
@js.native
trait XArrayFormulaTokens extends StObject {
  
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: SafeArray[FormulaToken] = js.native
  
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): SafeArray[FormulaToken] = js.native
  
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: SeqEquiv[FormulaToken]): Unit = js.native
}
object XArrayFormulaTokens {
  
  @scala.inline
  def apply(
    ArrayTokens: SafeArray[FormulaToken],
    getArrayTokens: () => SafeArray[FormulaToken],
    setArrayTokens: SeqEquiv[FormulaToken] => Unit
  ): XArrayFormulaTokens = {
    val __obj = js.Dynamic.literal(ArrayTokens = ArrayTokens.asInstanceOf[js.Any], getArrayTokens = js.Any.fromFunction0(getArrayTokens), setArrayTokens = js.Any.fromFunction1(setArrayTokens))
    __obj.asInstanceOf[XArrayFormulaTokens]
  }
  
  @scala.inline
  implicit class XArrayFormulaTokensMutableBuilder[Self <: XArrayFormulaTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayTokens(value: SafeArray[FormulaToken]): Self = StObject.set(x, "ArrayTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArrayTokens(value: () => SafeArray[FormulaToken]): Self = StObject.set(x, "getArrayTokens", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetArrayTokens(value: SeqEquiv[FormulaToken] => Unit): Self = StObject.set(x, "setArrayTokens", js.Any.fromFunction1(value))
  }
}
