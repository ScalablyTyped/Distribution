package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelPolicyRequest extends StObject {
  
  /**
    * The name of the channel associated with this channel policy.
    */
  var ChannelName: string
}
object DeleteChannelPolicyRequest {
  
  inline def apply(ChannelName: string): DeleteChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelPolicyRequest]
  }
  
  extension [Self <: DeleteChannelPolicyRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
