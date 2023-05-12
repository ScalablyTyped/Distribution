package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookOutput extends StObject {
  
  /**
    * A unique identifier for the notebook.
    */
  var NotebookId: js.UndefOr[typings.awsSdk.clientsAthenaMod.NotebookId] = js.undefined
}
object CreateNotebookOutput {
  
  inline def apply(): CreateNotebookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotebookOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
    
    inline def setNotebookIdUndefined: Self = StObject.set(x, "NotebookId", js.undefined)
  }
}
