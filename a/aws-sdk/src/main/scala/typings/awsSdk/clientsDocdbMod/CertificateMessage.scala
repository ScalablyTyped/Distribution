package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateMessage extends StObject {
  
  /**
    * A list of certificates for this Amazon Web Services account.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    * An optional pagination token provided if the number of records retrieved is greater than MaxRecords. If this parameter is specified, the marker specifies the next record in the list. Including the value of Marker in the next call to DescribeCertificates results in the next page of certificates.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CertificateMessage {
  
  inline def apply(): CertificateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateMessage]
  }
  
  extension [Self <: CertificateMessage](x: Self) {
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
