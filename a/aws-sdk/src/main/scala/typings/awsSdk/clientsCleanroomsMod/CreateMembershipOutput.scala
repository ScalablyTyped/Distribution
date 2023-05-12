package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembershipOutput extends StObject {
  
  /**
    * The membership that was created.
    */
  var membership: Membership
}
object CreateMembershipOutput {
  
  inline def apply(membership: Membership): CreateMembershipOutput = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembershipOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMembershipOutput] (val x: Self) extends AnyVal {
    
    inline def setMembership(value: Membership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
  }
}
