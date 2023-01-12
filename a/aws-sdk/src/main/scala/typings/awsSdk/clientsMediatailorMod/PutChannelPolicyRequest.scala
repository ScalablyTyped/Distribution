package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelPolicyRequest extends StObject {
  
  /**
    * The channel name associated with this Channel Policy.
    */
  var ChannelName: _String
  
  /**
    * Adds an IAM role that determines the permissions of your channel.
    */
  var Policy: _String
}
object PutChannelPolicyRequest {
  
  inline def apply(ChannelName: _String, Policy: _String): PutChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: _String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
