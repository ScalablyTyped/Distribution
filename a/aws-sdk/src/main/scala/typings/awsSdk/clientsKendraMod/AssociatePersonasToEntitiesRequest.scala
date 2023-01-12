package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePersonasToEntitiesRequest extends StObject {
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source. The available personas or access roles are Owner and Viewer. For more information on these personas, see Providing access to your search page.
    */
  var Personas: EntityPersonaConfigurationList
}
object AssociatePersonasToEntitiesRequest {
  
  inline def apply(Id: ExperienceId, IndexId: IndexId, Personas: EntityPersonaConfigurationList): AssociatePersonasToEntitiesRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any], Personas = Personas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePersonasToEntitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatePersonasToEntitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setPersonas(value: EntityPersonaConfigurationList): Self = StObject.set(x, "Personas", value.asInstanceOf[js.Any])
    
    inline def setPersonasVarargs(value: EntityPersonaConfiguration*): Self = StObject.set(x, "Personas", js.Array(value*))
  }
}
