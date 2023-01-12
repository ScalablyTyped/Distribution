package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityPersonaConfiguration extends StObject {
  
  /**
    * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an email.
    */
  var EntityId: typings.awsSdk.clientsKendraMod.EntityId
  
  /**
    * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity source. The available personas or access roles are Owner and Viewer. For more information on these personas, see Providing access to your search page.
    */
  var Persona: typings.awsSdk.clientsKendraMod.Persona
}
object EntityPersonaConfiguration {
  
  inline def apply(EntityId: EntityId, Persona: Persona): EntityPersonaConfiguration = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], Persona = Persona.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityPersonaConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityPersonaConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setPersona(value: Persona): Self = StObject.set(x, "Persona", value.asInstanceOf[js.Any])
  }
}
