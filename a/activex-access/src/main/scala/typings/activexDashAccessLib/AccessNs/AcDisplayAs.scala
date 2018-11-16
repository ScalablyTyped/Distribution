package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcDisplayAs extends js.Object

@JSGlobal("Access.AcDisplayAs")
@js.native
object AcDisplayAs extends js.Object {
  @js.native
  sealed trait acDisplayAsIcon
    extends activexDashAccessLib.AccessNs.AcDisplayAs
  
  @js.native
  sealed trait acDisplayAsImageIcon
    extends activexDashAccessLib.AccessNs.AcDisplayAs
  
  @js.native
  sealed trait acDisplayAsPaperclip
    extends activexDashAccessLib.AccessNs.AcDisplayAs
  
  /* 1 */ val acDisplayAsIcon: acDisplayAsIcon with scala.Double = js.native
  /* 0 */ val acDisplayAsImageIcon: acDisplayAsImageIcon with scala.Double = js.native
  /* 2 */ val acDisplayAsPaperclip: acDisplayAsPaperclip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcDisplayAs with scala.Double] = js.native
}

