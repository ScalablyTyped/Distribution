package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDelegatedAdminAccountResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Amazon Inspector delegated administrator.
    */
  var delegatedAdmin: js.UndefOr[DelegatedAdmin] = js.undefined
}
object GetDelegatedAdminAccountResponse {
  
  inline def apply(): GetDelegatedAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDelegatedAdminAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDelegatedAdminAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdmin(value: DelegatedAdmin): Self = StObject.set(x, "delegatedAdmin", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminUndefined: Self = StObject.set(x, "delegatedAdmin", js.undefined)
  }
}
