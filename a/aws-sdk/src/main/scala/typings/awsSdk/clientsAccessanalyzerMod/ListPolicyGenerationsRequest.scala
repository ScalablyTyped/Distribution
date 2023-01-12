package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyGenerationsRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListPolicyGenerationsRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ARN of the IAM entity (user or role) for which you are generating a policy. Use this with ListGeneratedPolicies to filter the results to only include results for a specific principal.
    */
  var principalArn: js.UndefOr[PrincipalArn] = js.undefined
}
object ListPolicyGenerationsRequest {
  
  inline def apply(): ListPolicyGenerationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyGenerationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPolicyGenerationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListPolicyGenerationsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipalArn(value: PrincipalArn): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
  }
}
