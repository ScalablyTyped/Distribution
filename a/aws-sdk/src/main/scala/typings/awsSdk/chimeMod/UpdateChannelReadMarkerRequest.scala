package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelReadMarkerRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
}
object UpdateChannelReadMarkerRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): UpdateChannelReadMarkerRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelReadMarkerRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelReadMarkerRequestMutableBuilder[Self <: UpdateChannelReadMarkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
