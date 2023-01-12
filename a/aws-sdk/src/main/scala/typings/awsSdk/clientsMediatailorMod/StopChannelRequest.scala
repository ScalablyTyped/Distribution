package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: _String
}
object StopChannelRequest {
  
  inline def apply(ChannelName: _String): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
