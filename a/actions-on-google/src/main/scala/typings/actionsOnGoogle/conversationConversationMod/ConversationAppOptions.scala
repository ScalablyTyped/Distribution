package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.assistantMod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationAppOptions[TConvData, TUserStorage] extends AppOptions {
  
  /**
    * Client ID for User Profile Payload Verification
    * See {@link Profile#payload|conv.user.profile.payload}
    * @public
    */
  var clientId: js.UndefOr[String] = js.native
  
  /** @public */
  var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
  
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
}
object ConversationAppOptions {
  
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationAppOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationAppOptions[TConvData, TUserStorage]]
  }
  
  @scala.inline
  implicit class ConversationAppOptionsOps[Self <: ConversationAppOptions[_, _], TConvData, TUserStorage] (val x: Self with (ConversationAppOptions[TConvData, TUserStorage])) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setInit(value: () => ConversationOptionsInit[TConvData, TUserStorage]): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setOrdersv3(value: Boolean): Self = this.set("ordersv3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdersv3: Self = this.set("ordersv3", js.undefined)
  }
}
