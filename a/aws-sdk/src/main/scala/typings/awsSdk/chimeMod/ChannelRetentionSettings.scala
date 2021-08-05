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
  
  inline def apply(): ChannelRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelRetentionSettings]
  }
  
  extension [Self <: ChannelRetentionSettings](x: Self) {
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
