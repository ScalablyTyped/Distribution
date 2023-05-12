package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.RunId
import typings.awsSdk.clientsOmicsMod.TaskId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetRunTaskRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetRunTaskRequestwaiterWa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The task's ID.
    */
  var id: RunId
  
  /**
    * The task's ID.
    */
  var taskId: TaskId
}
object GetRunTaskRequestwaiterWa {
  
  inline def apply(id: RunId, taskId: TaskId): GetRunTaskRequestwaiterWa = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunTaskRequestwaiterWa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunTaskRequestwaiterWa] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
