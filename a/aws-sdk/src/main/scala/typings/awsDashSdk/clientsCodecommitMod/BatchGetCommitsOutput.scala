package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCommitsOutput extends js.Object {
  /**
    * An array of commit data type objects, each of which contains information about a specified commit.
    */
  var commits: js.UndefOr[CommitObjectsList] = js.native
  /**
    * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with more information.
    */
  var errors: js.UndefOr[BatchGetCommitsErrorsList] = js.native
}

object BatchGetCommitsOutput {
  @scala.inline
  def apply(commits: CommitObjectsList = null, errors: BatchGetCommitsErrorsList = null): BatchGetCommitsOutput = {
    val __obj = js.Dynamic.literal()
    if (commits != null) __obj.updateDynamic("commits")(commits.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCommitsOutput]
  }
}

