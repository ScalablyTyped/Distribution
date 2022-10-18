package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCACertificatesResponse extends StObject {
  
  /**
    * The CA certificates registered in your Amazon Web Services account.
    */
  var certificates: js.UndefOr[CACertificates] = js.undefined
  
  /**
    * The current position within the list of CA certificates.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListCACertificatesResponse {
  
  inline def apply(): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
  
  extension [Self <: ListCACertificatesResponse](x: Self) {
    
    inline def setCertificates(value: CACertificates): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CACertificate*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
