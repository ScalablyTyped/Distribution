package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ARN of the moderator being deleted.
    */
  var ChannelModeratorArn: ChimeArn = js.native
}
object DeleteChannelModeratorRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): DeleteChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelModeratorRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelModeratorRequestMutableBuilder[Self <: DeleteChannelModeratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
  }
}
