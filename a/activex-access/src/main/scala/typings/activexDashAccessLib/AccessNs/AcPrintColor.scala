package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintColor extends js.Object

@JSGlobal("Access.AcPrintColor")
@js.native
object AcPrintColor extends js.Object {
  @js.native
  sealed trait acPRCMColor
    extends activexDashAccessLib.AccessNs.AcPrintColor
  
  @js.native
  sealed trait acPRCMMonochrome
    extends activexDashAccessLib.AccessNs.AcPrintColor
  
  /* 2 */ val acPRCMColor: acPRCMColor with scala.Double = js.native
  /* 1 */ val acPRCMMonochrome: acPRCMMonochrome with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintColor with scala.Double] = js.native
}

