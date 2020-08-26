package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to an array formula as token sequence. */
@js.native
trait XArrayFormulaTokens extends js.Object {
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
  implicit class XArrayFormulaTokensOps[Self <: XArrayFormulaTokens] (val x: Self) extends AnyVal {
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
    def setArrayTokens(value: SafeArray[FormulaToken]): Self = this.set("ArrayTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetArrayTokens(value: () => SafeArray[FormulaToken]): Self = this.set("getArrayTokens", js.Any.fromFunction0(value))
    @scala.inline
    def setSetArrayTokens(value: SeqEquiv[FormulaToken] => Unit): Self = this.set("setArrayTokens", js.Any.fromFunction1(value))
  }
  
}

