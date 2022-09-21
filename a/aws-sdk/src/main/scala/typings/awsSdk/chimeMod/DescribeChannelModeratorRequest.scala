package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelModeratorRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the channel moderator.
    */
  var ChannelModeratorArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
}
object DescribeChannelModeratorRequest {
  
  inline def apply(ChannelArn: ChimeArn, ChannelModeratorArn: ChimeArn): DescribeChannelModeratorRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChannelModeratorArn = ChannelModeratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelModeratorRequest]
  }
  
  extension [Self <: DescribeChannelModeratorRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelModeratorArn(value: ChimeArn): Self = StObject.set(x, "ChannelModeratorArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
  }
}
