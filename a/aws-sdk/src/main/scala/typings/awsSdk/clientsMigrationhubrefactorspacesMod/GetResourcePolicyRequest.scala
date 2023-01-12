package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the policy. 
    */
  var Identifier: ResourcePolicyIdentifier
}
object GetResourcePolicyRequest {
  
  inline def apply(Identifier: ResourcePolicyIdentifier): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourcePolicyIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
