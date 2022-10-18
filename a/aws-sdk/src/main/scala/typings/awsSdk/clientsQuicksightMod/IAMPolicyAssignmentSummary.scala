package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMPolicyAssignmentSummary extends StObject {
  
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined
  
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AssignmentStatus] = js.undefined
}
object IAMPolicyAssignmentSummary {
  
  inline def apply(): IAMPolicyAssignmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAMPolicyAssignmentSummary]
  }
  
  extension [Self <: IAMPolicyAssignmentSummary](x: Self) {
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    inline def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
  }
}
