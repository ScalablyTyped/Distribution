package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SignInValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SignInValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signinMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/signin", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn () extends SoloHelper[actionsDotintentDotSIGN_IN, GoogleActionsV2SignInValueSpec] {
    def this(context: String) = this()
  }
  
  type SignInArgument = GoogleActionsV2SignInValue
}
