package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelMembershipRequest extends StObject {
  
  /**
    * The ARN of the channel to which you're adding users.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ARN of the member you want to add to the channel.
    */
  var MemberArn: ChimeArn
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are always returned as part of ListChannelMemberships. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN. Otherwise hidden members are not returned. This is only supported by moderators.
    */
  var Type: ChannelMembershipType
}
object CreateChannelMembershipRequest {
  
  inline def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn, Type: ChannelMembershipType): CreateChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelMembershipRequest]
  }
  
  extension [Self <: CreateChannelMembershipRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
