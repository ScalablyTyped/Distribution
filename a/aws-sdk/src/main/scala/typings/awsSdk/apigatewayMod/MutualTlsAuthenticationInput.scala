package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutualTlsAuthenticationInput extends StObject {
  
  /**
    * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example s3://bucket-name/key-name. The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version. To update the truststore, you must have permissions to access the S3 object.
    */
  var truststoreUri: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the S3 object that contains your truststore. To specify a version, you must have versioning enabled for the S3 bucket
    */
  var truststoreVersion: js.UndefOr[String] = js.undefined
}
object MutualTlsAuthenticationInput {
  
  inline def apply(): MutualTlsAuthenticationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutualTlsAuthenticationInput]
  }
  
  extension [Self <: MutualTlsAuthenticationInput](x: Self) {
    
    inline def setTruststoreUri(value: String): Self = StObject.set(x, "truststoreUri", value.asInstanceOf[js.Any])
    
    inline def setTruststoreUriUndefined: Self = StObject.set(x, "truststoreUri", js.undefined)
    
    inline def setTruststoreVersion(value: String): Self = StObject.set(x, "truststoreVersion", value.asInstanceOf[js.Any])
    
    inline def setTruststoreVersionUndefined: Self = StObject.set(x, "truststoreVersion", js.undefined)
  }
}
