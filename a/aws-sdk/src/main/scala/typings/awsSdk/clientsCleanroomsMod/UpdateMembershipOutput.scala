package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMembershipOutput extends StObject {
  
  var membership: Membership
}
object UpdateMembershipOutput {
  
  inline def apply(membership: Membership): UpdateMembershipOutput = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMembershipOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMembershipOutput] (val x: Self) extends AnyVal {
    
    inline def setMembership(value: Membership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
  }
}
