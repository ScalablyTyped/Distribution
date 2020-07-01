package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  /**
    *  The basic authorization credentials for the branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  The name for the branch. 
    */
  var branchName: BranchName = js.native
  /**
    *  The build specification (build spec) for the branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  The description for the branch. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  The display name for a branch. This is used as the default domain prefix. 
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  /**
    *  Enables auto building for the branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  /**
    *  Enables basic authorization for the branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables notifications for the branch. 
    */
  var enableNotification: js.UndefOr[EnableNotification] = js.native
  /**
    *  Enables pull request preview for this branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  /**
    *  The environment variables for the branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  The framework for the branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  Describes the current stage for the branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
  /**
    *  The tag for the branch. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  The content Time To Live (TTL) for the website in seconds. 
    */
  var ttl: js.UndefOr[TTL] = js.native
}

object CreateBranchRequest {
  @scala.inline
  def apply(
    appId: AppId,
    branchName: BranchName,
    backendEnvironmentArn: BackendEnvironmentArn = null,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    description: Description = null,
    displayName: DisplayName = null,
    enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
    enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
    enableNotification: js.UndefOr[EnableNotification] = js.undefined,
    enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    framework: Framework = null,
    pullRequestEnvironmentName: PullRequestEnvironmentName = null,
    stage: Stage = null,
    tags: TagMap = null,
    ttl: TTL = null
  ): CreateBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    if (backendEnvironmentArn != null) __obj.updateDynamic("backendEnvironmentArn")(backendEnvironmentArn.asInstanceOf[js.Any])
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials.asInstanceOf[js.Any])
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoBuild)) __obj.updateDynamic("enableAutoBuild")(enableAutoBuild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNotification)) __obj.updateDynamic("enableNotification")(enableNotification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePullRequestPreview)) __obj.updateDynamic("enablePullRequestPreview")(enablePullRequestPreview.get.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (pullRequestEnvironmentName != null) __obj.updateDynamic("pullRequestEnvironmentName")(pullRequestEnvironmentName.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchRequest]
  }
}

