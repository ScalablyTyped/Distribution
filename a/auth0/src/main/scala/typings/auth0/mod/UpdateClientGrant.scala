package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Partial<auth0.auth0.CreateClientGrant>, 'scope'> */
trait UpdateClientGrant extends StObject {
  
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateClientGrant {
  
  inline def apply(): UpdateClientGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClientGrant]
  }
  
  extension [Self <: UpdateClientGrant](x: Self) {
    
    inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
