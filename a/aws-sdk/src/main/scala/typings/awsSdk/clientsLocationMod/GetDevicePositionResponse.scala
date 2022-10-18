package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePositionResponse extends StObject {
  
  /**
    * The accuracy of the device position.
    */
  var Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined
  
  /**
    * The device whose position you retrieved.
    */
  var DeviceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The last known device position.
    */
  var Position: typings.awsSdk.clientsLocationMod.Position
  
  /**
    * The properties associated with the position.
    */
  var PositionProperties: js.UndefOr[PropertyMap] = js.undefined
  
  /**
    * The timestamp for when the tracker resource received the device position in  ISO 8601  format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var ReceivedTime: js.Date
  
  /**
    * The timestamp at which the device's position was determined. Uses  ISO 8601  format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var SampleTime: js.Date
}
object GetDevicePositionResponse {
  
  inline def apply(Position: Position, ReceivedTime: js.Date, SampleTime: js.Date): GetDevicePositionResponse = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ReceivedTime = ReceivedTime.asInstanceOf[js.Any], SampleTime = SampleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePositionResponse]
  }
  
  extension [Self <: GetDevicePositionResponse](x: Self) {
    
    inline def setAccuracy(value: PositionalAccuracy): Self = StObject.set(x, "Accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "Accuracy", js.undefined)
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionProperties(value: PropertyMap): Self = StObject.set(x, "PositionProperties", value.asInstanceOf[js.Any])
    
    inline def setPositionPropertiesUndefined: Self = StObject.set(x, "PositionProperties", js.undefined)
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "Position", js.Array(value*))
    
    inline def setReceivedTime(value: js.Date): Self = StObject.set(x, "ReceivedTime", value.asInstanceOf[js.Any])
    
    inline def setSampleTime(value: js.Date): Self = StObject.set(x, "SampleTime", value.asInstanceOf[js.Any])
  }
}
