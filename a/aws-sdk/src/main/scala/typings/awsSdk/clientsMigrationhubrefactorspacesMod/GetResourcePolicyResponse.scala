package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyResponse extends StObject {
  
  /**
    * A JSON-formatted string for an Amazon Web Services resource-based policy. 
    */
  var Policy: js.UndefOr[PolicyString] = js.undefined
}
object GetResourcePolicyResponse {
  
  inline def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
