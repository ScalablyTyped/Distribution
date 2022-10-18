package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingCompleteSensorData extends StObject {
  
  /**
    *  Indicates the number of sensors that have data missing completely. 
    */
  var AffectedSensorCount: Integer
}
object MissingCompleteSensorData {
  
  inline def apply(AffectedSensorCount: Integer): MissingCompleteSensorData = {
    val __obj = js.Dynamic.literal(AffectedSensorCount = AffectedSensorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingCompleteSensorData]
  }
  
  extension [Self <: MissingCompleteSensorData](x: Self) {
    
    inline def setAffectedSensorCount(value: Integer): Self = StObject.set(x, "AffectedSensorCount", value.asInstanceOf[js.Any])
  }
}
