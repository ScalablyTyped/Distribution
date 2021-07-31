package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceRetentionSettings extends StObject {
  
  /**
    * The length of time in days to retain a channel.
    */
  var ChannelRetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.ChannelRetentionSettings] = js.undefined
}
object AppInstanceRetentionSettings {
  
  @scala.inline
  def apply(): AppInstanceRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceRetentionSettings]
  }
  
  @scala.inline
  implicit class AppInstanceRetentionSettingsMutableBuilder[Self <: AppInstanceRetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelRetentionSettings(value: ChannelRetentionSettings): Self = StObject.set(x, "ChannelRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelRetentionSettingsUndefined: Self = StObject.set(x, "ChannelRetentionSettings", js.undefined)
  }
}
