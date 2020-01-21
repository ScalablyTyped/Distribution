package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION
import typings.actionsOnGoogle.helperHelperMod.Helper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ConfirmationValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/confirmation", JSImport.Namespace)
@js.native
object confirmationMod extends js.Object {
  @js.native
  class Confirmation protected () extends Helper[actionsDotintentDotCONFIRMATION, GoogleActionsV2ConfirmationValueSpec] {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  type ConfirmationArgument = Boolean
}

