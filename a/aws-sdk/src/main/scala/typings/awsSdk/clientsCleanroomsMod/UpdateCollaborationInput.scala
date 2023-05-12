package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCollaborationInput extends StObject {
  
  /**
    * The identifier for the collaboration.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * A description of the collaboration.
    */
  var description: js.UndefOr[CollaborationDescription] = js.undefined
  
  /**
    * A human-readable identifier provided by the collaboration owner. Display names are not unique.
    */
  var name: js.UndefOr[CollaborationName] = js.undefined
}
object UpdateCollaborationInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier): UpdateCollaborationInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCollaborationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCollaborationInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: CollaborationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: CollaborationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
