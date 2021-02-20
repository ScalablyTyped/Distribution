package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelBanRequest extends StObject {
  
  /**
    * The ARN of the channel from which the user is banned.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ARN of the member being banned.
    */
  var MemberArn: ChimeArn = js.native
}
object DescribeChannelBanRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): DescribeChannelBanRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelBanRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelBanRequestMutableBuilder[Self <: DescribeChannelBanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
