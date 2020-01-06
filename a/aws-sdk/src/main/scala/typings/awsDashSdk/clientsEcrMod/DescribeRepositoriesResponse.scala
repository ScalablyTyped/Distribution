package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoriesResponse extends js.Object {
  /**
    * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of repository objects corresponding to valid repositories.
    */
  var repositories: js.UndefOr[RepositoryList] = js.native
}

object DescribeRepositoriesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, repositories: RepositoryList = null): DescribeRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoriesResponse]
  }
}

