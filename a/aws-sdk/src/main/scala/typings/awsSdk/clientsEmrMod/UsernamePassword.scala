package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernamePassword extends StObject {
  
  /**
    * The password associated with the temporary credentials that you use to connect to cluster endpoints.
    */
  var Password: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The username associated with the temporary credentials that you use to connect to cluster endpoints.
    */
  var Username: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object UsernamePassword {
  
  inline def apply(): UsernamePassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsernamePassword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsernamePassword] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: XmlStringMaxLen256): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUsername(value: XmlStringMaxLen256): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
