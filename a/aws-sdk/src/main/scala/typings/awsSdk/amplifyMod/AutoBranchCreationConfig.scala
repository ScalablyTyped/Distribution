package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBranchCreationConfig extends js.Object {
  /**
    *  The basic authorization credentials for the autocreated branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  The build specification (build spec) for the autocreated branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Enables auto building for the autocreated branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Enables basic authorization for the autocreated branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables pull request preview for the autocreated branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  /**
    *  The environment variables for the autocreated branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  The framework for the autocreated branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  Describes the current stage for the autocreated branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
}

object AutoBranchCreationConfig {
  @scala.inline
  def apply(
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
    enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
    enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    framework: Framework = null,
    pullRequestEnvironmentName: PullRequestEnvironmentName = null,
    stage: Stage = null
  ): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials.asInstanceOf[js.Any])
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoBuild)) __obj.updateDynamic("enableAutoBuild")(enableAutoBuild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePullRequestPreview)) __obj.updateDynamic("enablePullRequestPreview")(enablePullRequestPreview.get.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (pullRequestEnvironmentName != null) __obj.updateDynamic("pullRequestEnvironmentName")(pullRequestEnvironmentName.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
}

