package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCapacityAssignmentConfigurationInput extends StObject {
  
  /**
    * The list of assignments for the capacity assignment configuration.
    */
  var CapacityAssignments: CapacityAssignmentsList
  
  /**
    * The name of the capacity reservation to put a capacity assignment configuration for.
    */
  var CapacityReservationName: typings.awsSdk.clientsAthenaMod.CapacityReservationName
}
object PutCapacityAssignmentConfigurationInput {
  
  inline def apply(CapacityAssignments: CapacityAssignmentsList, CapacityReservationName: CapacityReservationName): PutCapacityAssignmentConfigurationInput = {
    val __obj = js.Dynamic.literal(CapacityAssignments = CapacityAssignments.asInstanceOf[js.Any], CapacityReservationName = CapacityReservationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCapacityAssignmentConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutCapacityAssignmentConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setCapacityAssignments(value: CapacityAssignmentsList): Self = StObject.set(x, "CapacityAssignments", value.asInstanceOf[js.Any])
    
    inline def setCapacityAssignmentsVarargs(value: CapacityAssignment*): Self = StObject.set(x, "CapacityAssignments", js.Array(value*))
    
    inline def setCapacityReservationName(value: CapacityReservationName): Self = StObject.set(x, "CapacityReservationName", value.asInstanceOf[js.Any])
  }
}
