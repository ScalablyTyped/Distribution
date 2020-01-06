package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends js.Object {
  /**
    * The approval rules applied to the pull request.
    */
  var approvalRules: js.UndefOr[ApprovalRulesList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who created the pull request.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The date and time the pull request was originally created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The day and time of the last user or system activity on the pull request, in timestamp format.
    */
  var lastActivityDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  /**
    * The targets of the pull request, including the source branch and destination branch for the pull request.
    */
  var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.native
  /**
    * The system-generated revision ID for the pull request.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The user-defined title of the pull request. This title is displayed in the list of pull requests to other repository users.
    */
  var title: js.UndefOr[Title] = js.native
}

object PullRequest {
  @scala.inline
  def apply(
    approvalRules: ApprovalRulesList = null,
    authorArn: Arn = null,
    clientRequestToken: ClientRequestToken = null,
    creationDate: CreationDate = null,
    description: Description = null,
    lastActivityDate: LastModifiedDate = null,
    pullRequestId: PullRequestId = null,
    pullRequestStatus: PullRequestStatusEnum = null,
    pullRequestTargets: PullRequestTargetList = null,
    revisionId: RevisionId = null,
    title: Title = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    if (approvalRules != null) __obj.updateDynamic("approvalRules")(approvalRules.asInstanceOf[js.Any])
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastActivityDate != null) __obj.updateDynamic("lastActivityDate")(lastActivityDate.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    if (pullRequestTargets != null) __obj.updateDynamic("pullRequestTargets")(pullRequestTargets.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
}

