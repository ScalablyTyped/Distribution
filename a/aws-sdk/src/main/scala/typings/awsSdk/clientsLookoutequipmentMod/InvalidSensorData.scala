package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidSensorData extends StObject {
  
  /**
    *  Indicates the number of sensors that have at least some invalid values. 
    */
  var AffectedSensorCount: Integer
  
  /**
    *  Indicates the total number of invalid values across all the sensors. 
    */
  var TotalNumberOfInvalidValues: Integer
}
object InvalidSensorData {
  
  inline def apply(AffectedSensorCount: Integer, TotalNumberOfInvalidValues: Integer): InvalidSensorData = {
    val __obj = js.Dynamic.literal(AffectedSensorCount = AffectedSensorCount.asInstanceOf[js.Any], TotalNumberOfInvalidValues = TotalNumberOfInvalidValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSensorData]
  }
  
  extension [Self <: InvalidSensorData](x: Self) {
    
    inline def setAffectedSensorCount(value: Integer): Self = StObject.set(x, "AffectedSensorCount", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfInvalidValues(value: Integer): Self = StObject.set(x, "TotalNumberOfInvalidValues", value.asInstanceOf[js.Any])
  }
}
