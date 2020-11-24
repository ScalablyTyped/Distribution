package typings.actionsOnGoogle.conversationConversationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationOptionsInit[TConvData, TUserStorage] extends js.Object {
  
  /** @public */
  var data: js.UndefOr[TConvData] = js.native
  
  /** @public */
  var storage: js.UndefOr[TUserStorage] = js.native
}
object ConversationOptionsInit {
  
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationOptionsInit[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationOptionsInit[TConvData, TUserStorage]]
  }
  
  @scala.inline
  implicit class ConversationOptionsInitOps[Self <: ConversationOptionsInit[_, _], TConvData, TUserStorage] (val x: Self with (ConversationOptionsInit[TConvData, TUserStorage])) extends AnyVal {
    
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
    def setData(value: TConvData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setStorage(value: TUserStorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
