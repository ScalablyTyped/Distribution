package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteAction extends StObject {
  
  /**
    * The Amazon Web Services account ID to invite.
    */
  var Principal: PrincipalString
}
object InviteAction {
  
  inline def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InviteAction] (val x: Self) extends AnyVal {
    
    inline def setPrincipal(value: PrincipalString): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
  }
}
