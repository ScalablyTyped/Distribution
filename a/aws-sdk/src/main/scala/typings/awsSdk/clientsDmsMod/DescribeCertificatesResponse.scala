package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificatesResponse extends StObject {
  
  /**
    * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    * The pagination token.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeCertificatesResponse {
  
  inline def apply(): DescribeCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCertificatesResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
