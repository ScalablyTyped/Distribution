package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityAssignmentConfiguration extends StObject {
  
  /**
    * The list of assignments that make up the capacity assignment configuration.
    */
  var CapacityAssignments: js.UndefOr[CapacityAssignmentsList] = js.undefined
  
  /**
    * The name of the reservation that the capacity assignment configuration is for.
    */
  var CapacityReservationName: js.UndefOr[typings.awsSdk.clientsAthenaMod.CapacityReservationName] = js.undefined
}
object CapacityAssignmentConfiguration {
  
  inline def apply(): CapacityAssignmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityAssignmentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityAssignmentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCapacityAssignments(value: CapacityAssignmentsList): Self = StObject.set(x, "CapacityAssignments", value.asInstanceOf[js.Any])
    
    inline def setCapacityAssignmentsUndefined: Self = StObject.set(x, "CapacityAssignments", js.undefined)
    
    inline def setCapacityAssignmentsVarargs(value: CapacityAssignment*): Self = StObject.set(x, "CapacityAssignments", js.Array(value*))
    
    inline def setCapacityReservationName(value: CapacityReservationName): Self = StObject.set(x, "CapacityReservationName", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationNameUndefined: Self = StObject.set(x, "CapacityReservationName", js.undefined)
  }
}
