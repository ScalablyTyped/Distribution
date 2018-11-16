package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcWebUserDisplay extends js.Object

@JSGlobal("Access.AcWebUserDisplay")
@js.native
object AcWebUserDisplay extends js.Object {
  @js.native
  sealed trait acWebUserEmail
    extends activexDashAccessLib.AccessNs.AcWebUserDisplay
  
  @js.native
  sealed trait acWebUserID
    extends activexDashAccessLib.AccessNs.AcWebUserDisplay
  
  @js.native
  sealed trait acWebUserLoginName
    extends activexDashAccessLib.AccessNs.AcWebUserDisplay
  
  @js.native
  sealed trait acWebUserName
    extends activexDashAccessLib.AccessNs.AcWebUserDisplay
  
  /* 3 */ val acWebUserEmail: acWebUserEmail with scala.Double = js.native
  /* 0 */ val acWebUserID: acWebUserID with scala.Double = js.native
  /* 2 */ val acWebUserLoginName: acWebUserLoginName with scala.Double = js.native
  /* 1 */ val acWebUserName: acWebUserName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcWebUserDisplay with scala.Double] = js.native
}

