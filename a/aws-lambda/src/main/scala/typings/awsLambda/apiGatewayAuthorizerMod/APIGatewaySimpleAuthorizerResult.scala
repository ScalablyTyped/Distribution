package typings.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewaySimpleAuthorizerResult extends StObject {
  
  var isAuthorized: Boolean
}
object APIGatewaySimpleAuthorizerResult {
  
  inline def apply(isAuthorized: Boolean): APIGatewaySimpleAuthorizerResult = {
    val __obj = js.Dynamic.literal(isAuthorized = isAuthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewaySimpleAuthorizerResult]
  }
  
  extension [Self <: APIGatewaySimpleAuthorizerResult](x: Self) {
    
    inline def setIsAuthorized(value: Boolean): Self = StObject.set(x, "isAuthorized", value.asInstanceOf[js.Any])
  }
}
