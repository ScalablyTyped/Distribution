package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSearchDirection extends js.Object

@JSGlobal("Access.AcSearchDirection")
@js.native
object AcSearchDirection extends js.Object {
  @js.native
  sealed trait acDown
    extends activexDashAccessLib.AccessNs.AcSearchDirection
  
  @js.native
  sealed trait acSearchAll
    extends activexDashAccessLib.AccessNs.AcSearchDirection
  
  @js.native
  sealed trait acUp
    extends activexDashAccessLib.AccessNs.AcSearchDirection
  
  /* 1 */ val acDown: acDown with scala.Double = js.native
  /* 2 */ val acSearchAll: acSearchAll with scala.Double = js.native
  /* 0 */ val acUp: acUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSearchDirection with scala.Double] = js.native
}

