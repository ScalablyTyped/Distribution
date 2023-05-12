package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetSchemaInput extends StObject {
  
  /**
    * A unique identifier for the collaboration that the schemas belong to. Currently accepts collaboration ID.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * The names for the schema objects to retrieve.&gt;
    */
  var names: TableAliasList
}
object BatchGetSchemaInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier, names: TableAliasList): BatchGetSchemaInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetSchemaInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetSchemaInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNames(value: TableAliasList): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: TableAlias*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
