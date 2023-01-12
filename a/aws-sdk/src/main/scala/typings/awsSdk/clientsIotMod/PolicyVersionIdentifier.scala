package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyVersionIdentifier extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
}
object PolicyVersionIdentifier {
  
  inline def apply(): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyVersionIdentifier] (val x: Self) extends AnyVal {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    inline def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdUndefined: Self = StObject.set(x, "policyVersionId", js.undefined)
  }
}
