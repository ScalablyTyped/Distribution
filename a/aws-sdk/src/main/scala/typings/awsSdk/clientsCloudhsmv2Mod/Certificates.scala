package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificates extends StObject {
  
  /**
    * The HSM hardware certificate issued (signed) by AWS CloudHSM.
    */
  var AwsHardwareCertificate: js.UndefOr[Cert] = js.undefined
  
  /**
    * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    */
  var ClusterCertificate: js.UndefOr[Cert] = js.undefined
  
  /**
    * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is UNINITIALIZED.
    */
  var ClusterCsr: js.UndefOr[Cert] = js.undefined
  
  /**
    * The HSM certificate issued (signed) by the HSM hardware.
    */
  var HsmCertificate: js.UndefOr[Cert] = js.undefined
  
  /**
    * The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  var ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.undefined
}
object Certificates {
  
  inline def apply(): Certificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificates]
  }
  
  extension [Self <: Certificates](x: Self) {
    
    inline def setAwsHardwareCertificate(value: Cert): Self = StObject.set(x, "AwsHardwareCertificate", value.asInstanceOf[js.Any])
    
    inline def setAwsHardwareCertificateUndefined: Self = StObject.set(x, "AwsHardwareCertificate", js.undefined)
    
    inline def setClusterCertificate(value: Cert): Self = StObject.set(x, "ClusterCertificate", value.asInstanceOf[js.Any])
    
    inline def setClusterCertificateUndefined: Self = StObject.set(x, "ClusterCertificate", js.undefined)
    
    inline def setClusterCsr(value: Cert): Self = StObject.set(x, "ClusterCsr", value.asInstanceOf[js.Any])
    
    inline def setClusterCsrUndefined: Self = StObject.set(x, "ClusterCsr", js.undefined)
    
    inline def setHsmCertificate(value: Cert): Self = StObject.set(x, "HsmCertificate", value.asInstanceOf[js.Any])
    
    inline def setHsmCertificateUndefined: Self = StObject.set(x, "HsmCertificate", js.undefined)
    
    inline def setManufacturerHardwareCertificate(value: Cert): Self = StObject.set(x, "ManufacturerHardwareCertificate", value.asInstanceOf[js.Any])
    
    inline def setManufacturerHardwareCertificateUndefined: Self = StObject.set(x, "ManufacturerHardwareCertificate", js.undefined)
  }
}
