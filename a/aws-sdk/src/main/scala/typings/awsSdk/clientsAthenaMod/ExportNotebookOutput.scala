package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNotebookOutput extends StObject {
  
  /**
    * The notebook metadata, including notebook ID, notebook name, and workgroup name.
    */
  var NotebookMetadata: js.UndefOr[typings.awsSdk.clientsAthenaMod.NotebookMetadata] = js.undefined
  
  /**
    * The content of the exported notebook.
    */
  var Payload: js.UndefOr[typings.awsSdk.clientsAthenaMod.Payload] = js.undefined
}
object ExportNotebookOutput {
  
  inline def apply(): ExportNotebookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportNotebookOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportNotebookOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookMetadata(value: NotebookMetadata): Self = StObject.set(x, "NotebookMetadata", value.asInstanceOf[js.Any])
    
    inline def setNotebookMetadataUndefined: Self = StObject.set(x, "NotebookMetadata", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
