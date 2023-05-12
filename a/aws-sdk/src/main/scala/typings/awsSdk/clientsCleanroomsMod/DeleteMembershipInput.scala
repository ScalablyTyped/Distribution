package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembershipInput extends StObject {
  
  /**
    * The identifier for a membership resource.
    */
  var membershipIdentifier: MembershipIdentifier
}
object DeleteMembershipInput {
  
  inline def apply(membershipIdentifier: MembershipIdentifier): DeleteMembershipInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembershipInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMembershipInput] (val x: Self) extends AnyVal {
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
  }
}
