package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaAuthorizerConfig extends StObject {
  
  /**
    * The number of seconds a response should be cached for. The default is 0 seconds, which disables caching. If you don't specify a value for authorizerResultTtlInSeconds, the default value is used. The maximum value is one hour (3600 seconds). The Lambda function can override this by returning a ttlOverride key in its response.
    */
  var authorizerResultTtlInSeconds: js.UndefOr[TTL] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function to be called for authorization. This can be a standard Lambda ARN, a version ARN (.../v3), or an alias ARN.   Note: This Lambda function must have the following resource-based policy assigned to it. When configuring Lambda authorizers in the console, this is done for you. To use the Command Line Interface (CLI), run the following:  aws lambda add-permission --function-name "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction 
    */
  var authorizerUri: String
  
  /**
    * A regular expression for validation of tokens before the Lambda function is called.
    */
  var identityValidationExpression: js.UndefOr[String] = js.undefined
}
object LambdaAuthorizerConfig {
  
  inline def apply(authorizerUri: String): LambdaAuthorizerConfig = {
    val __obj = js.Dynamic.literal(authorizerUri = authorizerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAuthorizerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaAuthorizerConfig] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerResultTtlInSeconds(value: TTL): Self = StObject.set(x, "authorizerResultTtlInSeconds", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerResultTtlInSecondsUndefined: Self = StObject.set(x, "authorizerResultTtlInSeconds", js.undefined)
    
    inline def setAuthorizerUri(value: String): Self = StObject.set(x, "authorizerUri", value.asInstanceOf[js.Any])
    
    inline def setIdentityValidationExpression(value: String): Self = StObject.set(x, "identityValidationExpression", value.asInstanceOf[js.Any])
    
    inline def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "identityValidationExpression", js.undefined)
  }
}
