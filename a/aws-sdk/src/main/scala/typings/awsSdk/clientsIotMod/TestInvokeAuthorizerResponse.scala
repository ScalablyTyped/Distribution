package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestInvokeAuthorizerResponse extends StObject {
  
  /**
    * The number of seconds after which the connection is terminated.
    */
  var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined
  
  /**
    * True if the token is authenticated, otherwise false.
    */
  var isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined
  
  /**
    * IAM policy documents.
    */
  var policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined
  
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[PrincipalId] = js.undefined
  
  /**
    * The number of seconds after which the temporary credentials are refreshed.
    */
  var refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
}
object TestInvokeAuthorizerResponse {
  
  inline def apply(): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
  
  extension [Self <: TestInvokeAuthorizerResponse](x: Self) {
    
    inline def setDisconnectAfterInSeconds(value: Seconds): Self = StObject.set(x, "disconnectAfterInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDisconnectAfterInSecondsUndefined: Self = StObject.set(x, "disconnectAfterInSeconds", js.undefined)
    
    inline def setIsAuthenticated(value: IsAuthenticated): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setIsAuthenticatedUndefined: Self = StObject.set(x, "isAuthenticated", js.undefined)
    
    inline def setPolicyDocuments(value: PolicyDocuments): Self = StObject.set(x, "policyDocuments", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentsUndefined: Self = StObject.set(x, "policyDocuments", js.undefined)
    
    inline def setPolicyDocumentsVarargs(value: PolicyDocument*): Self = StObject.set(x, "policyDocuments", js.Array(value*))
    
    inline def setPrincipalId(value: PrincipalId): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setRefreshAfterInSeconds(value: Seconds): Self = StObject.set(x, "refreshAfterInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterInSecondsUndefined: Self = StObject.set(x, "refreshAfterInSeconds", js.undefined)
  }
}
