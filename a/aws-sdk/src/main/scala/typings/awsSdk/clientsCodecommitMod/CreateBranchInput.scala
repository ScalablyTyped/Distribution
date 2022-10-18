package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBranchInput extends StObject {
  
  /**
    * The name of the new branch to create.
    */
  var branchName: BranchName
  
  /**
    * The ID of the commit to point the new branch to.
    */
  var commitId: CommitId
  
  /**
    * The name of the repository in which you want to create the new branch.
    */
  var repositoryName: RepositoryName
}
object CreateBranchInput {
  
  inline def apply(branchName: BranchName, commitId: CommitId, repositoryName: RepositoryName): CreateBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchInput]
  }
  
  extension [Self <: CreateBranchInput](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
