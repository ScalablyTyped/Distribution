package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsConfig extends StObject {
  
  /**
    * Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a supported certificate authority. This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate's expiration date, hostname, and presence of a root certificate authority. Supported only for HTTP and HTTP_PROXY integrations.
    */
  var insecureSkipVerification: js.UndefOr[Boolean] = js.native
}
object TlsConfig {
  
  @scala.inline
  def apply(): TlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsConfig]
  }
  
  @scala.inline
  implicit class TlsConfigMutableBuilder[Self <: TlsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsecureSkipVerification(value: Boolean): Self = StObject.set(x, "insecureSkipVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsecureSkipVerificationUndefined: Self = StObject.set(x, "insecureSkipVerification", js.undefined)
  }
}
