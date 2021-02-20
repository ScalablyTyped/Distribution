package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ARN of the channel moderator.
    */
  var ChannelModeratorArn: ChimeArn = js.native
}
object DescribeChannelModeratorRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): DescribeChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelModeratorRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratorRequestMutableBuilder[Self <: DescribeChannelModeratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
  }
}
