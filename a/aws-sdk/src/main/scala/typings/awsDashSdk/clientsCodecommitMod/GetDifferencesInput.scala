package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDifferencesInput extends js.Object {
  /**
    * A non-negative integer used to limit the number of returned results.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodecommitMod.NextToken] = js.undefined
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
    */
  var afterCommitSpecifier: CommitName
  /**
    * The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all paths.
    */
  var afterPath: js.UndefOr[Path] = js.undefined
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit ID. Optional. If not specified, all changes prior to the afterCommitSpecifier value will be shown. If you do not use beforeCommitSpecifier in your request, consider limiting the results with maxResults.
    */
  var beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined
  /**
    * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If beforePath and afterPath are not specified, differences will be shown for all paths.
    */
  var beforePath: js.UndefOr[Path] = js.undefined
  /**
    * The name of the repository where you want to get differences.
    */
  var repositoryName: RepositoryName
}

object GetDifferencesInput {
  @scala.inline
  def apply(
    afterCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    afterPath: Path = null,
    beforeCommitSpecifier: CommitName = null,
    beforePath: Path = null
  ): GetDifferencesInput = {
    val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier, repositoryName = repositoryName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (afterPath != null) __obj.updateDynamic("afterPath")(afterPath)
    if (beforeCommitSpecifier != null) __obj.updateDynamic("beforeCommitSpecifier")(beforeCommitSpecifier)
    if (beforePath != null) __obj.updateDynamic("beforePath")(beforePath)
    __obj.asInstanceOf[GetDifferencesInput]
  }
}

