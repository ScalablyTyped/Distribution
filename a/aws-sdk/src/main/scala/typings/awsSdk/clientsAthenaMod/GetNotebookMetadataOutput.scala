package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotebookMetadataOutput extends StObject {
  
  /**
    * The metadata that is returned for the specified notebook ID.
    */
  var NotebookMetadata: js.UndefOr[typings.awsSdk.clientsAthenaMod.NotebookMetadata] = js.undefined
}
object GetNotebookMetadataOutput {
  
  inline def apply(): GetNotebookMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotebookMetadataOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNotebookMetadataOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookMetadata(value: NotebookMetadata): Self = StObject.set(x, "NotebookMetadata", value.asInstanceOf[js.Any])
    
    inline def setNotebookMetadataUndefined: Self = StObject.set(x, "NotebookMetadata", js.undefined)
  }
}
