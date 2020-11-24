package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2CustomPushMessageTarget extends js.Object {
  
  /**
    * The argument to target for an intent. For V1, only one Argument is
    * supported.
    */
  var argument: js.UndefOr[GoogleActionsV2Argument] = js.native
  
  /**
    * The intent to target.
    */
  var intent: js.UndefOr[String] = js.native
  
  /**
    * The locale to target. Follows IETF BCP-47 language code.
    * Can be used by a multi-lingual app to target a user on a specified
    * localized app. If not specified, it will default to en-US.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The user to target.
    */
  var userId: js.UndefOr[String] = js.native
}
object GoogleActionsV2CustomPushMessageTarget {
  
  @scala.inline
  def apply(): GoogleActionsV2CustomPushMessageTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessageTarget]
  }
  
  @scala.inline
  implicit class GoogleActionsV2CustomPushMessageTargetOps[Self <: GoogleActionsV2CustomPushMessageTarget] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: GoogleActionsV2Argument): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
