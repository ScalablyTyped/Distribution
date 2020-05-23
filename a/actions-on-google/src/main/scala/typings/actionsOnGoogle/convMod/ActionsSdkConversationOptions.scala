package typings.actionsOnGoogle.convMod

import typings.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  /** @public */
  var body: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
}

object ActionsSdkConversationOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    body: GoogleActionsV2AppRequest = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    init: ConversationOptionsInit[TConvData, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined
  ): ActionsSdkConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSdkConversationOptions[TConvData, TUserStorage]]
  }
}

