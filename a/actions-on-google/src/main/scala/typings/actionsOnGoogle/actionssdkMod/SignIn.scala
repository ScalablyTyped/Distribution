package typings.actionsOnGoogle.actionssdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "SignIn")
@js.native
/**
  * @param context The optional context why the app needs to ask the user to sign in, as a
  *     prefix of a prompt for user consent, e.g. "To track your exercise", or
  *     "To check your account balance".
  * @public
  */
class SignIn ()
  extends typings.actionsOnGoogle.conversationMod.SignIn {
  def this(context: String) = this()
}

