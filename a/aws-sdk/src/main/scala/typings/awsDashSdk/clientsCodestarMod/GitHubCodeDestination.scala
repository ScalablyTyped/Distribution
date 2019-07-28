package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitHubCodeDestination extends js.Object {
  /**
    * Description for the GitHub repository to be created in AWS CodeStar. This description displays in GitHub after the repository is created.
    */
  var description: js.UndefOr[RepositoryDescription] = js.undefined
  /**
    * Whether to enable issues for the GitHub repository.
    */
  var issuesEnabled: RepositoryEnableIssues
  /**
    * Name of the GitHub repository to be created in AWS CodeStar.
    */
  var name: RepositoryName
  /**
    * The GitHub username for the owner of the GitHub repository to be created in AWS CodeStar. If this repository should be owned by a GitHub organization, provide its name.
    */
  var owner: RepositoryOwner
  /**
    * Whether the GitHub repository is to be a private repository.
    */
  var privateRepository: RepositoryIsPrivate
  /**
    * The GitHub user's personal access token for the GitHub repository.
    */
  var token: GitHubPersonalToken
  /**
    * The type of GitHub repository to be created in AWS CodeStar. Valid values are User or Organization.
    */
  var `type`: RepositoryType
}

object GitHubCodeDestination {
  @scala.inline
  def apply(
    issuesEnabled: RepositoryEnableIssues,
    name: RepositoryName,
    owner: RepositoryOwner,
    privateRepository: RepositoryIsPrivate,
    token: GitHubPersonalToken,
    `type`: RepositoryType,
    description: RepositoryDescription = null
  ): GitHubCodeDestination = {
    val __obj = js.Dynamic.literal(issuesEnabled = issuesEnabled, name = name, owner = owner, privateRepository = privateRepository, token = token)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GitHubCodeDestination]
  }
}

