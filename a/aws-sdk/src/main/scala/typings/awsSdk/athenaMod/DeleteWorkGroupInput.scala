package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkGroupInput extends StObject {
  
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
    */
  var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The unique name of the workgroup to delete.
    */
  var WorkGroup: WorkGroupName = js.native
}
object DeleteWorkGroupInput {
  
  @scala.inline
  def apply(WorkGroup: WorkGroupName): DeleteWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkGroupInput]
  }
  
  @scala.inline
  implicit class DeleteWorkGroupInputMutableBuilder[Self <: DeleteWorkGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursiveDeleteOption(value: BoxedBoolean): Self = StObject.set(x, "RecursiveDeleteOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveDeleteOptionUndefined: Self = StObject.set(x, "RecursiveDeleteOption", js.undefined)
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
