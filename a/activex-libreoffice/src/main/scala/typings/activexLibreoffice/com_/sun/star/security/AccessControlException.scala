package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exception notifying a lacking permission to access data or execute code thus it is thrown if permission ought to be denied.
  * @since OOo 1.1.2
  */
trait AccessControlException
  extends StObject
     with Exception {
  
  /** lacking permission. */
  var LackingPermission: Any
}
object AccessControlException {
  
  inline def apply(Context: XInterface, LackingPermission: Any, Message: String): AccessControlException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], LackingPermission = LackingPermission.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlException]
  }
  
  extension [Self <: AccessControlException](x: Self) {
    
    inline def setLackingPermission(value: Any): Self = StObject.set(x, "LackingPermission", value.asInstanceOf[js.Any])
  }
}
