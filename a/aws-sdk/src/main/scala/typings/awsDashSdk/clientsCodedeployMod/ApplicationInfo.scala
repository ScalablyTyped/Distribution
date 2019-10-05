package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  /**
    * The application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.undefined
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * The destination platform type for deployment of the application (Lambda or Server).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  /**
    * The time at which the application was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name for a connection to a GitHub account.
    */
  var gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined
  /**
    * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
    */
  var linkedToGitHub: js.UndefOr[Boolean] = js.undefined
}

object ApplicationInfo {
  @scala.inline
  def apply(
    applicationId: ApplicationId = null,
    applicationName: ApplicationName = null,
    computePlatform: ComputePlatform = null,
    createTime: Timestamp = null,
    gitHubAccountName: GitHubAccountTokenName = null,
    linkedToGitHub: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId)
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (gitHubAccountName != null) __obj.updateDynamic("gitHubAccountName")(gitHubAccountName)
    if (!js.isUndefined(linkedToGitHub)) __obj.updateDynamic("linkedToGitHub")(linkedToGitHub)
    __obj.asInstanceOf[ApplicationInfo]
  }
}

