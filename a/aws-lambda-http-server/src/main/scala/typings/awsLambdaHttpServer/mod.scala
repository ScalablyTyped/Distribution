package typings.awsLambdaHttpServer

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyCallback
import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.handlerMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(event: APIGatewayProxyEvent, context: Context, callback: APIGatewayProxyCallback): APIGatewayProxyCallback = (^.asInstanceOf[js.Dynamic].apply(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[APIGatewayProxyCallback]
  
  @JSImport("aws-lambda-http-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
