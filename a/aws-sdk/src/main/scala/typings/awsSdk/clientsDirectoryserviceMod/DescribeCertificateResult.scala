package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateResult extends StObject {
  
  /**
    * Information about the certificate, including registered date time, certificate state, the reason for the state, expiration date time, and certificate common name.
    */
  var Certificate: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Certificate] = js.undefined
}
object DescribeCertificateResult {
  
  inline def apply(): DescribeCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResult]
  }
  
  extension [Self <: DescribeCertificateResult](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
