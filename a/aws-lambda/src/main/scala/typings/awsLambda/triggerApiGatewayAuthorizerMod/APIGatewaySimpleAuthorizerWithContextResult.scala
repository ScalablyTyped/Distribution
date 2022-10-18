package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewaySimpleAuthorizerWithContextResult[TAuthorizerContext]
  extends StObject
     with APIGatewaySimpleAuthorizerResult {
  
  var context: TAuthorizerContext
}
object APIGatewaySimpleAuthorizerWithContextResult {
  
  inline def apply[TAuthorizerContext](context: TAuthorizerContext, isAuthorized: Boolean): APIGatewaySimpleAuthorizerWithContextResult[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isAuthorized = isAuthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewaySimpleAuthorizerWithContextResult[TAuthorizerContext]]
  }
  
  extension [Self <: APIGatewaySimpleAuthorizerWithContextResult[?], TAuthorizerContext](x: Self & APIGatewaySimpleAuthorizerWithContextResult[TAuthorizerContext]) {
    
    inline def setContext(value: TAuthorizerContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
