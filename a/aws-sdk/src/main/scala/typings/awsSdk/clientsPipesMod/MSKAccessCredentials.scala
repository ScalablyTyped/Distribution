package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSKAccessCredentials extends StObject {
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var ClientCertificateTlsAuth: js.UndefOr[SecretManagerArn] = js.undefined
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var SaslScram512Auth: js.UndefOr[SecretManagerArn] = js.undefined
}
object MSKAccessCredentials {
  
  inline def apply(): MSKAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSKAccessCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSKAccessCredentials] (val x: Self) extends AnyVal {
    
    inline def setClientCertificateTlsAuth(value: SecretManagerArn): Self = StObject.set(x, "ClientCertificateTlsAuth", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateTlsAuthUndefined: Self = StObject.set(x, "ClientCertificateTlsAuth", js.undefined)
    
    inline def setSaslScram512Auth(value: SecretManagerArn): Self = StObject.set(x, "SaslScram512Auth", value.asInstanceOf[js.Any])
    
    inline def setSaslScram512AuthUndefined: Self = StObject.set(x, "SaslScram512Auth", js.undefined)
  }
}
