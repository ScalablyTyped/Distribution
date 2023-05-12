package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMembershipInput extends StObject {
  
  /**
    * The unique identifier of the membership.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * An indicator as to whether query logging has been enabled or disabled for the collaboration.
    */
  var queryLogStatus: js.UndefOr[MembershipQueryLogStatus] = js.undefined
}
object UpdateMembershipInput {
  
  inline def apply(membershipIdentifier: MembershipIdentifier): UpdateMembershipInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMembershipInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMembershipInput] (val x: Self) extends AnyVal {
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setQueryLogStatus(value: MembershipQueryLogStatus): Self = StObject.set(x, "queryLogStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryLogStatusUndefined: Self = StObject.set(x, "queryLogStatus", js.undefined)
  }
}
