package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetCommitsOutput extends js.Object {
  /**
    * An array of commit data type objects, each of which contains information about a specified commit.
    */
  var commits: js.UndefOr[CommitObjectsList] = js.undefined
  /**
    * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a shortened SHA or that commit was not found in the specified repository, the ID will return an error object with additional information.
    */
  var errors: js.UndefOr[BatchGetCommitsErrorsList] = js.undefined
}

object BatchGetCommitsOutput {
  @scala.inline
  def apply(commits: CommitObjectsList = null, errors: BatchGetCommitsErrorsList = null): BatchGetCommitsOutput = {
    val __obj = js.Dynamic.literal()
    if (commits != null) __obj.updateDynamic("commits")(commits)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[BatchGetCommitsOutput]
  }
}

