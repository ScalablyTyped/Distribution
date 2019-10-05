package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBranchRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Basic Authorization credentials for the branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  Name for the branch. 
    */
  var branchName: BranchName
  /**
    *  BuildSpec for the branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Description for the branch. 
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    *  Display name for a branch, will use as the default domain prefix. 
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  /**
    *  Enables auto building for the branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  /**
    *  Enables Basic Auth for the branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  /**
    *  Enables notifications for the branch. 
    */
  var enableNotification: js.UndefOr[EnableNotification] = js.undefined
  /**
    *  Enables Pull Request Preview for this branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined
  /**
    *  Environment Variables for the branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    *  Framework for the branch. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
  /**
    *  Stage for the branch. 
    */
  var stage: js.UndefOr[Stage] = js.undefined
  /**
    *  Tag for the branch. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    *  The content TTL for the website in seconds. 
    */
  var ttl: js.UndefOr[TTL] = js.undefined
}

object CreateBranchRequest {
  @scala.inline
  def apply(
    appId: AppId,
    branchName: BranchName,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    description: Description = null,
    displayName: DisplayName = null,
    enableAutoBuild: js.UndefOr[Boolean] = js.undefined,
    enableBasicAuth: js.UndefOr[Boolean] = js.undefined,
    enableNotification: js.UndefOr[Boolean] = js.undefined,
    enablePullRequestPreview: js.UndefOr[Boolean] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    framework: Framework = null,
    stage: Stage = null,
    tags: TagMap = null,
    ttl: TTL = null
  ): CreateBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableAutoBuild)) __obj.updateDynamic("enableAutoBuild")(enableAutoBuild)
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth)
    if (!js.isUndefined(enableNotification)) __obj.updateDynamic("enableNotification")(enableNotification)
    if (!js.isUndefined(enablePullRequestPreview)) __obj.updateDynamic("enablePullRequestPreview")(enablePullRequestPreview)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[CreateBranchRequest]
  }
}

