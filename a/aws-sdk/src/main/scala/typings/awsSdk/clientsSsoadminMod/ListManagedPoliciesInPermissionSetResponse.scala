package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedPoliciesInPermissionSetResponse extends StObject {
  
  /**
    * An array of the AttachedManagedPolicy data type object.
    */
  var AttachedManagedPolicies: js.UndefOr[AttachedManagedPolicyList] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListManagedPoliciesInPermissionSetResponse {
  
  inline def apply(): ListManagedPoliciesInPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedPoliciesInPermissionSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListManagedPoliciesInPermissionSetResponse] (val x: Self) extends AnyVal {
    
    inline def setAttachedManagedPolicies(value: AttachedManagedPolicyList): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    inline def setAttachedManagedPoliciesVarargs(value: AttachedManagedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
