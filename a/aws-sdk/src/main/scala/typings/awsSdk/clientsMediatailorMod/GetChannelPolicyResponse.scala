package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelPolicyResponse extends StObject {
  
  /**
    * The IAM policy for the channel. IAM policies are used to control access to your channel.
    */
  var Policy: js.UndefOr[string] = js.undefined
}
object GetChannelPolicyResponse {
  
  inline def apply(): GetChannelPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelPolicyResponse]
  }
  
  extension [Self <: GetChannelPolicyResponse](x: Self) {
    
    inline def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
