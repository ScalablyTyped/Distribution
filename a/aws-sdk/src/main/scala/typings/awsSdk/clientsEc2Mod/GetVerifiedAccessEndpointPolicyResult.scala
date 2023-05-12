package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVerifiedAccessEndpointPolicyResult extends StObject {
  
  /**
    * The Verified Access policy document.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Verified Access policy.
    */
  var PolicyEnabled: js.UndefOr[Boolean] = js.undefined
}
object GetVerifiedAccessEndpointPolicyResult {
  
  inline def apply(): GetVerifiedAccessEndpointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVerifiedAccessEndpointPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVerifiedAccessEndpointPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPolicyEnabled(value: Boolean): Self = StObject.set(x, "PolicyEnabled", value.asInstanceOf[js.Any])
    
    inline def setPolicyEnabledUndefined: Self = StObject.set(x, "PolicyEnabled", js.undefined)
  }
}
