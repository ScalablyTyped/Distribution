package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBranchResult extends StObject {
  
  /**
    *  Describes the branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch
}
object CreateBranchResult {
  
  inline def apply(branch: Branch): CreateBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBranchResult] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
