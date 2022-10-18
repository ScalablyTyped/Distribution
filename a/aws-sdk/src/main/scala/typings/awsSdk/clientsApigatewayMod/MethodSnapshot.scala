package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodSnapshot extends StObject {
  
  /**
    * Specifies whether the method requires a valid ApiKey.
    */
  var apiKeyRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.undefined
}
object MethodSnapshot {
  
  inline def apply(): MethodSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSnapshot]
  }
  
  extension [Self <: MethodSnapshot](x: Self) {
    
    inline def setApiKeyRequired(value: Boolean): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
    
    inline def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
    
    inline def setAuthorizationType(value: String): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTypeUndefined: Self = StObject.set(x, "authorizationType", js.undefined)
  }
}
