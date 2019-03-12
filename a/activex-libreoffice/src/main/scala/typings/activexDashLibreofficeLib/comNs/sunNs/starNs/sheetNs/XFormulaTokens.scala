package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a formula as token sequence. */
trait XFormulaTokens extends js.Object {
  /** returns the formula as sequence of tokens. */
  var Tokens: stdLib.SafeArray[FormulaToken]
  /** returns the formula as sequence of tokens. */
  def getTokens(): stdLib.SafeArray[FormulaToken]
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken]): scala.Unit
}

object XFormulaTokens {
  @scala.inline
  def apply(
    Tokens: stdLib.SafeArray[FormulaToken],
    getTokens: () => stdLib.SafeArray[FormulaToken],
    setTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken] => scala.Unit
  ): XFormulaTokens = {
    val __obj = js.Dynamic.literal(Tokens = Tokens, getTokens = js.Any.fromFunction0(getTokens), setTokens = js.Any.fromFunction1(setTokens))
  
    __obj.asInstanceOf[XFormulaTokens]
  }
}

