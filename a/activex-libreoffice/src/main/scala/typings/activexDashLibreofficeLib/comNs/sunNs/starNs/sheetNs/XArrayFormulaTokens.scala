package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to an array formula as token sequence. */
trait XArrayFormulaTokens extends js.Object {
  /** returns the array formula as sequence of tokens. */
  var ArrayTokens: activexDashInteropLib.SafeArray[FormulaToken]
  /** returns the array formula as sequence of tokens. */
  def getArrayTokens(): activexDashInteropLib.SafeArray[FormulaToken]
  /** sets the array formula as sequence of tokens. */
  def setArrayTokens(aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken]): scala.Unit
}

