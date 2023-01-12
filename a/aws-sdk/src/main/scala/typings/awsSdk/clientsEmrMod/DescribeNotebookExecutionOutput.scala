package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotebookExecutionOutput extends StObject {
  
  /**
    * Properties of the notebook execution.
    */
  var NotebookExecution: js.UndefOr[typings.awsSdk.clientsEmrMod.NotebookExecution] = js.undefined
}
object DescribeNotebookExecutionOutput {
  
  inline def apply(): DescribeNotebookExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookExecutionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNotebookExecutionOutput] (val x: Self) extends AnyVal {
    
    inline def setNotebookExecution(value: NotebookExecution): Self = StObject.set(x, "NotebookExecution", value.asInstanceOf[js.Any])
    
    inline def setNotebookExecutionUndefined: Self = StObject.set(x, "NotebookExecution", js.undefined)
  }
}
