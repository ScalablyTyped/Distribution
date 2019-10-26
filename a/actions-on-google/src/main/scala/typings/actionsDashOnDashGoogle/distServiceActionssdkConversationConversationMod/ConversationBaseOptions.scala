package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod

import typings.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationBaseOptions[TConvData, TUserStorage] extends js.Object {
  /** @public */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** @public */
  var headers: js.UndefOr[Headers] = js.undefined
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[TConvData, TUserStorage]] = js.undefined
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.undefined
}

object ConversationBaseOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    debug: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    init: ConversationOptionsInit[TConvData, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined
  ): ConversationBaseOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (init != null) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3)
    __obj.asInstanceOf[ConversationBaseOptions[TConvData, TUserStorage]]
  }
}

