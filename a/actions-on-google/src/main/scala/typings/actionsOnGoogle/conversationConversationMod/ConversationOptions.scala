package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationOptions[TUserStorage] extends js.Object {
  
  /** @public */
  var headers: js.UndefOr[Headers] = js.native
  
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[js.Object, TUserStorage]] = js.native
  
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
  
  /** @public */
  var request: js.UndefOr[GoogleActionsV2AppRequest] = js.native
}
object ConversationOptions {
  
  @scala.inline
  def apply[TUserStorage](): ConversationOptions[TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationOptions[TUserStorage]]
  }
  
  @scala.inline
  implicit class ConversationOptionsOps[Self <: ConversationOptions[_], TUserStorage] (val x: Self with ConversationOptions[TUserStorage]) extends AnyVal {
    
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
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInit(value: ConversationOptionsInit[js.Object, TUserStorage]): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setOrdersv3(value: Boolean): Self = this.set("ordersv3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdersv3: Self = this.set("ordersv3", js.undefined)
    
    @scala.inline
    def setRequest(value: GoogleActionsV2AppRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
