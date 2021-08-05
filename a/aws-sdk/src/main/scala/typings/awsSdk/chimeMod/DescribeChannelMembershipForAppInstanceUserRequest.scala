package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelMembershipForAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the user in a channel.
    */
  var AppInstanceUserArn: ChimeArn
  
  /**
    * The ARN of the channel to which the user belongs.
    */
  var ChannelArn: ChimeArn
}
object DescribeChannelMembershipForAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn): DescribeChannelMembershipForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserRequest]
  }
  
  extension [Self <: DescribeChannelMembershipForAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
