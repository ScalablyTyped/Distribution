package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionContext extends StObject {
  
  /**
    * The date and time when the credentials were issued, and whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var attributes: js.UndefOr[SessionContextAttributes] = js.undefined
  
  /**
    * The source and type of credentials that were issued to the entity.
    */
  var sessionIssuer: js.UndefOr[SessionIssuer] = js.undefined
}
object SessionContext {
  
  inline def apply(): SessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionContext] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: SessionContextAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setSessionIssuer(value: SessionIssuer): Self = StObject.set(x, "sessionIssuer", value.asInstanceOf[js.Any])
    
    inline def setSessionIssuerUndefined: Self = StObject.set(x, "sessionIssuer", js.undefined)
  }
}
