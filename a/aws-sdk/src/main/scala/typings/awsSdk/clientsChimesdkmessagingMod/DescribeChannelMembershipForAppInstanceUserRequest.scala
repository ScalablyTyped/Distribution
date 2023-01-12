package typings.awsSdk.clientsChimesdkmessagingMod

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
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: ChimeArn
}
object DescribeChannelMembershipForAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn, ChimeBearer: ChimeArn): DescribeChannelMembershipForAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelMembershipForAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
  }
}
