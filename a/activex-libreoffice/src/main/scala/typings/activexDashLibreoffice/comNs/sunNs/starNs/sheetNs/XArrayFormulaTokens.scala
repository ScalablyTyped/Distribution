package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to an array formula as token sequence. */
trait XArrayFormulaTokens extends js.Object {
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: SafeArray[FormulaToken]
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): SafeArray[FormulaToken]
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: SeqEquiv[FormulaToken]): Unit
}

object XArrayFormulaTokens {
  @scala.inline
  def apply(
    ArrayTokens: SafeArray[FormulaToken],
    getArrayTokens: () => SafeArray[FormulaToken],
    setArrayTokens: SeqEquiv[FormulaToken] => Unit
  ): XArrayFormulaTokens = {
    val __obj = js.Dynamic.literal(ArrayTokens = ArrayTokens, getArrayTokens = js.Any.fromFunction0(getArrayTokens), setArrayTokens = js.Any.fromFunction1(setArrayTokens))
  
    __obj.asInstanceOf[XArrayFormulaTokens]
  }
}

