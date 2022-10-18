package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommitInput extends StObject {
  
  /**
    * The commit ID. Commit IDs are the full SHA ID of the commit.
    */
  var commitId: ObjectId
  
  /**
    * The name of the repository to which the commit was made.
    */
  var repositoryName: RepositoryName
}
object GetCommitInput {
  
  inline def apply(commitId: ObjectId, repositoryName: RepositoryName): GetCommitInput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitInput]
  }
  
  extension [Self <: GetCommitInput](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
