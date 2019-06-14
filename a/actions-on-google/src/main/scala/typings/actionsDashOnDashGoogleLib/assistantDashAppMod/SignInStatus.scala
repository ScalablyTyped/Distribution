package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignInStatus extends js.Object

@JSImport("actions-on-google/assistant-app", "SignInStatus")
@js.native
object SignInStatus extends js.Object {
  /**
    * Cancelled or dismissed account linking.
    */
  @js.native
  sealed trait CANCELLED
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus
  
  /**
    * System or network error.
    */
  @js.native
  sealed trait ERROR
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus
  
  /**
    * User successfully completed the account linking.
    */
  @js.native
  sealed trait OK
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus
  
  /**
    * Unknown status.
    */
  @js.native
  sealed trait UNSPECIFIED
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus
  
  /* 2 */ val CANCELLED: CANCELLED with scala.Double = js.native
  /* 3 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus with scala.Double] = js.native
}

