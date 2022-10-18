package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SignInValue
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SignInValueSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperSigninMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/signin", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  open class SignIn () extends SoloHelper[actionsDotintentDotSIGN_IN, GoogleActionsV2SignInValueSpec] {
    def this(context: String) = this()
  }
  
  type SignInArgument = GoogleActionsV2SignInValue
}
