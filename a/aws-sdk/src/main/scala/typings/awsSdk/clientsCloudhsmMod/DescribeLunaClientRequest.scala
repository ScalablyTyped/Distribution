package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLunaClientRequest extends StObject {
  
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.CertificateFingerprint] = js.undefined
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.ClientArn] = js.undefined
}
object DescribeLunaClientRequest {
  
  inline def apply(): DescribeLunaClientRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientRequest]
  }
  
  extension [Self <: DescribeLunaClientRequest](x: Self) {
    
    inline def setCertificateFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "CertificateFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertificateFingerprintUndefined: Self = StObject.set(x, "CertificateFingerprint", js.undefined)
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    inline def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}
