package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyGenerationsResponse extends StObject {
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A PolicyGeneration object that contains details about the generated policy.
    */
  var policyGenerations: PolicyGenerationList
}
object ListPolicyGenerationsResponse {
  
  inline def apply(policyGenerations: PolicyGenerationList): ListPolicyGenerationsResponse = {
    val __obj = js.Dynamic.literal(policyGenerations = policyGenerations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyGenerationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPolicyGenerationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPolicyGenerations(value: PolicyGenerationList): Self = StObject.set(x, "policyGenerations", value.asInstanceOf[js.Any])
    
    inline def setPolicyGenerationsVarargs(value: PolicyGeneration*): Self = StObject.set(x, "policyGenerations", js.Array(value*))
  }
}
