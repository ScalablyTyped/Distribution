package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceResponse extends StObject {
  
  /**
    * Edge Manager agent version.
    */
  var AgentVersion: js.UndefOr[EdgeVersion] = js.undefined
  
  /**
    * A description of the device.
    */
  var Description: js.UndefOr[DeviceDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var DeviceArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DeviceArn] = js.undefined
  
  /**
    * The name of the fleet the device belongs to.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The unique identifier of the device.
    */
  var DeviceName: EntityName
  
  /**
    * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
    */
  var IotThingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The last heartbeat received from the device.
    */
  var LatestHeartbeat: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of models.
    */
  var MaxModels: js.UndefOr[Integer] = js.undefined
  
  /**
    * Models on the device.
    */
  var Models: js.UndefOr[EdgeModels] = js.undefined
  
  /**
    * The response from the last list when returning a list large enough to need tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The timestamp of the last registration or de-reregistration.
    */
  var RegistrationTime: js.Date
}
object DescribeDeviceResponse {
  
  inline def apply(DeviceFleetName: EntityName, DeviceName: EntityName, RegistrationTime: js.Date): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], RegistrationTime = RegistrationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentVersion(value: EdgeVersion): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setDescription(value: DeviceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: EntityName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setIotThingName(value: ThingName): Self = StObject.set(x, "IotThingName", value.asInstanceOf[js.Any])
    
    inline def setIotThingNameUndefined: Self = StObject.set(x, "IotThingName", js.undefined)
    
    inline def setLatestHeartbeat(value: js.Date): Self = StObject.set(x, "LatestHeartbeat", value.asInstanceOf[js.Any])
    
    inline def setLatestHeartbeatUndefined: Self = StObject.set(x, "LatestHeartbeat", js.undefined)
    
    inline def setMaxModels(value: Integer): Self = StObject.set(x, "MaxModels", value.asInstanceOf[js.Any])
    
    inline def setMaxModelsUndefined: Self = StObject.set(x, "MaxModels", js.undefined)
    
    inline def setModels(value: EdgeModels): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setModelsVarargs(value: EdgeModel*): Self = StObject.set(x, "Models", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegistrationTime(value: js.Date): Self = StObject.set(x, "RegistrationTime", value.asInstanceOf[js.Any])
  }
}
