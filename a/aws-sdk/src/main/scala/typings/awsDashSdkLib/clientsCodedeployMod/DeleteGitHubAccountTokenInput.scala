package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGitHubAccountTokenInput extends js.Object {
  /**
    * The name of the GitHub account connection to delete.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
}

object DeleteGitHubAccountTokenInput {
  @scala.inline
  def apply(tokenName: GitHubAccountTokenName = null): DeleteGitHubAccountTokenInput = {
    val __obj = js.Dynamic.literal()
    if (tokenName != null) __obj.updateDynamic("tokenName")(tokenName)
    __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
  }
}

