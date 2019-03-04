package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a formula as token sequence. */
trait XFormulaTokens extends js.Object {
  /** returns the formula as sequence of tokens. */
  var Tokens: activexDashInteropLib.SafeArray[FormulaToken]
  /** returns the formula as sequence of tokens. */
  def getTokens(): activexDashInteropLib.SafeArray[FormulaToken]
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken]): scala.Unit
}

object XFormulaTokens {
  @scala.inline
  def apply(
    Tokens: activexDashInteropLib.SafeArray[FormulaToken],
    getTokens: js.Function0[activexDashInteropLib.SafeArray[FormulaToken]],
    setTokens: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken], scala.Unit]
  ): XFormulaTokens = {
    val __obj = js.Dynamic.literal(Tokens = Tokens, getTokens = getTokens, setTokens = setTokens)
  
    __obj.asInstanceOf[XFormulaTokens]
  }
}

