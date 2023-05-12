package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonasSummary extends StObject {
  
  /**
    * The Unix timestamp when the summary information was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an email.
    */
  var EntityId: js.UndefOr[typings.awsSdk.clientsKendraMod.EntityId] = js.undefined
  
  /**
    * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity source. The available personas or access roles are Owner and Viewer. For more information on these personas, see Providing access to your search page.
    */
  var Persona: js.UndefOr[typings.awsSdk.clientsKendraMod.Persona] = js.undefined
  
  /**
    * The Unix timestamp when the summary information was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object PersonasSummary {
  
  inline def apply(): PersonasSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonasSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonasSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setPersona(value: Persona): Self = StObject.set(x, "Persona", value.asInstanceOf[js.Any])
    
    inline def setPersonaUndefined: Self = StObject.set(x, "Persona", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
