package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBranchCreationConfig extends js.Object {
  /**
    *  Basic Authorization credentials for the auto created branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec for the auto created branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Enables auto building for the auto created branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Enables Basic Auth for the auto created branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables Pull Request Preview for auto created branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  /**
    *  Environment Variables for the auto created branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  Framework for the auto created branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  /**
    *  The Amplify Environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  Stage for the auto created branch. 
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

