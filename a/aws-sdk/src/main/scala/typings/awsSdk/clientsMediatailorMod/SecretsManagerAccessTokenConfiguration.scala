package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretsManagerAccessTokenConfiguration extends StObject {
  
  /**
    * The name of the HTTP header used to supply the access token in requests to the source location.
    */
  var HeaderName: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
    */
  var SecretArn: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS Secrets Manager SecretString key associated with the access token. MediaTailor uses the key to look up SecretString key and value pair containing the access token.
    */
  var SecretStringKey: js.UndefOr[string] = js.undefined
}
object SecretsManagerAccessTokenConfiguration {
  
  inline def apply(): SecretsManagerAccessTokenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretsManagerAccessTokenConfiguration]
  }
  
  extension [Self <: SecretsManagerAccessTokenConfiguration](x: Self) {
    
    inline def setHeaderName(value: string): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "HeaderName", js.undefined)
    
    inline def setSecretArn(value: string): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setSecretStringKey(value: string): Self = StObject.set(x, "SecretStringKey", value.asInstanceOf[js.Any])
    
    inline def setSecretStringKeyUndefined: Self = StObject.set(x, "SecretStringKey", js.undefined)
  }
}
