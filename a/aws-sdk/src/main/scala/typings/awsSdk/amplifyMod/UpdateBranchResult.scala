package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBranchResult extends StObject {
  
  /**
    *  The branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch
}
object UpdateBranchResult {
  
  inline def apply(branch: Branch): UpdateBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBranchResult]
  }
  
  extension [Self <: UpdateBranchResult](x: Self) {
    
    inline def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
