package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod

import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationOptions[TUserStorage] extends js.Object {
  /** @public */
  var headers: js.UndefOr[Headers] = js.undefined
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[js.Object, TUserStorage]] = js.undefined
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.undefined
  /** @public */
  var request: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
}

object ConversationOptions {
  @scala.inline
  def apply[TUserStorage](
    headers: Headers = null,
    init: ConversationOptionsInit[js.Object, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined,
    request: GoogleActionsV2AppRequest = null
  ): ConversationOptions[TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationOptions[TUserStorage]]
  }
}

