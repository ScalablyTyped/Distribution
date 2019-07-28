package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppRequest extends js.Object {
  /**
    *  Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. Token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined
  /**
    *  Credentials for Basic Authorization for an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  BuildSpec for an Amplify App 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Custom rewrite / redirect rules for an Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.undefined
  /**
    *  Description for an Amplify App 
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined
  /**
    *  Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  /**
    *  Enable the auto building of branches for an Amplify App. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined
  /**
    *  Environment variables map for an Amplify App. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    *  AWS IAM service role for an Amplify App 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
  /**
    *  Name for the Amplify App 
    */
  var name: Name
  /**
    *  OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.undefined
  /**
    *  Platform / framework for an Amplify App 
    */
  var platform: js.UndefOr[Platform] = js.undefined
  /**
    *  Repository for an Amplify App 
    */
  var repository: js.UndefOr[Repository] = js.undefined
  /**
    *  Tag for an Amplify App 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateAppRequest {
  @scala.inline
  def apply(
    name: Name,
    accessToken: AccessToken = null,
    autoBranchCreationConfig: AutoBranchCreationConfig = null,
    autoBranchCreationPatterns: AutoBranchCreationPatterns = null,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    customRules: CustomRules = null,
    description: Description = null,
    enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
    enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
    enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    iamServiceRoleArn: ServiceRoleArn = null,
    oauthToken: OauthToken = null,
    platform: Platform = null,
    repository: Repository = null,
    tags: TagMap = null
  ): CreateAppRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (autoBranchCreationConfig != null) __obj.updateDynamic("autoBranchCreationConfig")(autoBranchCreationConfig)
    if (autoBranchCreationPatterns != null) __obj.updateDynamic("autoBranchCreationPatterns")(autoBranchCreationPatterns)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (customRules != null) __obj.updateDynamic("customRules")(customRules)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableAutoBranchCreation)) __obj.updateDynamic("enableAutoBranchCreation")(enableAutoBranchCreation)
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth)
    if (!js.isUndefined(enableBranchAutoBuild)) __obj.updateDynamic("enableBranchAutoBuild")(enableBranchAutoBuild)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn)
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateAppRequest]
  }
}

