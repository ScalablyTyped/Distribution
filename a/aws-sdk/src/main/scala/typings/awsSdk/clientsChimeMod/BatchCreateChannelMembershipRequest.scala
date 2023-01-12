package typings.awsSdk.clientsChimeMod

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
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ARNs of the members you want to add to the channel.
    */
  var MemberArns: typings.awsSdk.clientsChimeMod.MemberArns
  
  /**
    * The membership type of a user, DEFAULT or HIDDEN. Default members are always returned as part of ListChannelMemberships. Hidden members are only returned if the type filter in ListChannelMemberships equals HIDDEN. Otherwise hidden members are not returned. This is only supported by moderators.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object BatchCreateChannelMembershipRequest {
  
  inline def apply(ChannelArn: ChimeArn, MemberArns: MemberArns): BatchCreateChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArns = MemberArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateChannelMembershipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateChannelMembershipRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMemberArns(value: MemberArns): Self = StObject.set(x, "MemberArns", value.asInstanceOf[js.Any])
    
    inline def setMemberArnsVarargs(value: ChimeArn*): Self = StObject.set(x, "MemberArns", js.Array(value*))
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
