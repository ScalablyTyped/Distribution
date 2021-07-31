package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelMembershipRequest extends StObject {
  
  /**
    * The ARN of the channel to which you're adding users.
    */
  var ChannelArn: ChimeArn
  
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
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn, Type: ChannelMembershipType): CreateChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelMembershipRequest]
  }
  
  @scala.inline
  implicit class CreateChannelMembershipRequestMutableBuilder[Self <: CreateChannelMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
