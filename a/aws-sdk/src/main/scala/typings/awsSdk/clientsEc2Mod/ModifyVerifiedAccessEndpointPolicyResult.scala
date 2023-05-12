package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessEndpointPolicyResult extends StObject {
  
  /**
    * The Verified Access policy document.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Verified Access policy.
    */
  var PolicyEnabled: js.UndefOr[Boolean] = js.undefined
}
object ModifyVerifiedAccessEndpointPolicyResult {
  
  inline def apply(): ModifyVerifiedAccessEndpointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessEndpointPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessEndpointPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPolicyEnabled(value: Boolean): Self = StObject.set(x, "PolicyEnabled", value.asInstanceOf[js.Any])
    
    inline def setPolicyEnabledUndefined: Self = StObject.set(x, "PolicyEnabled", js.undefined)
  }
}
