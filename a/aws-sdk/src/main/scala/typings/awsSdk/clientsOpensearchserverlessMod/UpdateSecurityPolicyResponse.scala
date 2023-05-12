package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityPolicyResponse extends StObject {
  
  /**
    * Details about the updated security policy.
    */
  var securityPolicyDetail: js.UndefOr[SecurityPolicyDetail] = js.undefined
}
object UpdateSecurityPolicyResponse {
  
  inline def apply(): UpdateSecurityPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSecurityPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityPolicyDetail(value: SecurityPolicyDetail): Self = StObject.set(x, "securityPolicyDetail", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyDetailUndefined: Self = StObject.set(x, "securityPolicyDetail", js.undefined)
  }
}
