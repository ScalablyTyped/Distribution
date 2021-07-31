package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * The ARN of the channel being deleted.
    */
  var ChannelArn: ChimeArn
}
object DeleteChannelRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelRequestMutableBuilder[Self <: DeleteChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
  }
}
