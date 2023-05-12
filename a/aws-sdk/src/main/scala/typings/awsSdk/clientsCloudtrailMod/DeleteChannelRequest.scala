package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelRequest extends StObject {
  
  /**
    * The ARN or the UUID value of the channel that you want to delete.
    */
  var Channel: ChannelArn
}
object DeleteChannelRequest {
  
  inline def apply(Channel: ChannelArn): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: ChannelArn): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
  }
}
