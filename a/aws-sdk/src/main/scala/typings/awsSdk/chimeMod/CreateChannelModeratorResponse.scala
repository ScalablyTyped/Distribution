package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelModeratorResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ARNs of the channel and the moderator.
    */
  var ChannelModerator: js.UndefOr[Identity] = js.undefined
}
object CreateChannelModeratorResponse {
  
  @scala.inline
  def apply(): CreateChannelModeratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelModeratorResponse]
  }
  
  @scala.inline
  implicit class CreateChannelModeratorResponseMutableBuilder[Self <: CreateChannelModeratorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelModerator(value: Identity): Self = StObject.set(x, "ChannelModerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelModeratorUndefined: Self = StObject.set(x, "ChannelModerator", js.undefined)
  }
}
