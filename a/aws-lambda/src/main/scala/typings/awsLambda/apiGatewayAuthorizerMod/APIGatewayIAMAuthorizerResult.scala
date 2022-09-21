package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewayIAMAuthorizerResult extends StObject {
  
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.undefined
  
  var policyDocument: PolicyDocument
  
  var principalId: String
  
  var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
}
object APIGatewayIAMAuthorizerResult {
  
  inline def apply(policyDocument: PolicyDocument, principalId: String): APIGatewayIAMAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayIAMAuthorizerResult]
  }
  
  extension [Self <: APIGatewayIAMAuthorizerResult](x: Self) {
    
    inline def setContext(value: APIGatewayAuthorizerResultContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
    
    inline def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
    
    inline def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
  }
}
