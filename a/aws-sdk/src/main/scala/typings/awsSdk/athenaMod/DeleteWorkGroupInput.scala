package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkGroupInput extends js.Object {
  
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
  implicit class DeleteWorkGroupInputOps[Self <: DeleteWorkGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveDeleteOption(value: BoxedBoolean): Self = this.set("RecursiveDeleteOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveDeleteOption: Self = this.set("RecursiveDeleteOption", js.undefined)
  }
}
