package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SignInValueSpec extends js.Object {
  /**
    * The optional context why the app needs to ask the user to sign in, as a
    * prefix of a prompt for user consent, e.g. \"To track your exercise\", or
    * \"To check your account balance\".
    */
  var optContext: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2SignInValueSpec {
  @scala.inline
  def apply(optContext: String = null): GoogleActionsV2SignInValueSpec = {
    val __obj = js.Dynamic.literal()
    if (optContext != null) __obj.updateDynamic("optContext")(optContext)
    __obj.asInstanceOf[GoogleActionsV2SignInValueSpec]
  }
}

