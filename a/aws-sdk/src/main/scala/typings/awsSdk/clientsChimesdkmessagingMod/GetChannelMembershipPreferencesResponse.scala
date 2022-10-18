package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMembershipPreferencesResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The details of a user.
    */
  var Member: js.UndefOr[Identity] = js.undefined
  
  /**
    * The channel membership preferences for an AppInstanceUser .
    */
  var Preferences: js.UndefOr[ChannelMembershipPreferences] = js.undefined
}
object GetChannelMembershipPreferencesResponse {
  
  inline def apply(): GetChannelMembershipPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelMembershipPreferencesResponse]
  }
  
  extension [Self <: GetChannelMembershipPreferencesResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    inline def setPreferences(value: ChannelMembershipPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
  }
}
