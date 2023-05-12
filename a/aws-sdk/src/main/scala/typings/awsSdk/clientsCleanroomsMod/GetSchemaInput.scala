package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaInput extends StObject {
  
  /**
    * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * The name of the relation to retrieve the schema for.
    */
  var name: TableAlias
}
object GetSchemaInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier, name: TableAlias): GetSchemaInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSchemaInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
