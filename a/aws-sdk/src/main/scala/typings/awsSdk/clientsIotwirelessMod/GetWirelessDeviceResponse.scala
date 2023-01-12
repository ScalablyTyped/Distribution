package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessDeviceArn] = js.undefined
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  /**
    * The name of the destination to which the device is assigned.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  /**
    * The ID of the wireless device.
    */
  var Id: js.UndefOr[WirelessDeviceId] = js.undefined
  
  /**
    * Information about the wireless device.
    */
  var LoRaWAN: js.UndefOr[LoRaWANDevice] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[WirelessDeviceName] = js.undefined
  
  /**
    * Sidewalk device object.
    */
  var Sidewalk: js.UndefOr[SidewalkDevice] = js.undefined
  
  /**
    * The ARN of the thing associated with the wireless device.
    */
  var ThingArn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ThingArn] = js.undefined
  
  /**
    * The name of the thing associated with the wireless device. The value is empty if a thing isn't associated with the device.
    */
  var ThingName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ThingName] = js.undefined
  
  /**
    * The wireless device type.
    */
  var Type: js.UndefOr[WirelessDeviceType] = js.undefined
}
object GetWirelessDeviceResponse {
  
  inline def apply(): GetWirelessDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WirelessDeviceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANDevice): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: WirelessDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSidewalk(value: SidewalkDevice): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "ThingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "ThingName", js.undefined)
    
    inline def setType(value: WirelessDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
