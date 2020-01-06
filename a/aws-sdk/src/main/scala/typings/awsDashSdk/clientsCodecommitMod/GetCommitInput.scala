package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommitInput extends js.Object {
  /**
    * The commit ID. Commit IDs are the full SHA ID of the commit.
    */
  var commitId: ObjectId = js.native
  /**
    * The name of the repository to which the commit was made.
    */
  var repositoryName: RepositoryName = js.native
}

object GetCommitInput {
  @scala.inline
  def apply(commitId: ObjectId, repositoryName: RepositoryName): GetCommitInput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCommitInput]
  }
}

