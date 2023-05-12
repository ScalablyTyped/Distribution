package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityAssignment extends StObject {
  
  /**
    * The list of workgroup names for the capacity assignment.
    */
  var WorkGroupNames: js.UndefOr[WorkGroupNamesList] = js.undefined
}
object CapacityAssignment {
  
  inline def apply(): CapacityAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityAssignment] (val x: Self) extends AnyVal {
    
    inline def setWorkGroupNames(value: WorkGroupNamesList): Self = StObject.set(x, "WorkGroupNames", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupNamesUndefined: Self = StObject.set(x, "WorkGroupNames", js.undefined)
    
    inline def setWorkGroupNamesVarargs(value: WorkGroupName*): Self = StObject.set(x, "WorkGroupNames", js.Array(value*))
  }
}
