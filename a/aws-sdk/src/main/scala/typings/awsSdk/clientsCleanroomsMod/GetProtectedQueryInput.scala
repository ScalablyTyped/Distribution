package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProtectedQueryInput extends StObject {
  
  /**
    * The identifier for a membership in a protected query instance.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The identifier for a protected query instance.
    */
  var protectedQueryIdentifier: ProtectedQueryIdentifier
}
object GetProtectedQueryInput {
  
  inline def apply(membershipIdentifier: MembershipIdentifier, protectedQueryIdentifier: ProtectedQueryIdentifier): GetProtectedQueryInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any], protectedQueryIdentifier = protectedQueryIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectedQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProtectedQueryInput] (val x: Self) extends AnyVal {
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setProtectedQueryIdentifier(value: ProtectedQueryIdentifier): Self = StObject.set(x, "protectedQueryIdentifier", value.asInstanceOf[js.Any])
  }
}
