package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: XmlStringMaxLen256
}
object StopNotebookExecutionInput {
  
  inline def apply(NotebookExecutionId: XmlStringMaxLen256): StopNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(NotebookExecutionId = NotebookExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookExecutionInput]
  }
  
  extension [Self <: StopNotebookExecutionInput](x: Self) {
    
    inline def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
  }
}
