package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBranchResult extends StObject {
  
  /**
    *  The branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch
}
object DeleteBranchResult {
  
  inline def apply(branch: Branch): DeleteBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchResult]
  }
  
  extension [Self <: DeleteBranchResult](x: Self) {
    
    inline def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
