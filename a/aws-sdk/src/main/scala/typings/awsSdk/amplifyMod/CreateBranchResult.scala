package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBranchResult extends js.Object {
  
  /**
    *  Describes the branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch = js.native
}
object CreateBranchResult {
  
  @scala.inline
  def apply(branch: Branch): CreateBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchResult]
  }
  
  @scala.inline
  implicit class CreateBranchResultOps[Self <: CreateBranchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranch(value: Branch): Self = this.set("branch", value.asInstanceOf[js.Any])
  }
}
