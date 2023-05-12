package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotebookMetadataInput extends StObject {
  
  /**
    * The ID of the notebook whose metadata is to be retrieved.
    */
  var NotebookId: typings.awsSdk.clientsAthenaMod.NotebookId
}
object GetNotebookMetadataInput {
  
  inline def apply(NotebookId: NotebookId): GetNotebookMetadataInput = {
    val __obj = js.Dynamic.literal(NotebookId = NotebookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotebookMetadataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNotebookMetadataInput] (val x: Self) extends AnyVal {
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
  }
}
