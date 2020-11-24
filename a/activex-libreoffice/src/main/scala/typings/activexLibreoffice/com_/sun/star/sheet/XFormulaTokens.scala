package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a formula as token sequence. */
@js.native
trait XFormulaTokens extends js.Object {
  
  /** returns the formula as sequence of tokens. */
  var Tokens: SafeArray[FormulaToken] = js.native
  
  /** returns the formula as sequence of tokens. */
  def getTokens(): SafeArray[FormulaToken] = js.native
  
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: SeqEquiv[FormulaToken]): Unit = js.native
}
object XFormulaTokens {
  
  @scala.inline
  def apply(
    Tokens: SafeArray[FormulaToken],
    getTokens: () => SafeArray[FormulaToken],
    setTokens: SeqEquiv[FormulaToken] => Unit
  ): XFormulaTokens = {
    val __obj = js.Dynamic.literal(Tokens = Tokens.asInstanceOf[js.Any], getTokens = js.Any.fromFunction0(getTokens), setTokens = js.Any.fromFunction1(setTokens))
    __obj.asInstanceOf[XFormulaTokens]
  }
  
  @scala.inline
  implicit class XFormulaTokensOps[Self <: XFormulaTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTokens(value: SafeArray[FormulaToken]): Self = this.set("Tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTokens(value: () => SafeArray[FormulaToken]): Self = this.set("getTokens", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTokens(value: SeqEquiv[FormulaToken] => Unit): Self = this.set("setTokens", js.Any.fromFunction1(value))
  }
}
