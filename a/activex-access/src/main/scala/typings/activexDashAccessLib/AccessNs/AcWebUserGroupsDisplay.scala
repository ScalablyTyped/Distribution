package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcWebUserGroupsDisplay extends js.Object

@JSGlobal("Access.AcWebUserGroupsDisplay")
@js.native
object AcWebUserGroupsDisplay extends js.Object {
  @js.native
  sealed trait acWebUserGroupID
    extends activexDashAccessLib.AccessNs.AcWebUserGroupsDisplay
  
  @js.native
  sealed trait acWebUserGroupName
    extends activexDashAccessLib.AccessNs.AcWebUserGroupsDisplay
  
  /* 0 */ val acWebUserGroupID: acWebUserGroupID with scala.Double = js.native
  /* 1 */ val acWebUserGroupName: acWebUserGroupName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcWebUserGroupsDisplay with scala.Double] = js.native
}

