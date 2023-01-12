package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceIdentifier extends StObject {
  
  /**
    * The creation time of this device identifier.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device identifier.
    */
  var deviceIdentifierArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Integrated Circuit Card Identifier of the device identifier.
    */
  var iccid: js.UndefOr[String] = js.undefined
  
  /**
    * The International Mobile Subscriber Identity of the device identifier.
    */
  var imsi: js.UndefOr[DeviceIdentifierImsiString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network on which the device identifier appears.
    */
  var networkArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the order used to purchase the device identifier.
    */
  var orderArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the device identifier.
    */
  var status: js.UndefOr[DeviceIdentifierStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the traffic group to which the device identifier belongs.
    */
  var trafficGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The vendor of the device identifier.
    */
  var vendor: js.UndefOr[String] = js.undefined
}
object DeviceIdentifier {
  
  inline def apply(): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDeviceIdentifierArn(value: Arn): Self = StObject.set(x, "deviceIdentifierArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierArnUndefined: Self = StObject.set(x, "deviceIdentifierArn", js.undefined)
    
    inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
    
    inline def setIccidUndefined: Self = StObject.set(x, "iccid", js.undefined)
    
    inline def setImsi(value: DeviceIdentifierImsiString): Self = StObject.set(x, "imsi", value.asInstanceOf[js.Any])
    
    inline def setImsiUndefined: Self = StObject.set(x, "imsi", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkArnUndefined: Self = StObject.set(x, "networkArn", js.undefined)
    
    inline def setOrderArn(value: String): Self = StObject.set(x, "orderArn", value.asInstanceOf[js.Any])
    
    inline def setOrderArnUndefined: Self = StObject.set(x, "orderArn", js.undefined)
    
    inline def setStatus(value: DeviceIdentifierStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrafficGroupArn(value: Arn): Self = StObject.set(x, "trafficGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTrafficGroupArnUndefined: Self = StObject.set(x, "trafficGroupArn", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
