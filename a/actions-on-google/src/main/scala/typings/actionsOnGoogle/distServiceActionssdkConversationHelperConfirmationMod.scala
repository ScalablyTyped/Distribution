package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2ConfirmationValueSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperConfirmationMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/confirmation", "Confirmation")
  @js.native
  open class Confirmation protected () extends SoloHelper[actionsDotintentDotCONFIRMATION, GoogleActionsV2ConfirmationValueSpec] {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  type ConfirmationArgument = Boolean
}
