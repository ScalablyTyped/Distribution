package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationConfig extends StObject {
  
  /**
    * The authorization type that the HTTP endpoint requires.    AWS_IAM: The authorization type is Signature Version 4 (SigV4).  
    */
  var authorizationType: AuthorizationType
  
  /**
    * The Identity and Access Management (IAM) settings.
    */
  var awsIamConfig: js.UndefOr[AwsIamConfig] = js.undefined
}
object AuthorizationConfig {
  
  inline def apply(authorizationType: AuthorizationType): AuthorizationConfig = {
    val __obj = js.Dynamic.literal(authorizationType = authorizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationType(value: AuthorizationType): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
    
    inline def setAwsIamConfig(value: AwsIamConfig): Self = StObject.set(x, "awsIamConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsIamConfigUndefined: Self = StObject.set(x, "awsIamConfig", js.undefined)
  }
}
