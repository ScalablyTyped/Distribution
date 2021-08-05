package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceNetworkProfileInfo extends StObject {
  
  /**
    * The ARN of the certificate associated with a device.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time (in epoch) when the certificate expires.
    */
  var CertificateExpirationTime: js.UndefOr[CertificateTime] = js.undefined
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
}
object DeviceNetworkProfileInfo {
  
  inline def apply(): DeviceNetworkProfileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceNetworkProfileInfo]
  }
  
  extension [Self <: DeviceNetworkProfileInfo](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateExpirationTime(value: CertificateTime): Self = StObject.set(x, "CertificateExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setCertificateExpirationTimeUndefined: Self = StObject.set(x, "CertificateExpirationTime", js.undefined)
    
    inline def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
  }
}
