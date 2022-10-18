package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the CloudTrail service-linked channel. 
    */
  var Channel: ChannelArn
}
object GetChannelRequest {
  
  inline def apply(Channel: ChannelArn): GetChannelRequest = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelRequest]
  }
  
  extension [Self <: GetChannelRequest](x: Self) {
    
    inline def setChannel(value: ChannelArn): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
  }
}
