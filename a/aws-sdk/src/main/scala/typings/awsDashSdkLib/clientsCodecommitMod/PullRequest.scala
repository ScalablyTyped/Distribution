package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user who created the pull request.
    */
  var authorArn: js.UndefOr[Arn] = js.undefined
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The date and time the pull request was originally created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The day and time of the last user or system activity on the pull request, in timestamp format.
    */
  var lastActivityDate: js.UndefOr[LastModifiedDate] = js.undefined
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.undefined
  /**
    * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
  /**
    * The targets of the pull request, including the source branch and destination branch for the pull request.
    */
  var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.undefined
  /**
    * The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.
    */
  var title: js.UndefOr[Title] = js.undefined
}

object PullRequest {
  @scala.inline
  def apply(
    authorArn: Arn = null,
    clientRequestToken: ClientRequestToken = null,
    creationDate: CreationDate = null,
    description: Description = null,
    lastActivityDate: LastModifiedDate = null,
    pullRequestId: PullRequestId = null,
    pullRequestStatus: PullRequestStatusEnum = null,
    pullRequestTargets: PullRequestTargetList = null,
    title: Title = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastActivityDate != null) __obj.updateDynamic("lastActivityDate")(lastActivityDate)
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId)
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    if (pullRequestTargets != null) __obj.updateDynamic("pullRequestTargets")(pullRequestTargets)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PullRequest]
  }
}

