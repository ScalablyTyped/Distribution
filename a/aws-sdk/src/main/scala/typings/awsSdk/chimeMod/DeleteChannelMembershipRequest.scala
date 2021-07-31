package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelMembershipRequest extends StObject {
  
  /**
    * The ARN of the channel from which you want to remove the user.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the member that you're removing from the channel.
    */
  var MemberArn: ChimeArn
}
object DeleteChannelMembershipRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): DeleteChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelMembershipRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelMembershipRequestMutableBuilder[Self <: DeleteChannelMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
