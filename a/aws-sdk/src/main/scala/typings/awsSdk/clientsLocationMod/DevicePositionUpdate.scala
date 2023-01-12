package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePositionUpdate extends StObject {
  
  /**
    * The accuracy of the device position.
    */
  var Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined
  
  /**
    * The device associated to the position update.
    */
  var DeviceId: Id
  
  /**
    * The latest device position defined in WGS 84 format: [X or longitude, Y or latitude].
    */
  var Position: typings.awsSdk.clientsLocationMod.Position
  
  /**
    * Associates one of more properties with the position update. A property is a key-value pair stored with the position update and added to any geofence event the update may trigger. Format: "key" : "value" 
    */
  var PositionProperties: js.UndefOr[PropertyMap] = js.undefined
  
  /**
    * The timestamp at which the device's position was determined. Uses ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var SampleTime: js.Date
}
object DevicePositionUpdate {
  
  inline def apply(DeviceId: Id, Position: Position, SampleTime: js.Date): DevicePositionUpdate = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], SampleTime = SampleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePositionUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevicePositionUpdate] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: PositionalAccuracy): Self = StObject.set(x, "Accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "Accuracy", js.undefined)
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionProperties(value: PropertyMap): Self = StObject.set(x, "PositionProperties", value.asInstanceOf[js.Any])
    
    inline def setPositionPropertiesUndefined: Self = StObject.set(x, "PositionProperties", js.undefined)
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "Position", js.Array(value*))
    
    inline def setSampleTime(value: js.Date): Self = StObject.set(x, "SampleTime", value.asInstanceOf[js.Any])
  }
}
