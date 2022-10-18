package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMembershipPreferencesRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserARN of the user making the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The AppInstanceUserArn of the member retrieving the preferences.
    */
  var MemberArn: ChimeArn
}
object GetChannelMembershipPreferencesRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn, MemberArn: ChimeArn): GetChannelMembershipPreferencesRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMembershipPreferencesRequest]
  }
  
  extension [Self <: GetChannelMembershipPreferencesRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
