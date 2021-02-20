package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelModeratedByAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance user in the moderated channel.
    */
  var AppInstanceUserArn: ChimeArn = js.native
  
  /**
    * The ARN of the moderated channel.
    */
  var ChannelArn: ChimeArn = js.native
}
object DescribeChannelModeratedByAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn): DescribeChannelModeratedByAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratedByAppInstanceUserRequestMutableBuilder[Self <: DescribeChannelModeratedByAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
