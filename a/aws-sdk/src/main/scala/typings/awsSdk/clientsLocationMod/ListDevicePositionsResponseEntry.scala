package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicePositionsResponseEntry extends StObject {
  
  /**
    * The accuracy of the device position.
    */
  var Accuracy: js.UndefOr[PositionalAccuracy] = js.undefined
  
  /**
    * The ID of the device for this position.
    */
  var DeviceId: Id
  
  /**
    * The last known device position. Empty if no positions currently stored.
    */
  var Position: typings.awsSdk.clientsLocationMod.Position
  
  /**
    * The properties associated with the position.
    */
  var PositionProperties: js.UndefOr[PropertyMap] = js.undefined
  
  /**
    * The timestamp at which the device position was determined. Uses  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var SampleTime: js.Date
}
object ListDevicePositionsResponseEntry {
  
  inline def apply(DeviceId: Id, Position: Position, SampleTime: js.Date): ListDevicePositionsResponseEntry = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], SampleTime = SampleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicePositionsResponseEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicePositionsResponseEntry] (val x: Self) extends AnyVal {
    
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
