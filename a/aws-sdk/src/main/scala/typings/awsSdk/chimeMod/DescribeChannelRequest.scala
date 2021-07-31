package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
}
object DescribeChannelRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelRequestMutableBuilder[Self <: DescribeChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
