package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelRetentionSettings extends StObject {
  
  /**
    * The time in days to retain a channel.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.chimeMod.RetentionDays] = js.undefined
}
object ChannelRetentionSettings {
  
  @scala.inline
  def apply(): ChannelRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelRetentionSettings]
  }
  
  @scala.inline
  implicit class ChannelRetentionSettingsMutableBuilder[Self <: ChannelRetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
