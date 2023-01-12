package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssignmentResponse extends StObject {
  
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[typings.awsSdk.clientsMturkMod.Assignment] = js.undefined
  
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[typings.awsSdk.clientsMturkMod.HIT] = js.undefined
}
object GetAssignmentResponse {
  
  inline def apply(): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssignmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssignmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAssignment(value: Assignment): Self = StObject.set(x, "Assignment", value.asInstanceOf[js.Any])
    
    inline def setAssignmentUndefined: Self = StObject.set(x, "Assignment", js.undefined)
    
    inline def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    inline def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}
