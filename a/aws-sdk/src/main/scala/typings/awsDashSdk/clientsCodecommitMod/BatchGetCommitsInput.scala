package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetCommitsInput extends js.Object {
  /**
    * The full commit IDs of the commits to get information about.  You must supply the full SHAs of each commit. You cannot use shortened SHAs. 
    */
  var commitIds: CommitIdsInputList
  /**
    * The name of the repository that contains the commits.
    */
  var repositoryName: RepositoryName
}

object BatchGetCommitsInput {
  @scala.inline
  def apply(commitIds: CommitIdsInputList, repositoryName: RepositoryName): BatchGetCommitsInput = {
    val __obj = js.Dynamic.literal(commitIds = commitIds, repositoryName = repositoryName)
  
    __obj.asInstanceOf[BatchGetCommitsInput]
  }
}

