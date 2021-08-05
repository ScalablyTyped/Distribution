package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the moderator being deleted.
    */
  var ChannelModeratorArn: ChimeArn
}
object DeleteChannelModeratorRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): DeleteChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelModeratorRequest]
  }
  
  extension [Self <: DeleteChannelModeratorRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
  }
}
