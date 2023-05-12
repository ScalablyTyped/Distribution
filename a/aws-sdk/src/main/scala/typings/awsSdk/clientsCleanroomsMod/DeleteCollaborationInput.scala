package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollaborationInput extends StObject {
  
  /**
    * The identifier for the collaboration.
    */
  var collaborationIdentifier: CollaborationIdentifier
}
object DeleteCollaborationInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier): DeleteCollaborationInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollaborationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollaborationInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
  }
}
