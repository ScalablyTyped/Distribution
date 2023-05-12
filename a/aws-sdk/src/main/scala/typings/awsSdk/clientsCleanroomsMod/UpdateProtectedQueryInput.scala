package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProtectedQueryInput extends StObject {
  
  /**
    * The identifier for a member of a protected query instance.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The identifier for a protected query instance.
    */
  var protectedQueryIdentifier: ProtectedQueryIdentifier
  
  /**
    * The target status of a query. Used to update the execution status of a currently running query.
    */
  var targetStatus: TargetProtectedQueryStatus
}
object UpdateProtectedQueryInput {
  
  inline def apply(
    membershipIdentifier: MembershipIdentifier,
    protectedQueryIdentifier: ProtectedQueryIdentifier,
    targetStatus: TargetProtectedQueryStatus
  ): UpdateProtectedQueryInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any], protectedQueryIdentifier = protectedQueryIdentifier.asInstanceOf[js.Any], targetStatus = targetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProtectedQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProtectedQueryInput] (val x: Self) extends AnyVal {
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setProtectedQueryIdentifier(value: ProtectedQueryIdentifier): Self = StObject.set(x, "protectedQueryIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetStatus(value: TargetProtectedQueryStatus): Self = StObject.set(x, "targetStatus", value.asInstanceOf[js.Any])
  }
}
