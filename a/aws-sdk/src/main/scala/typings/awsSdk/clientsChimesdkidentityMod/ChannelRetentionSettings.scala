package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelRetentionSettings extends StObject {
  
  /**
    * The time in days to retain the messages in a channel.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.RetentionDays] = js.undefined
}
object ChannelRetentionSettings {
  
  inline def apply(): ChannelRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelRetentionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelRetentionSettings] (val x: Self) extends AnyVal {
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
