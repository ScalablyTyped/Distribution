package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.assistantMod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationAppOptions[TConvData, TUserStorage] extends AppOptions {
  /**
    * Client ID for User Profile Payload Verification
    * See {@link Profile#payload|conv.user.profile.payload}
    * @public
    */
  var clientId: js.UndefOr[String] = js.undefined
  /** @public */
  var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.undefined
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.undefined
}

object ConversationAppOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](
    clientId: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    init: () => ConversationOptionsInit[TConvData, TUserStorage] = null,
    ordersv3: js.UndefOr[Boolean] = js.undefined
  ): ConversationAppOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (!js.isUndefined(ordersv3)) __obj.updateDynamic("ordersv3")(ordersv3.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationAppOptions[TConvData, TUserStorage]]
  }
}

