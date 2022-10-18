package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpekeKeyProvider extends StObject {
  
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[stringPatternArnAwsUsGovAcm] = js.undefined
  
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[string] = js.undefined
  
  /**
    * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids. Other group types support one system id. See
    https://dashif.org/identifiers/content_protection/ for more details.
    */
  var SystemIds: js.UndefOr[listOfStringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
  
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[stringPatternHttps] = js.undefined
}
object SpekeKeyProvider {
  
  inline def apply(): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  
  extension [Self <: SpekeKeyProvider](x: Self) {
    
    inline def setCertificateArn(value: stringPatternArnAwsUsGovAcm): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setSystemIds(value: listOfStringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12): Self = StObject.set(x, "SystemIds", value.asInstanceOf[js.Any])
    
    inline def setSystemIdsUndefined: Self = StObject.set(x, "SystemIds", js.undefined)
    
    inline def setSystemIdsVarargs(value: stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12*): Self = StObject.set(x, "SystemIds", js.Array(value*))
    
    inline def setUrl(value: stringPatternHttps): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
