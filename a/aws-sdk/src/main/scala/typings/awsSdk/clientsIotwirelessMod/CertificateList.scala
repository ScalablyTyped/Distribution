package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateList extends StObject {
  
  /**
    * The certificate chain algorithm provided by sidewalk.
    */
  var SigningAlg: typings.awsSdk.clientsIotwirelessMod.SigningAlg
  
  /**
    * The value of the chosen sidewalk certificate.
    */
  var Value: CertificateValue
}
object CertificateList {
  
  inline def apply(SigningAlg: SigningAlg, Value: CertificateValue): CertificateList = {
    val __obj = js.Dynamic.literal(SigningAlg = SigningAlg.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateList]
  }
  
  extension [Self <: CertificateList](x: Self) {
    
    inline def setSigningAlg(value: SigningAlg): Self = StObject.set(x, "SigningAlg", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CertificateValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
