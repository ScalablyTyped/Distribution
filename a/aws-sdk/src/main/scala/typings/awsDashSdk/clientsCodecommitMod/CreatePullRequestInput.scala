package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePullRequestInput extends js.Object {
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If using an AWS SDK, you do not have to generate an idempotency token, as this will be done for you. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * A description of the pull request.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The targets for the pull request, including the source of the code to be reviewed (the source branch), and the destination where the creator of the pull request intends the code to be merged after the pull request is closed (the destination branch).
    */
  var targets: TargetList
  /**
    * The title of the pull request. This title will be used to identify the pull request to other users in the repository.
    */
  var title: Title
}

object CreatePullRequestInput {
  @scala.inline
  def apply(
    targets: TargetList,
    title: Title,
    clientRequestToken: ClientRequestToken = null,
    description: Description = null
  ): CreatePullRequestInput = {
    val __obj = js.Dynamic.literal(targets = targets, title = title)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreatePullRequestInput]
  }
}

