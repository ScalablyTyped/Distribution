package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3OrderUpdateUserNotification extends js.Object {
  
  /**
    * The contents of the notification.
    * Max allowed length is 100 chars.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The title for the user notification.
    * Max allowed length is 30 chars.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3OrderUpdateUserNotification {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdateUserNotification]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderUpdateUserNotificationOps[Self <: GoogleActionsOrdersV3OrderUpdateUserNotification] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
