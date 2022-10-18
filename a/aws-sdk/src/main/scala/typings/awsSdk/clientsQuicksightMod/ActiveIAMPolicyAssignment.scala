package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIAMPolicyAssignment extends StObject {
  
  /**
    * A name for the IAM policy assignment.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var PolicyArn: js.UndefOr[Arn] = js.undefined
}
object ActiveIAMPolicyAssignment {
  
  inline def apply(): ActiveIAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveIAMPolicyAssignment]
  }
  
  extension [Self <: ActiveIAMPolicyAssignment](x: Self) {
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
  }
}
