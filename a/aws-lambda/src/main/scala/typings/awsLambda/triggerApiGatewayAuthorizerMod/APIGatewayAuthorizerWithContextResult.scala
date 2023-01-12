package typings.awsLambda.triggerApiGatewayAuthorizerMod

import typings.awsLambda.commonApiGatewayMod.APIGatewayAuthorizerResultContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends StObject {
  
  var context: TAuthorizerContext
  
  var policyDocument: PolicyDocument
  
  var principalId: String
  
  var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
}
object APIGatewayAuthorizerWithContextResult {
  
  inline def apply[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */](context: TAuthorizerContext, policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIGatewayAuthorizerWithContextResult[?], TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] (val x: Self & APIGatewayAuthorizerWithContextResult[TAuthorizerContext]) extends AnyVal {
    
    inline def setContext(value: TAuthorizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setUsageIdentifierKey(value: String): Self = StObject.set(x, "usageIdentifierKey", value.asInstanceOf[js.Any])
    
    inline def setUsageIdentifierKeyNull: Self = StObject.set(x, "usageIdentifierKey", null)
    
    inline def setUsageIdentifierKeyUndefined: Self = StObject.set(x, "usageIdentifierKey", js.undefined)
  }
}
