package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkGetDeviceProfile extends StObject {
  
  /**
    * The Sidewalk application server public key.
    */
  var ApplicationServerPublicKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ApplicationServerPublicKey] = js.undefined
  
  /**
    * The DAK certificate information of the Sidewalk device profile.
    */
  var DakCertificateMetadata: js.UndefOr[DakCertificateMetadataList] = js.undefined
  
  /**
    * Gets information about the certification status of a Sidewalk device profile.
    */
  var QualificationStatus: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.QualificationStatus] = js.undefined
}
object SidewalkGetDeviceProfile {
  
  inline def apply(): SidewalkGetDeviceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkGetDeviceProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkGetDeviceProfile] (val x: Self) extends AnyVal {
    
    inline def setApplicationServerPublicKey(value: ApplicationServerPublicKey): Self = StObject.set(x, "ApplicationServerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationServerPublicKeyUndefined: Self = StObject.set(x, "ApplicationServerPublicKey", js.undefined)
    
    inline def setDakCertificateMetadata(value: DakCertificateMetadataList): Self = StObject.set(x, "DakCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setDakCertificateMetadataUndefined: Self = StObject.set(x, "DakCertificateMetadata", js.undefined)
    
    inline def setDakCertificateMetadataVarargs(value: DakCertificateMetadata*): Self = StObject.set(x, "DakCertificateMetadata", js.Array(value*))
    
    inline def setQualificationStatus(value: QualificationStatus): Self = StObject.set(x, "QualificationStatus", value.asInstanceOf[js.Any])
    
    inline def setQualificationStatusUndefined: Self = StObject.set(x, "QualificationStatus", js.undefined)
  }
}
