package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkGroupOutput extends js.Object {
  
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.athenaMod.WorkGroup] = js.native
}
object GetWorkGroupOutput {
  
  @scala.inline
  def apply(): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
  
  @scala.inline
  implicit class GetWorkGroupOutputOps[Self <: GetWorkGroupOutput] (val x: Self) extends AnyVal {
    
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
    def setWorkGroup(value: WorkGroup): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
}
