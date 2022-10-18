package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchInfo extends StObject {
  
  /**
    * The name of the branch.
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The ID of the last commit made to the branch.
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
}
object BranchInfo {
  
  inline def apply(): BranchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BranchInfo]
  }
  
  extension [Self <: BranchInfo](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
  }
}
