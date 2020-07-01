package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    *  The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    *  The automated branch creation configuration for the Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  The automated branch creation glob patterns for the Amplify app. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  The credentials for basic authorization for an Amplify app. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  The build specification (build spec) for an Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  The custom rewrite and redirect rules for an Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  The description for an Amplify app. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Enables automated branch creation for the Amplify app. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables the auto building of branches for an Amplify app. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.native
  /**
    *  Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository. 
    */
  var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.native
  /**
    *  The environment variables map for an Amplify app. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  The AWS Identity and Access Management (IAM) service role for an Amplify app. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  The name for the Amplify app. 
    */
  var name: Name = js.native
  /**
    *  The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.native
  /**
    *  The platform or framework for an Amplify app. 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  The repository for an Amplify app. 
    */
  var repository: js.UndefOr[Repository] = js.native
  /**
    *  The tag for an Amplify app. 
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
    enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined,
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
    if (!js.isUndefined(enableBranchAutoDeletion)) __obj.updateDynamic("enableBranchAutoDeletion")(enableBranchAutoDeletion.get.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn.asInstanceOf[js.Any])
    if (oauthToken != null) __obj.updateDynamic("oauthToken")(oauthToken.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
}

