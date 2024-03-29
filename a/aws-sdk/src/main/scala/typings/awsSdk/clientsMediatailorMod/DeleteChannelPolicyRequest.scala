package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelPolicyRequest extends StObject {
  
  /**
    * The name of the channel associated with this channel policy.
    */
  var ChannelName: _String
}
object DeleteChannelPolicyRequest {
  
  inline def apply(ChannelName: _String): DeleteChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteChannelPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
