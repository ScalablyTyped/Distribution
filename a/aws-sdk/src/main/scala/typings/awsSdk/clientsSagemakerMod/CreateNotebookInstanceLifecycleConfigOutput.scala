package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookInstanceLifecycleConfigOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigArn] = js.undefined
}
object CreateNotebookInstanceLifecycleConfigOutput {
  
  inline def apply(): CreateNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotebookInstanceLifecycleConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceLifecycleConfigArnUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", js.undefined)
  }
}
