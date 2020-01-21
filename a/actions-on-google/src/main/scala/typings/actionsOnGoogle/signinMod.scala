package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN
import typings.actionsOnGoogle.helperHelperMod.Helper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SignInValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SignInValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/signin", JSImport.Namespace)
@js.native
object signinMod extends js.Object {
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn () extends Helper[actionsDotintentDotSIGN_IN, GoogleActionsV2SignInValueSpec] {
    def this(context: String) = this()
  }
  
  type SignInArgument = GoogleActionsV2SignInValue
}

