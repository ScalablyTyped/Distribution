package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    *  Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. Token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  Credentials for Basic Authorization for an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec for an Amplify App 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Custom rewrite / redirect rules for an Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  Description for an Amplify App 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enable the auto building of branches for an Amplify App. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.native
  /**
    *  Environment variables map for an Amplify App. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  AWS IAM service role for an Amplify App 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  Name for the Amplify App 
    */
  var name: Name = js.native
  /**
    *  OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.native
  /**
    *  Platform / framework for an Amplify App 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  Repository for an Amplify App 
    */
  var repository: js.UndefOr[Repository] = js.native
  /**
    *  Tag for an Amplify App 
    */
  var tags: js.UndefOr[TagMap] = js.native
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (autoBranchCreationConfig != null) __obj.updateDynamic("autoBranchCreationConfig")(autoBranchCreationConfig.asInstanceOf[js.Any])
    if (autoBranchCreationPatterns != null) __obj.updateDynamic("autoBranchCreationPatterns")(autoBranchCreationPatterns.asInstanceOf[js.Any])
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials.asInstanceOf[js.Any])
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec.asInstanceOf[js.Any])
    if (customRules != null) __obj.updateDynamic("customRules")(customRules.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoBranchCreation)) __obj.updateDynamic("enableAutoBranchCreation")(enableAutoBranchCreation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBranchAutoBuild)) __obj.updateDynamic("enableBranchAutoBuild")(enableBranchAutoBuild.get.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn.asInstanceOf[js.Any])
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
}

