package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelMembershipRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the member.
    */
  var MemberArn: ChimeArn
}
object DescribeChannelMembershipRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): DescribeChannelMembershipRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelMembershipRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelMembershipRequestMutableBuilder[Self <: DescribeChannelMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
