package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesByCAResponse extends StObject {
  
  /**
    * The device certificates signed by the specified CA certificate.
    */
  var certificates: js.UndefOr[Certificates] = js.undefined
  
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListCertificatesByCAResponse {
  
  inline def apply(): ListCertificatesByCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesByCAResponse]
  }
  
  extension [Self <: ListCertificatesByCAResponse](x: Self) {
    
    inline def setCertificates(value: Certificates): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
