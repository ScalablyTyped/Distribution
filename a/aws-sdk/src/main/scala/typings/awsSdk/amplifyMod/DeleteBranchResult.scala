package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBranchResult extends StObject {
  
  /**
    *  The branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch = js.native
}
object DeleteBranchResult {
  
  @scala.inline
  def apply(branch: Branch): DeleteBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchResult]
  }
  
  @scala.inline
  implicit class DeleteBranchResultMutableBuilder[Self <: DeleteBranchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
