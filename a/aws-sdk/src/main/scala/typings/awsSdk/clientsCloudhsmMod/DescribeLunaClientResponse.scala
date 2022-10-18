package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLunaClientResponse extends StObject {
  
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.Certificate] = js.undefined
  
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.CertificateFingerprint] = js.undefined
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.ClientArn] = js.undefined
  
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.Label] = js.undefined
  
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object DescribeLunaClientResponse {
  
  inline def apply(): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
  
  extension [Self <: DescribeLunaClientResponse](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "CertificateFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertificateFingerprintUndefined: Self = StObject.set(x, "CertificateFingerprint", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    inline def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setLastModifiedTimestamp(value: Timestamp): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
  }
}
