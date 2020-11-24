package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceRetentionSettings extends js.Object {
  
  /**
    * The length of time in days to retain a channel.
    */
  var ChannelRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.ChannelRetentionSettings] = js.native
}
object AppInstanceRetentionSettings {
  
  @scala.inline
  def apply(): AppInstanceRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceRetentionSettings]
  }
  
  @scala.inline
  implicit class AppInstanceRetentionSettingsOps[Self <: AppInstanceRetentionSettings] (val x: Self) extends AnyVal {
    
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
    def setChannelRetentionSettings(value: ChannelRetentionSettings): Self = this.set("ChannelRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelRetentionSettings: Self = this.set("ChannelRetentionSettings", js.undefined)
  }
}
