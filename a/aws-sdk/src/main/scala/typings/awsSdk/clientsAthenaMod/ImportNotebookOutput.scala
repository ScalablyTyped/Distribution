package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNotebookOutput extends StObject {
  
  /**
    * The ID assigned to the imported notebook.
    */
  var NotebookId: js.UndefOr[typings.awsSdk.clientsAthenaMod.NotebookId] = js.undefined
}
object ImportNotebookOutput {
  
  inline def apply(): ImportNotebookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportNotebookOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportNotebookOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
    
    inline def setNotebookIdUndefined: Self = StObject.set(x, "NotebookId", js.undefined)
  }
}
