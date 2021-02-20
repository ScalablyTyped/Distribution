package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBranchResult extends StObject {
  
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
  implicit class CreateBranchResultMutableBuilder[Self <: CreateBranchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
