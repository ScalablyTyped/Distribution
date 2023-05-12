package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DakCertificateMetadata extends StObject {
  
  /**
    * The advertised product ID (APID) that's used for pre-production and production applications.
    */
  var ApId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ApId] = js.undefined
  
  /**
    * The certificate ID for the DAK.
    */
  var CertificateId: DakCertificateId
  
  /**
    * The device type ID that's used for prototyping applications.
    */
  var DeviceTypeId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceTypeId] = js.undefined
  
  /**
    * Whether factory support has been enabled.
    */
  var FactorySupport: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FactorySupport] = js.undefined
  
  /**
    * The maximum number of signatures that the DAK can sign. A value of -1 indicates that there's no device limit.
    */
  var MaxAllowedSignature: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.MaxAllowedSignature] = js.undefined
}
object DakCertificateMetadata {
  
  inline def apply(CertificateId: DakCertificateId): DakCertificateMetadata = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DakCertificateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DakCertificateMetadata] (val x: Self) extends AnyVal {
    
    inline def setApId(value: ApId): Self = StObject.set(x, "ApId", value.asInstanceOf[js.Any])
    
    inline def setApIdUndefined: Self = StObject.set(x, "ApId", js.undefined)
    
    inline def setCertificateId(value: DakCertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeId(value: DeviceTypeId): Self = StObject.set(x, "DeviceTypeId", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeIdUndefined: Self = StObject.set(x, "DeviceTypeId", js.undefined)
    
    inline def setFactorySupport(value: FactorySupport): Self = StObject.set(x, "FactorySupport", value.asInstanceOf[js.Any])
    
    inline def setFactorySupportUndefined: Self = StObject.set(x, "FactorySupport", js.undefined)
    
    inline def setMaxAllowedSignature(value: MaxAllowedSignature): Self = StObject.set(x, "MaxAllowedSignature", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowedSignatureUndefined: Self = StObject.set(x, "MaxAllowedSignature", js.undefined)
  }
}
