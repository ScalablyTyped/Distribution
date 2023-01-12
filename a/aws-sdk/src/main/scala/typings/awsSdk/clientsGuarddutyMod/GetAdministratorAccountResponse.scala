package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdministratorAccountResponse extends StObject {
  
  /**
    * The administrator account details.
    */
  var Administrator: typings.awsSdk.clientsGuarddutyMod.Administrator
}
object GetAdministratorAccountResponse {
  
  inline def apply(Administrator: Administrator): GetAdministratorAccountResponse = {
    val __obj = js.Dynamic.literal(Administrator = Administrator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdministratorAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAdministratorAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAdministrator(value: Administrator): Self = StObject.set(x, "Administrator", value.asInstanceOf[js.Any])
  }
}
