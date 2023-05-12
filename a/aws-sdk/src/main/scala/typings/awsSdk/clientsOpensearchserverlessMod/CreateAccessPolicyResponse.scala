package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPolicyResponse extends StObject {
  
  /**
    * Details about the created access policy.
    */
  var accessPolicyDetail: js.UndefOr[AccessPolicyDetail] = js.undefined
}
object CreateAccessPolicyResponse {
  
  inline def apply(): CreateAccessPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicyDetail(value: AccessPolicyDetail): Self = StObject.set(x, "accessPolicyDetail", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyDetailUndefined: Self = StObject.set(x, "accessPolicyDetail", js.undefined)
  }
}
