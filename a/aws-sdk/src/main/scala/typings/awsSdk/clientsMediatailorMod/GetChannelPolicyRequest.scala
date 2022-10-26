package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelPolicyRequest extends StObject {
  
  /**
    * The name of the channel associated with this Channel Policy.
    */
  var ChannelName: string
}
object GetChannelPolicyRequest {
  
  inline def apply(ChannelName: string): GetChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelPolicyRequest]
  }
  
  extension [Self <: GetChannelPolicyRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
