package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
trait MalformedNumberFormatException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: scala.Double
}

object MalformedNumberFormatException {
  @scala.inline
  def apply(
    CheckPos: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos, Context = Context, Message = Message)
  
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
}

