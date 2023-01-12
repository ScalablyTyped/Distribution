package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainPermissionsPolicyResult extends StObject {
  
  /**
    *  Information about the deleted resource policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object DeleteDomainPermissionsPolicyResult {
  
  inline def apply(): DeleteDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDomainPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
