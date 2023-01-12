package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingSensorData extends StObject {
  
  /**
    *  Indicates the number of sensors that have atleast some data missing. 
    */
  var AffectedSensorCount: Integer
  
  /**
    *  Indicates the total number of missing values across all the sensors. 
    */
  var TotalNumberOfMissingValues: Integer
}
object MissingSensorData {
  
  inline def apply(AffectedSensorCount: Integer, TotalNumberOfMissingValues: Integer): MissingSensorData = {
    val __obj = js.Dynamic.literal(AffectedSensorCount = AffectedSensorCount.asInstanceOf[js.Any], TotalNumberOfMissingValues = TotalNumberOfMissingValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingSensorData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingSensorData] (val x: Self) extends AnyVal {
    
    inline def setAffectedSensorCount(value: Integer): Self = StObject.set(x, "AffectedSensorCount", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfMissingValues(value: Integer): Self = StObject.set(x, "TotalNumberOfMissingValues", value.asInstanceOf[js.Any])
  }
}
