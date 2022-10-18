package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualitySummary extends StObject {
  
  /**
    *  Parameter that gives information about duplicate timestamps in the input data. 
    */
  var DuplicateTimestamps: typings.awsSdk.clientsLookoutequipmentMod.DuplicateTimestamps
  
  /**
    *  Parameter that gives information about insufficient data for sensors in the dataset. This includes information about those sensors that have complete data missing and those with a short date range. 
    */
  var InsufficientSensorData: typings.awsSdk.clientsLookoutequipmentMod.InsufficientSensorData
  
  /**
    *  Parameter that gives information about data that is invalid over all the sensors in the input data. 
    */
  var InvalidSensorData: typings.awsSdk.clientsLookoutequipmentMod.InvalidSensorData
  
  /**
    *  Parameter that gives information about data that is missing over all the sensors in the input data. 
    */
  var MissingSensorData: typings.awsSdk.clientsLookoutequipmentMod.MissingSensorData
  
  /**
    *  Parameter that gives information about unsupported timestamps in the input data. 
    */
  var UnsupportedTimestamps: typings.awsSdk.clientsLookoutequipmentMod.UnsupportedTimestamps
}
object DataQualitySummary {
  
  inline def apply(
    DuplicateTimestamps: DuplicateTimestamps,
    InsufficientSensorData: InsufficientSensorData,
    InvalidSensorData: InvalidSensorData,
    MissingSensorData: MissingSensorData,
    UnsupportedTimestamps: UnsupportedTimestamps
  ): DataQualitySummary = {
    val __obj = js.Dynamic.literal(DuplicateTimestamps = DuplicateTimestamps.asInstanceOf[js.Any], InsufficientSensorData = InsufficientSensorData.asInstanceOf[js.Any], InvalidSensorData = InvalidSensorData.asInstanceOf[js.Any], MissingSensorData = MissingSensorData.asInstanceOf[js.Any], UnsupportedTimestamps = UnsupportedTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualitySummary]
  }
  
  extension [Self <: DataQualitySummary](x: Self) {
    
    inline def setDuplicateTimestamps(value: DuplicateTimestamps): Self = StObject.set(x, "DuplicateTimestamps", value.asInstanceOf[js.Any])
    
    inline def setInsufficientSensorData(value: InsufficientSensorData): Self = StObject.set(x, "InsufficientSensorData", value.asInstanceOf[js.Any])
    
    inline def setInvalidSensorData(value: InvalidSensorData): Self = StObject.set(x, "InvalidSensorData", value.asInstanceOf[js.Any])
    
    inline def setMissingSensorData(value: MissingSensorData): Self = StObject.set(x, "MissingSensorData", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedTimestamps(value: UnsupportedTimestamps): Self = StObject.set(x, "UnsupportedTimestamps", value.asInstanceOf[js.Any])
  }
}
