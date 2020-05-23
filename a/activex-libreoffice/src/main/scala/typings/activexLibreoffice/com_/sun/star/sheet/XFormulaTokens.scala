package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a formula as token sequence. */
trait XFormulaTokens extends js.Object {
  /** returns the formula as sequence of tokens. */
  var Tokens: SafeArray[FormulaToken]
  /** returns the formula as sequence of tokens. */
  def getTokens(): SafeArray[FormulaToken]
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: SeqEquiv[FormulaToken]): Unit
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
}

