package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateChannelMembershipRequest extends StObject {
  
  /**
    * The ARN of the channel to which you're adding users.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The AppInstanceUserArns of the members you want to add to the channel.
    */
  var MemberArns: typings.awsSdk.clientsChimesdkmessagingMod.MemberArns
  
  /**
    * The ID of the SubChannel in the request.   Only required when creating membership in a SubChannel for a moderator in an elastic channel. 
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are always returned as part of ListChannelMemberships. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN. Otherwise hidden members are not returned. This is only supported by moderators.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object BatchCreateChannelMembershipRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChimeBearer: ChimeArn, MemberArns: MemberArns): BatchCreateChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], MemberArns = MemberArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateChannelMembershipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateChannelMembershipRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMemberArns(value: MemberArns): Self = StObject.set(x, "MemberArns", value.asInstanceOf[js.Any])
    
    inline def setMemberArnsVarargs(value: ChimeArn*): Self = StObject.set(x, "MemberArns", js.Array(value*))
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
