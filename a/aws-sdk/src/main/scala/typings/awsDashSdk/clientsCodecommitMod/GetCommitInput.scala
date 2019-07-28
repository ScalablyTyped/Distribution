package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommitInput extends js.Object {
  /**
    * The commit ID. Commit IDs are the full SHA of the commit.
    */
  var commitId: ObjectId
  /**
    * The name of the repository to which the commit was made.
    */
  var repositoryName: RepositoryName
}

object GetCommitInput {
  @scala.inline
  def apply(commitId: ObjectId, repositoryName: RepositoryName): GetCommitInput = {
    val __obj = js.Dynamic.literal(commitId = commitId, repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetCommitInput]
  }
}

