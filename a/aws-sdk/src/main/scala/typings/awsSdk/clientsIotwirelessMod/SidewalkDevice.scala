package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkDevice extends StObject {
  
  var AmazonId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AmazonId] = js.undefined
  
  /**
    * The ID of the Sidewalk device profile.
    */
  var CertificateId: js.UndefOr[DakCertificateId] = js.undefined
  
  /**
    * The sidewalk device certificates for Ed25519 and P256r1.
    */
  var DeviceCertificates: js.UndefOr[DeviceCertificateList] = js.undefined
  
  /**
    * The ID of the Sidewalk device profile.
    */
  var DeviceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileId] = js.undefined
  
  /**
    * The Sidewalk device private keys that will be used for onboarding the device.
    */
  var PrivateKeys: js.UndefOr[PrivateKeysList] = js.undefined
  
  /**
    * The sidewalk device identification.
    */
  var SidewalkId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.SidewalkId] = js.undefined
  
  /**
    * The Sidewalk manufacturing series number.
    */
  var SidewalkManufacturingSn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.SidewalkManufacturingSn] = js.undefined
  
  /**
    * The Sidewalk device status, such as provisioned or registered.
    */
  var Status: js.UndefOr[WirelessDeviceSidewalkStatus] = js.undefined
}
object SidewalkDevice {
  
  inline def apply(): SidewalkDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkDevice] (val x: Self) extends AnyVal {
    
    inline def setAmazonId(value: AmazonId): Self = StObject.set(x, "AmazonId", value.asInstanceOf[js.Any])
    
    inline def setAmazonIdUndefined: Self = StObject.set(x, "AmazonId", js.undefined)
    
    inline def setCertificateId(value: DakCertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
    
    inline def setDeviceCertificates(value: DeviceCertificateList): Self = StObject.set(x, "DeviceCertificates", value.asInstanceOf[js.Any])
    
    inline def setDeviceCertificatesUndefined: Self = StObject.set(x, "DeviceCertificates", js.undefined)
    
    inline def setDeviceCertificatesVarargs(value: CertificateList*): Self = StObject.set(x, "DeviceCertificates", js.Array(value*))
    
    inline def setDeviceProfileId(value: DeviceProfileId): Self = StObject.set(x, "DeviceProfileId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileIdUndefined: Self = StObject.set(x, "DeviceProfileId", js.undefined)
    
    inline def setPrivateKeys(value: PrivateKeysList): Self = StObject.set(x, "PrivateKeys", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeysUndefined: Self = StObject.set(x, "PrivateKeys", js.undefined)
    
    inline def setPrivateKeysVarargs(value: CertificateList*): Self = StObject.set(x, "PrivateKeys", js.Array(value*))
    
    inline def setSidewalkId(value: SidewalkId): Self = StObject.set(x, "SidewalkId", value.asInstanceOf[js.Any])
    
    inline def setSidewalkIdUndefined: Self = StObject.set(x, "SidewalkId", js.undefined)
    
    inline def setSidewalkManufacturingSn(value: SidewalkManufacturingSn): Self = StObject.set(x, "SidewalkManufacturingSn", value.asInstanceOf[js.Any])
    
    inline def setSidewalkManufacturingSnUndefined: Self = StObject.set(x, "SidewalkManufacturingSn", js.undefined)
    
    inline def setStatus(value: WirelessDeviceSidewalkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
