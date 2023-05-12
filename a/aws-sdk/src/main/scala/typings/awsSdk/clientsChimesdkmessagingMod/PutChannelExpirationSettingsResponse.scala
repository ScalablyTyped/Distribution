package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelExpirationSettingsResponse extends StObject {
  
  /**
    * The channel ARN.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * Settings that control the interval after which a channel is deleted.
    */
  var ExpirationSettings: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ExpirationSettings] = js.undefined
}
object PutChannelExpirationSettingsResponse {
  
  inline def apply(): PutChannelExpirationSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutChannelExpirationSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelExpirationSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setExpirationSettings(value: ExpirationSettings): Self = StObject.set(x, "ExpirationSettings", value.asInstanceOf[js.Any])
    
    inline def setExpirationSettingsUndefined: Self = StObject.set(x, "ExpirationSettings", js.undefined)
  }
}
