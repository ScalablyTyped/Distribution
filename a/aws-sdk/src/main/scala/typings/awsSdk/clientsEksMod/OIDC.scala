package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDC extends StObject {
  
  /**
    * The issuer URL for the OIDC identity provider.
    */
  var issuer: js.UndefOr[String] = js.undefined
}
object OIDC {
  
  inline def apply(): OIDC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OIDC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OIDC] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
  }
}
