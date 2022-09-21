package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkGroupInput extends StObject {
  
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries or query executions.
    */
  var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The unique name of the workgroup to delete.
    */
  var WorkGroup: WorkGroupName
}
object DeleteWorkGroupInput {
  
  inline def apply(WorkGroup: WorkGroupName): DeleteWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkGroupInput]
  }
  
  extension [Self <: DeleteWorkGroupInput](x: Self) {
    
    inline def setRecursiveDeleteOption(value: BoxedBoolean): Self = StObject.set(x, "RecursiveDeleteOption", value.asInstanceOf[js.Any])
    
    inline def setRecursiveDeleteOptionUndefined: Self = StObject.set(x, "RecursiveDeleteOption", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
