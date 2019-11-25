package typings.actionsDashOnDashGoogle.distServiceDialogflowDialogflowMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationAppOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationOptionsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Verifies whether the request comes from Dialogflow.
    * Uses header keys and values to check against ones specified by the developer
    * in the Dialogflow Fulfillment settings of the app.
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @public
    */
  var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.undefined
}

object DialogflowOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    clientId: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    init: () => ConversationOptionsInit[TConvData, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined,
    verification: DialogflowVerification | DialogflowVerificationHeaders = null
  ): DialogflowOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
  }
}

