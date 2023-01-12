package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantAccessResult extends StObject {
  
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[typings.awsSdk.clientsOpsworksMod.TemporaryCredential] = js.undefined
}
object GrantAccessResult {
  
  inline def apply(): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantAccessResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantAccessResult] (val x: Self) extends AnyVal {
    
    inline def setTemporaryCredential(value: TemporaryCredential): Self = StObject.set(x, "TemporaryCredential", value.asInstanceOf[js.Any])
    
    inline def setTemporaryCredentialUndefined: Self = StObject.set(x, "TemporaryCredential", js.undefined)
  }
}
