package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * The username and password that you use to connect to cluster endpoints.
    */
  var UsernamePassword: js.UndefOr[typings.awsSdk.clientsEmrMod.UsernamePassword] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setUsernamePassword(value: UsernamePassword): Self = StObject.set(x, "UsernamePassword", value.asInstanceOf[js.Any])
    
    inline def setUsernamePasswordUndefined: Self = StObject.set(x, "UsernamePassword", js.undefined)
  }
}
