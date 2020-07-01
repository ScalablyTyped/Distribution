package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the Amplify app. 
    */
  var appArn: AppArn = js.native
  /**
    *  The unique ID of the Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  Describes the automated branch creation configuration for the Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Describes the automated branch creation glob patterns for the Amplify app. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  The basic authorization credentials for branches for the Amplify app. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  Describes the content of the build specification (build spec) for the Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Creates a date and time for the Amplify app. 
    */
  var createTime: CreateTime = js.native
  /**
    *  Describes the custom redirect and rewrite rules for the Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  The default domain for the Amplify app. 
    */
  var defaultDomain: DefaultDomain = js.native
  /**
    *  The description for the Amplify app. 
    */
  var description: Description = js.native
  /**
    *  Enables automated branch creation for the Amplify app. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables basic authorization for the Amplify app's branches. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables the auto-building of branches for the Amplify app. 
    */
  var enableBranchAutoBuild: EnableBranchAutoBuild = js.native
  /**
    *  Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository. 
    */
  var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.native
  /**
    *  The environment variables for the Amplify app. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  The name for the Amplify app. 
    */
  var name: Name = js.native
  /**
    *  The platform for the Amplify app. 
    */
  var platform: Platform = js.native
  /**
    *  Describes the information about a production branch of the Amplify app. 
    */
  var productionBranch: js.UndefOr[ProductionBranch] = js.native
  /**
    *  The repository for the Amplify app. 
    */
  var repository: Repository = js.native
  /**
    *  The tag for the Amplify app. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  Updates the date and time for the Amplify app. 
    */
  var updateTime: UpdateTime = js.native
}

object App {
  @scala.inline
  def apply(
    appArn: AppArn,
    appId: AppId,
    createTime: CreateTime,
    defaultDomain: DefaultDomain,
    description: Description,
    enableBasicAuth: EnableBasicAuth,
    enableBranchAutoBuild: EnableBranchAutoBuild,
    environmentVariables: EnvironmentVariables,
    name: Name,
    platform: Platform,
    repository: Repository,
    updateTime: UpdateTime,
    autoBranchCreationConfig: AutoBranchCreationConfig = null,
    autoBranchCreationPatterns: AutoBranchCreationPatterns = null,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    customRules: CustomRules = null,
    enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
    enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined,
    iamServiceRoleArn: ServiceRoleArn = null,
    productionBranch: ProductionBranch = null,
    tags: TagMap = null
  ): App = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], defaultDomain = defaultDomain.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableBranchAutoBuild = enableBranchAutoBuild.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    if (autoBranchCreationConfig != null) __obj.updateDynamic("autoBranchCreationConfig")(autoBranchCreationConfig.asInstanceOf[js.Any])
    if (autoBranchCreationPatterns != null) __obj.updateDynamic("autoBranchCreationPatterns")(autoBranchCreationPatterns.asInstanceOf[js.Any])
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials.asInstanceOf[js.Any])
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec.asInstanceOf[js.Any])
    if (customRules != null) __obj.updateDynamic("customRules")(customRules.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoBranchCreation)) __obj.updateDynamic("enableAutoBranchCreation")(enableAutoBranchCreation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBranchAutoDeletion)) __obj.updateDynamic("enableBranchAutoDeletion")(enableBranchAutoDeletion.get.asInstanceOf[js.Any])
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn.asInstanceOf[js.Any])
    if (productionBranch != null) __obj.updateDynamic("productionBranch")(productionBranch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

