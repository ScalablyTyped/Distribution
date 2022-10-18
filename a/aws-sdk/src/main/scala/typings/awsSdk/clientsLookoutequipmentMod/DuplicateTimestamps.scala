package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateTimestamps extends StObject {
  
  /**
    *  Indicates the total number of duplicate timestamps. 
    */
  var TotalNumberOfDuplicateTimestamps: Integer
}
object DuplicateTimestamps {
  
  inline def apply(TotalNumberOfDuplicateTimestamps: Integer): DuplicateTimestamps = {
    val __obj = js.Dynamic.literal(TotalNumberOfDuplicateTimestamps = TotalNumberOfDuplicateTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateTimestamps]
  }
  
  extension [Self <: DuplicateTimestamps](x: Self) {
    
    inline def setTotalNumberOfDuplicateTimestamps(value: Integer): Self = StObject.set(x, "TotalNumberOfDuplicateTimestamps", value.asInstanceOf[js.Any])
  }
}
