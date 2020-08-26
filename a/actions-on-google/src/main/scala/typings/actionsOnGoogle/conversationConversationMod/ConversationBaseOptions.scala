package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationBaseOptions[TConvData, TUserStorage] extends js.Object {
  /** @public */
  var debug: js.UndefOr[Boolean] = js.native
  /** @public */
  var headers: js.UndefOr[Headers] = js.native
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[TConvData, TUserStorage]] = js.native
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
}

object ConversationBaseOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationBaseOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationBaseOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ConversationBaseOptionsOps[Self <: ConversationBaseOptions[_, _], TConvData, TUserStorage] (val x: Self with (ConversationBaseOptions[TConvData, TUserStorage])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInit(value: ConversationOptionsInit[TConvData, TUserStorage]): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setOrdersv3(value: Boolean): Self = this.set("ordersv3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdersv3: Self = this.set("ordersv3", js.undefined)
  }
  
}

