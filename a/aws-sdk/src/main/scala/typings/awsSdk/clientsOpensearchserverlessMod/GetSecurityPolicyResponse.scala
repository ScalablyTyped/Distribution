package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityPolicyResponse extends StObject {
  
  /**
    * Details about the requested security policy.
    */
  var securityPolicyDetail: js.UndefOr[SecurityPolicyDetail] = js.undefined
}
object GetSecurityPolicyResponse {
  
  inline def apply(): GetSecurityPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityPolicyDetail(value: SecurityPolicyDetail): Self = StObject.set(x, "securityPolicyDetail", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyDetailUndefined: Self = StObject.set(x, "securityPolicyDetail", js.undefined)
  }
}
