package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionDeviceResponse extends StObject {
  
  /**
    * The device's ARN.
    */
  var Arn: DeviceArn
  
  /**
    * The device's configuration bundle.
    */
  var Certificates: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Certificates] = js.undefined
  
  /**
    * The device's ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceId] = js.undefined
  
  /**
    * The device's IoT thing name.
    */
  var IotThingName: js.UndefOr[typings.awsSdk.clientsPanoramaMod.IotThingName] = js.undefined
  
  /**
    * The device's status.
    */
  var Status: DeviceStatus
}
object ProvisionDeviceResponse {
  
  inline def apply(Arn: DeviceArn, Status: DeviceStatus): ProvisionDeviceResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionDeviceResponse]
  }
  
  extension [Self <: ProvisionDeviceResponse](x: Self) {
    
    inline def setArn(value: DeviceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCertificates(value: Certificates): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setIotThingName(value: IotThingName): Self = StObject.set(x, "IotThingName", value.asInstanceOf[js.Any])
    
    inline def setIotThingNameUndefined: Self = StObject.set(x, "IotThingName", js.undefined)
    
    inline def setStatus(value: DeviceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
