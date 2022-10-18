package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectEnvironmentRegistryCredential extends StObject {
  
  /**
    * The ARN or name of credentials created using Secrets Manager.  The credential can use the name of the credentials only if they exist in your current Amazon Web Services Region.  
    */
  var Credential: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for Secrets Manager.
    */
  var CredentialProvider: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectEnvironmentRegistryCredential {
  
  inline def apply(): AwsCodeBuildProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentRegistryCredential]
  }
  
  extension [Self <: AwsCodeBuildProjectEnvironmentRegistryCredential](x: Self) {
    
    inline def setCredential(value: NonEmptyString): Self = StObject.set(x, "Credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialProvider(value: NonEmptyString): Self = StObject.set(x, "CredentialProvider", value.asInstanceOf[js.Any])
    
    inline def setCredentialProviderUndefined: Self = StObject.set(x, "CredentialProvider", js.undefined)
    
    inline def setCredentialUndefined: Self = StObject.set(x, "Credential", js.undefined)
  }
}
