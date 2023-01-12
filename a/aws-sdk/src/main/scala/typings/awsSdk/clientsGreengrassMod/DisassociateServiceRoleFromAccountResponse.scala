package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateServiceRoleFromAccountResponse extends StObject {
  
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[string] = js.undefined
}
object DisassociateServiceRoleFromAccountResponse {
  
  inline def apply(): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateServiceRoleFromAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setDisassociatedAt(value: string): Self = StObject.set(x, "DisassociatedAt", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedAtUndefined: Self = StObject.set(x, "DisassociatedAt", js.undefined)
  }
}
