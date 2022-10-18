package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelRequest extends StObject {
  
  /**
    * ARN of the channel for which the configuration is to be retrieved.
    */
  var arn: ChannelArn
}
object GetChannelRequest {
  
  inline def apply(arn: ChannelArn): GetChannelRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelRequest]
  }
  
  extension [Self <: GetChannelRequest](x: Self) {
    
    inline def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
