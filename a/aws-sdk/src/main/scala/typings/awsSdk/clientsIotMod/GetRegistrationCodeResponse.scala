package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegistrationCodeResponse extends StObject {
  
  /**
    * The CA certificate registration code.
    */
  var registrationCode: js.UndefOr[RegistrationCode] = js.undefined
}
object GetRegistrationCodeResponse {
  
  inline def apply(): GetRegistrationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistrationCodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRegistrationCodeResponse] (val x: Self) extends AnyVal {
    
    inline def setRegistrationCode(value: RegistrationCode): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
    
    inline def setRegistrationCodeUndefined: Self = StObject.set(x, "registrationCode", js.undefined)
  }
}
