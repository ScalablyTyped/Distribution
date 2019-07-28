package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
trait MalformedNumberFormatException extends Exception {
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: Double
}

object MalformedNumberFormatException {
  @scala.inline
  def apply(CheckPos: Double, Context: XInterface, Message: String): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos, Context = Context, Message = Message)
  
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
}

