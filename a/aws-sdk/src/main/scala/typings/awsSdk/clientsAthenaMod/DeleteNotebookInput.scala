package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotebookInput extends StObject {
  
  /**
    * The ID of the notebook to delete.
    */
  var NotebookId: typings.awsSdk.clientsAthenaMod.NotebookId
}
object DeleteNotebookInput {
  
  inline def apply(NotebookId: NotebookId): DeleteNotebookInput = {
    val __obj = js.Dynamic.literal(NotebookId = NotebookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotebookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNotebookInput] (val x: Self) extends AnyVal {
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
  }
}
