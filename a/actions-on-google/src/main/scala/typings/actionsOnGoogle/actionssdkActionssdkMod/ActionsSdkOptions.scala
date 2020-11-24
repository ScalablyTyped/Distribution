package typings.actionsOnGoogle.actionssdkActionssdkMod

import typings.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsSdkOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  
  /**
    * Validates whether request is from Google through signature verification.
    * Uses Google-Auth-Library to verify authorization token against given Google Cloud Project ID.
    * Auth token is given in request header with key, "authorization".
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @example
    * ```javascript
    *
    * const app = actionssdk({ verification: 'nodejs-cloud-test-project-1234' })
    * ```
    *
    * @public
    */
  var verification: js.UndefOr[ActionsSdkVerification | String] = js.native
}
object ActionsSdkOptions {
  
  @scala.inline
  def apply[TConvData, TUserStorage](): ActionsSdkOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsSdkOptions[TConvData, TUserStorage]]
  }
  
  @scala.inline
  implicit class ActionsSdkOptionsOps[Self <: ActionsSdkOptions[_, _], TConvData, TUserStorage] (val x: Self with (ActionsSdkOptions[TConvData, TUserStorage])) extends AnyVal {
    
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
    def setVerification(value: ActionsSdkVerification | String): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
}
