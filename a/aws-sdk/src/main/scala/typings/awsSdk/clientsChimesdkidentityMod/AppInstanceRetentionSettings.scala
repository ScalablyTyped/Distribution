package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceRetentionSettings extends StObject {
  
  /**
    * The length of time in days to retain the messages in a channel.
    */
  var ChannelRetentionSettings: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.ChannelRetentionSettings] = js.undefined
}
object AppInstanceRetentionSettings {
  
  inline def apply(): AppInstanceRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceRetentionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceRetentionSettings] (val x: Self) extends AnyVal {
    
    inline def setChannelRetentionSettings(value: ChannelRetentionSettings): Self = StObject.set(x, "ChannelRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setChannelRetentionSettingsUndefined: Self = StObject.set(x, "ChannelRetentionSettings", js.undefined)
  }
}
