package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
    */
  var CdnIdentifierSecret: string
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
    */
  var SecretsRoleArn: string
}
object Authorization {
  
  inline def apply(CdnIdentifierSecret: string, SecretsRoleArn: string): Authorization = {
    val __obj = js.Dynamic.literal(CdnIdentifierSecret = CdnIdentifierSecret.asInstanceOf[js.Any], SecretsRoleArn = SecretsRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  extension [Self <: Authorization](x: Self) {
    
    inline def setCdnIdentifierSecret(value: string): Self = StObject.set(x, "CdnIdentifierSecret", value.asInstanceOf[js.Any])
    
    inline def setSecretsRoleArn(value: string): Self = StObject.set(x, "SecretsRoleArn", value.asInstanceOf[js.Any])
  }
}
