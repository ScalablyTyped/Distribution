package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopNotebookInstanceInput extends StObject {
  
  /**
    * The name of the notebook instance to terminate.
    */
  var NotebookInstanceName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
}
object StopNotebookInstanceInput {
  
  inline def apply(NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookInstanceInput]
  }
  
  extension [Self <: StopNotebookInstanceInput](x: Self) {
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
