package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  /**
    * An object representing the OpenID Connect identity provider information.
    */
  var oidc: js.UndefOr[OIDC] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    inline def setOidc(value: OIDC): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
  }
}
