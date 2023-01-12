package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMPolicyAssignment extends StObject {
  
  /**
    * Assignment ID.
    */
  var AssignmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined
  
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AssignmentStatus] = js.undefined
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AwsAccountId] = js.undefined
  
  /**
    * Identities.
    */
  var Identities: js.UndefOr[IdentityMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the IAM policy.
    */
  var PolicyArn: js.UndefOr[Arn] = js.undefined
}
object IAMPolicyAssignment {
  
  inline def apply(): IAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAMPolicyAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAMPolicyAssignment] (val x: Self) extends AnyVal {
    
    inline def setAssignmentId(value: String): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    inline def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setIdentities(value: IdentityMap): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
  }
}
