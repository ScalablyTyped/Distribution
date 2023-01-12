package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelPolicyRequest extends StObject {
  
  /**
    * The name of the channel associated with this Channel Policy.
    */
  var ChannelName: _String
}
object GetChannelPolicyRequest {
  
  inline def apply(ChannelName: _String): GetChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChannelPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
