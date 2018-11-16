package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionEnum extends js.Object

@JSGlobal("ADOX.ActionEnum")
@js.native
object ActionEnum extends js.Object {
  @js.native
  sealed trait adAccessDeny
    extends activexDashAdoxLib.ADOXNs.ActionEnum
  
  @js.native
  sealed trait adAccessGrant
    extends activexDashAdoxLib.ADOXNs.ActionEnum
  
  @js.native
  sealed trait adAccessRevoke
    extends activexDashAdoxLib.ADOXNs.ActionEnum
  
  @js.native
  sealed trait adAccessSet
    extends activexDashAdoxLib.ADOXNs.ActionEnum
  
  /* 3 */ val adAccessDeny: adAccessDeny with scala.Double = js.native
  /* 1 */ val adAccessGrant: adAccessGrant with scala.Double = js.native
  /* 4 */ val adAccessRevoke: adAccessRevoke with scala.Double = js.native
  /* 2 */ val adAccessSet: adAccessSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.ActionEnum with scala.Double] = js.native
}

