package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGitHubAccountTokenInput extends js.Object {
  /**
    * The name of the GitHub account connection to delete.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.native
}

object DeleteGitHubAccountTokenInput {
  @scala.inline
  def apply(tokenName: GitHubAccountTokenName = null): DeleteGitHubAccountTokenInput = {
    val __obj = js.Dynamic.literal()
    if (tokenName != null) __obj.updateDynamic("tokenName")(tokenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
  }
}

