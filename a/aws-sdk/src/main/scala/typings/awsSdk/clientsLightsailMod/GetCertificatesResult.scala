package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificatesResult extends StObject {
  
  /**
    * An object that describes certificates.
    */
  var certificates: js.UndefOr[CertificateSummaryList] = js.undefined
}
object GetCertificatesResult {
  
  inline def apply(): GetCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificatesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCertificatesResult] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: CertificateSummaryList): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CertificateSummary*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
