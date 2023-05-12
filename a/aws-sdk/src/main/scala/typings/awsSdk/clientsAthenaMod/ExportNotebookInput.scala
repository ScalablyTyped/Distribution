package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNotebookInput extends StObject {
  
  /**
    * The ID of the notebook to export.
    */
  var NotebookId: typings.awsSdk.clientsAthenaMod.NotebookId
}
object ExportNotebookInput {
  
  inline def apply(NotebookId: NotebookId): ExportNotebookInput = {
    val __obj = js.Dynamic.literal(NotebookId = NotebookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNotebookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportNotebookInput] (val x: Self) extends AnyVal {
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
  }
}
