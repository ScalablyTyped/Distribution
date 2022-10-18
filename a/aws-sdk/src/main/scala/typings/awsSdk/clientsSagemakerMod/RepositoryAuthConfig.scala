package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAuthConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to authenticate to the private Docker registry where your model image is hosted. For information about how to create an Amazon Web Services Lambda function, see Create a Lambda function with the console in the Amazon Web Services Lambda Developer Guide.
    */
  var RepositoryCredentialsProviderArn: typings.awsSdk.clientsSagemakerMod.RepositoryCredentialsProviderArn
}
object RepositoryAuthConfig {
  
  inline def apply(RepositoryCredentialsProviderArn: RepositoryCredentialsProviderArn): RepositoryAuthConfig = {
    val __obj = js.Dynamic.literal(RepositoryCredentialsProviderArn = RepositoryCredentialsProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAuthConfig]
  }
  
  extension [Self <: RepositoryAuthConfig](x: Self) {
    
    inline def setRepositoryCredentialsProviderArn(value: RepositoryCredentialsProviderArn): Self = StObject.set(x, "RepositoryCredentialsProviderArn", value.asInstanceOf[js.Any])
  }
}
