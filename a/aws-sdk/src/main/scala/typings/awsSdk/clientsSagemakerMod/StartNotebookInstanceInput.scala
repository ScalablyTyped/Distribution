package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNotebookInstanceInput extends StObject {
  
  /**
    * The name of the notebook instance to start.
    */
  var NotebookInstanceName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
}
object StartNotebookInstanceInput {
  
  inline def apply(NotebookInstanceName: NotebookInstanceName): StartNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNotebookInstanceInput]
  }
  
  extension [Self <: StartNotebookInstanceInput](x: Self) {
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
