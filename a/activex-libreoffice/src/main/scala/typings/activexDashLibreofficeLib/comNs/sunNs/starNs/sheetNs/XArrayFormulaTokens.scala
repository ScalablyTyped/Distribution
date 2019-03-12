package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to an array formula as token sequence. */
trait XArrayFormulaTokens extends js.Object {
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: stdLib.SafeArray[FormulaToken]
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): stdLib.SafeArray[FormulaToken]
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken]): scala.Unit
}

object XArrayFormulaTokens {
  @scala.inline
  def apply(
    ArrayTokens: stdLib.SafeArray[FormulaToken],
    getArrayTokens: () => stdLib.SafeArray[FormulaToken],
    setArrayTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken] => scala.Unit
  ): XArrayFormulaTokens = {
    val __obj = js.Dynamic.literal(ArrayTokens = ArrayTokens, getArrayTokens = js.Any.fromFunction0(getArrayTokens), setArrayTokens = js.Any.fromFunction1(setArrayTokens))
  
    __obj.asInstanceOf[XArrayFormulaTokens]
  }
}

