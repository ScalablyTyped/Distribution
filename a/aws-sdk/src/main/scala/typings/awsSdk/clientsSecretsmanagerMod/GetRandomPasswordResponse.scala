package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRandomPasswordResponse extends StObject {
  
  /**
    * A string with the password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.undefined
}
object GetRandomPasswordResponse {
  
  inline def apply(): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRandomPasswordResponse] (val x: Self) extends AnyVal {
    
    inline def setRandomPassword(value: RandomPasswordType): Self = StObject.set(x, "RandomPassword", value.asInstanceOf[js.Any])
    
    inline def setRandomPasswordUndefined: Self = StObject.set(x, "RandomPassword", js.undefined)
  }
}
