package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsufficientSensorData extends StObject {
  
  /**
    *  Parameter that describes the total number of sensors that have data completely missing for it. 
    */
  var MissingCompleteSensorData: typings.awsSdk.clientsLookoutequipmentMod.MissingCompleteSensorData
  
  /**
    *  Parameter that describes the total number of sensors that have a short date range of less than 90 days of data overall. 
    */
  var SensorsWithShortDateRange: typings.awsSdk.clientsLookoutequipmentMod.SensorsWithShortDateRange
}
object InsufficientSensorData {
  
  inline def apply(
    MissingCompleteSensorData: MissingCompleteSensorData,
    SensorsWithShortDateRange: SensorsWithShortDateRange
  ): InsufficientSensorData = {
    val __obj = js.Dynamic.literal(MissingCompleteSensorData = MissingCompleteSensorData.asInstanceOf[js.Any], SensorsWithShortDateRange = SensorsWithShortDateRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientSensorData]
  }
  
  extension [Self <: InsufficientSensorData](x: Self) {
    
    inline def setMissingCompleteSensorData(value: MissingCompleteSensorData): Self = StObject.set(x, "MissingCompleteSensorData", value.asInstanceOf[js.Any])
    
    inline def setSensorsWithShortDateRange(value: SensorsWithShortDateRange): Self = StObject.set(x, "SensorsWithShortDateRange", value.asInstanceOf[js.Any])
  }
}
