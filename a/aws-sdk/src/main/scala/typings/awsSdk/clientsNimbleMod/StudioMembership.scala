package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioMembership extends StObject {
  
  /**
    * The ID of the identity store.
    */
  var identityStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The persona.
    */
  var persona: js.UndefOr[StudioPersona] = js.undefined
  
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[String] = js.undefined
  
  /**
    * The Active Directory Security Identifier for this user, if available.
    */
  var sid: js.UndefOr[String] = js.undefined
}
object StudioMembership {
  
  inline def apply(): StudioMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioMembership]
  }
  
  extension [Self <: StudioMembership](x: Self) {
    
    inline def setIdentityStoreId(value: String): Self = StObject.set(x, "identityStoreId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreIdUndefined: Self = StObject.set(x, "identityStoreId", js.undefined)
    
    inline def setPersona(value: StudioPersona): Self = StObject.set(x, "persona", value.asInstanceOf[js.Any])
    
    inline def setPersonaUndefined: Self = StObject.set(x, "persona", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
  }
}
