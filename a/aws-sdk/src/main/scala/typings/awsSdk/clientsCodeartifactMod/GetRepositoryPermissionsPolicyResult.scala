package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryPermissionsPolicyResult extends StObject {
  
  /**
    *  The returned resource policy. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object GetRepositoryPermissionsPolicyResult {
  
  inline def apply(): GetRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRepositoryPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
