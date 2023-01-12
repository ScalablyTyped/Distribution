package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyInfoResponse extends StObject {
  
  /**
    * The number used to identify the Amazon Web Services account.
    */
  var Account: js.UndefOr[accountType] = js.undefined
}
object GetAccessKeyInfoResponse {
  
  inline def apply(): GetAccessKeyInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessKeyInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: accountType): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
