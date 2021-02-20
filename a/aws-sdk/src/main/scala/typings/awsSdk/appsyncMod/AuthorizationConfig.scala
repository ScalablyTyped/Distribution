package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationConfig extends StObject {
  
  /**
    * The authorization type required by the HTTP endpoint.    AWS_IAM: The authorization type is Sigv4.  
    */
  var authorizationType: AuthorizationType = js.native
  
  /**
    * The AWS IAM settings.
    */
  var awsIamConfig: js.UndefOr[AwsIamConfig] = js.native
}
object AuthorizationConfig {
  
  @scala.inline
  def apply(authorizationType: AuthorizationType): AuthorizationConfig = {
    val __obj = js.Dynamic.literal(authorizationType = authorizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationConfig]
  }
  
  @scala.inline
  implicit class AuthorizationConfigMutableBuilder[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationType(value: AuthorizationType): Self = StObject.set(x, "authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamConfig(value: AwsIamConfig): Self = StObject.set(x, "awsIamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIamConfigUndefined: Self = StObject.set(x, "awsIamConfig", js.undefined)
  }
}
