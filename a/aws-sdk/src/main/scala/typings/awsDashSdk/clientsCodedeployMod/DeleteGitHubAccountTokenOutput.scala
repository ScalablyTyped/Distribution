package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGitHubAccountTokenOutput extends js.Object {
  /**
    * The name of the GitHub account connection that was deleted.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
}

object DeleteGitHubAccountTokenOutput {
  @scala.inline
  def apply(tokenName: GitHubAccountTokenName = null): DeleteGitHubAccountTokenOutput = {
    val __obj = js.Dynamic.literal()
    if (tokenName != null) __obj.updateDynamic("tokenName")(tokenName)
    __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
  }
}

