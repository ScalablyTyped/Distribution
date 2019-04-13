package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAppRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Basic Authorization credentials for an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  BuildSpec for an Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Custom redirect / rewrite rules for an Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.undefined
  /**
    *  Description for an Amplify App. 
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    *  Enables Basic Authorization for an Amplify App. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  /**
    *  Enables branch auto-building for an Amplify App. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  /**
    *  Environment Variables for an Amplify App. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    *  IAM service role for an Amplify App. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
  /**
    *  Name for an Amplify App. 
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    *  Platform for an Amplify App. 
    */
  var platform: js.UndefOr[Platform] = js.undefined
}

object UpdateAppRequest {
  @scala.inline
  def apply(
    appId: AppId,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    customRules: CustomRules = null,
    description: Description = null,
    enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
    enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    iamServiceRoleArn: ServiceRoleArn = null,
    name: Name = null,
    platform: Platform = null
  ): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (customRules != null) __obj.updateDynamic("customRules")(customRules)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth)
    if (!js.isUndefined(enableBranchAutoBuild)) __obj.updateDynamic("enableBranchAutoBuild")(enableBranchAutoBuild)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
}

