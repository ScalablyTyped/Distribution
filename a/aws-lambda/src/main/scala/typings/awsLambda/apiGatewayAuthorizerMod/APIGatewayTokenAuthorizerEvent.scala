package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.awsLambdaStrings.TOKEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIGatewayTokenAuthorizerEvent
  extends StObject
     with APIGatewayAuthorizerEvent {
  
  var authorizationToken: String
  
  var methodArn: String
  
  var `type`: TOKEN
}
object APIGatewayTokenAuthorizerEvent {
  
  inline def apply(authorizationToken: String, methodArn: String): APIGatewayTokenAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TOKEN")
    __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
  }
  
  extension [Self <: APIGatewayTokenAuthorizerEvent](x: Self) {
    
    inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    inline def setMethodArn(value: String): Self = StObject.set(x, "methodArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: TOKEN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
