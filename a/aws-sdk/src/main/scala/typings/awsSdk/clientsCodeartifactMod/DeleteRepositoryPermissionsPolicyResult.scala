package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryPermissionsPolicyResult extends StObject {
  
  /**
    *  Information about the deleted policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object DeleteRepositoryPermissionsPolicyResult {
  
  inline def apply(): DeleteRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyResult]
  }
  
  extension [Self <: DeleteRepositoryPermissionsPolicyResult](x: Self) {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
