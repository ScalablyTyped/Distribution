package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamRequest extends StObject {
  
  /**
    * Channel ARN for stream to be accessed.
    */
  var channelArn: ChannelArn
}
object GetStreamRequest {
  
  inline def apply(channelArn: ChannelArn): GetStreamRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
  }
}
