package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelPolicyRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
  
  /**
    * Adds an IAM role that determines the permissions of your channel.
    */
  var Policy: string
}
object PutChannelPolicyRequest {
  
  inline def apply(ChannelName: string, Policy: string): PutChannelPolicyRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelPolicyRequest]
  }
  
  extension [Self <: PutChannelPolicyRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
