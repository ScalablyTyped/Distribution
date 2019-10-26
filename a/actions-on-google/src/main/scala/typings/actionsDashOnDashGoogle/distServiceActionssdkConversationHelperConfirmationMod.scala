package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTCONFIRMATION
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2ConfirmationValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/confirmation", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperConfirmationMod extends js.Object {
  @js.native
  class Confirmation protected () extends Helper[actionsDOTintentDOTCONFIRMATION, GoogleActionsV2ConfirmationValueSpec] {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  type ConfirmationArgument = Boolean
}

