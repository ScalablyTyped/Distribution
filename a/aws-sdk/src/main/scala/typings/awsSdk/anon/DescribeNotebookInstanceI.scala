package typings.awsSdk.anon

import typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeNotebookInstanceInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeNotebookInstanceI extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the notebook instance that you want information about.
    */
  var NotebookInstanceName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
}
object DescribeNotebookInstanceI {
  
  inline def apply(NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceI = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceI]
  }
  
  extension [Self <: DescribeNotebookInstanceI](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
