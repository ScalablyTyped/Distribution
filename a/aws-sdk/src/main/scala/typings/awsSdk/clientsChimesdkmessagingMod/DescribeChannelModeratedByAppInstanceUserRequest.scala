package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelModeratedByAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the user or bot in the moderated channel.
    */
  var AppInstanceUserArn: ChimeArn
  
  /**
    * The ARN of the moderated channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the AppInstanceUser or AppInstanceBot that makes the API call.
    */
  var ChimeBearer: ChimeArn
}
object DescribeChannelModeratedByAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn, ChimeBearer: ChimeArn): DescribeChannelModeratedByAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelModeratedByAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
  }
}
