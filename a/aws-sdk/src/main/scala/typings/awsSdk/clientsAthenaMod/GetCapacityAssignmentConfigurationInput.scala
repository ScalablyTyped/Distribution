package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCapacityAssignmentConfigurationInput extends StObject {
  
  /**
    * The name of the capacity reservation to retrieve the capacity assignment configuration for.
    */
  var CapacityReservationName: typings.awsSdk.clientsAthenaMod.CapacityReservationName
}
object GetCapacityAssignmentConfigurationInput {
  
  inline def apply(CapacityReservationName: CapacityReservationName): GetCapacityAssignmentConfigurationInput = {
    val __obj = js.Dynamic.literal(CapacityReservationName = CapacityReservationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityAssignmentConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCapacityAssignmentConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservationName(value: CapacityReservationName): Self = StObject.set(x, "CapacityReservationName", value.asInstanceOf[js.Any])
  }
}
