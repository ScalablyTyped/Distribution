package typings.actionsOnGoogle.dialogflowConvMod

import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typings.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.v1Mod.DialogflowV1WebhookRequest
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
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
  }
}

