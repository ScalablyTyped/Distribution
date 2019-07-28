package typings.actionsDashOnDashGoogle.assistantDashAppMod

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
  sealed trait CANCELLED extends SignInStatus
  
  /**
    * System or network error.
    */
  @js.native
  sealed trait ERROR extends SignInStatus
  
  /**
    * User successfully completed the account linking.
    */
  @js.native
  sealed trait OK extends SignInStatus
  
  /**
    * Unknown status.
    */
  @js.native
  sealed trait UNSPECIFIED extends SignInStatus
  
  /* 2 */ val CANCELLED: typings.actionsDashOnDashGoogle.assistantDashAppMod.SignInStatus.CANCELLED with Double = js.native
  /* 3 */ val ERROR: typings.actionsDashOnDashGoogle.assistantDashAppMod.SignInStatus.ERROR with Double = js.native
  /* 1 */ val OK: typings.actionsDashOnDashGoogle.assistantDashAppMod.SignInStatus.OK with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.assistantDashAppMod.SignInStatus.UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignInStatus with Double] = js.native
}

