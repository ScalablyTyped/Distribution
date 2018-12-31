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
  
  val CANCELLED: CANCELLED with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val UNSPECIFIED: UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.SignInStatus with java.lang.String
  ] = js.native
}

