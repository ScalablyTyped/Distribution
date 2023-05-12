package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembershipOutput extends StObject {
  
  /**
    * The membership retrieved for the provided identifier.
    */
  var membership: Membership
}
object GetMembershipOutput {
  
  inline def apply(membership: Membership): GetMembershipOutput = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembershipOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMembershipOutput] (val x: Self) extends AnyVal {
    
    inline def setMembership(value: Membership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
  }
}
