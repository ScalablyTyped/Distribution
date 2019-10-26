package typings.actionsDashOnDashGoogle.distServiceDialogflowConvMod

import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationBaseOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationOptionsInit
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod.DialogflowV1WebhookRequest
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  /** @public */
  var body: js.UndefOr[GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest] = js.undefined
}

object DialogflowConversationOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    body: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    init: ConversationOptionsInit[TConvData, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined
  ): DialogflowConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (init != null) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3)
    __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
  }
}

