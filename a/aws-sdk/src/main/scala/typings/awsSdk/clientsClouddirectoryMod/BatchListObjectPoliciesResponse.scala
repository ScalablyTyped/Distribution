package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectPoliciesResponse extends StObject {
  
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object BatchListObjectPoliciesResponse {
  
  inline def apply(): BatchListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectPoliciesResponse]
  }
  
  extension [Self <: BatchListObjectPoliciesResponse](x: Self) {
    
    inline def setAttachedPolicyIds(value: ObjectIdentifierList): Self = StObject.set(x, "AttachedPolicyIds", value.asInstanceOf[js.Any])
    
    inline def setAttachedPolicyIdsUndefined: Self = StObject.set(x, "AttachedPolicyIds", js.undefined)
    
    inline def setAttachedPolicyIdsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "AttachedPolicyIds", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
