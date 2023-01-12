package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelPolicyResponse extends StObject {
  
  /**
    * The IAM policy for the channel. IAM policies are used to control access to your channel.
    */
  var Policy: js.UndefOr[_String] = js.undefined
}
object GetChannelPolicyResponse {
  
  inline def apply(): GetChannelPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChannelPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: _String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
