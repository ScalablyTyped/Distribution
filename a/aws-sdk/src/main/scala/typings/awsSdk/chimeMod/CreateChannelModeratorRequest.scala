package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the moderator.
    */
  var ChannelModeratorArn: ChimeArn
}
object CreateChannelModeratorRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): CreateChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelModeratorRequest]
  }
  
  @scala.inline
  implicit class CreateChannelModeratorRequestMutableBuilder[Self <: CreateChannelModeratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
  }
}
