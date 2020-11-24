package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSettings extends js.Object {
  
  /**
    * Setting that stops or starts remote control of shared screens during meetings.
    */
  var DisableRemoteControl: js.UndefOr[Boolean] = js.native
  
  /**
    * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
    */
  var EnableDialOut: js.UndefOr[Boolean] = js.native
}
object AccountSettings {
  
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit class AccountSettingsOps[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableRemoteControl(value: Boolean): Self = this.set("DisableRemoteControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRemoteControl: Self = this.set("DisableRemoteControl", js.undefined)
    
    @scala.inline
    def setEnableDialOut(value: Boolean): Self = this.set("EnableDialOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDialOut: Self = this.set("EnableDialOut", js.undefined)
  }
}
