package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdministratorAccountResponse extends StObject {
  
  var Administrator: js.UndefOr[Invitation] = js.undefined
}
object GetAdministratorAccountResponse {
  
  inline def apply(): GetAdministratorAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdministratorAccountResponse]
  }
  
  extension [Self <: GetAdministratorAccountResponse](x: Self) {
    
    inline def setAdministrator(value: Invitation): Self = StObject.set(x, "Administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "Administrator", js.undefined)
  }
}
