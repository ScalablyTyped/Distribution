package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedKafkaAccessConfigurationCredentials extends StObject {
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var BasicAuth: js.UndefOr[SecretManagerArn] = js.undefined
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn] = js.undefined
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var SaslScram256Auth: js.UndefOr[SecretManagerArn] = js.undefined
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var SaslScram512Auth: js.UndefOr[SecretManagerArn] = js.undefined
}
object SelfManagedKafkaAccessConfigurationCredentials {
  
  inline def apply(): SelfManagedKafkaAccessConfigurationCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedKafkaAccessConfigurationCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfManagedKafkaAccessConfigurationCredentials] (val x: Self) extends AnyVal {
    
    inline def setBasicAuth(value: SecretManagerArn): Self = StObject.set(x, "BasicAuth", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthUndefined: Self = StObject.set(x, "BasicAuth", js.undefined)
    
    inline def setClientCertificateTlsAuth(value: SecretManagerArn): Self = StObject.set(x, "ClientCertificateTlsAuth", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateTlsAuthUndefined: Self = StObject.set(x, "ClientCertificateTlsAuth", js.undefined)
    
    inline def setSaslScram256Auth(value: SecretManagerArn): Self = StObject.set(x, "SaslScram256Auth", value.asInstanceOf[js.Any])
    
    inline def setSaslScram256AuthUndefined: Self = StObject.set(x, "SaslScram256Auth", js.undefined)
    
    inline def setSaslScram512Auth(value: SecretManagerArn): Self = StObject.set(x, "SaslScram512Auth", value.asInstanceOf[js.Any])
    
    inline def setSaslScram512AuthUndefined: Self = StObject.set(x, "SaslScram512Auth", js.undefined)
  }
}
