package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTSIGN_IN
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SignInValue
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SignInValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/signin", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperSigninMod extends js.Object {
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn () extends Helper[actionsDOTintentDOTSIGN_IN, GoogleActionsV2SignInValueSpec] {
    def this(context: String) = this()
  }
  
  type SignInArgument = GoogleActionsV2SignInValue
}

