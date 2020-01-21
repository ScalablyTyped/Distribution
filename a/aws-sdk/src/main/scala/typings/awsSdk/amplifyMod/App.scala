package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    *  ARN for the Amplify App. 
    */
  var appArn: AppArn = js.native
  /**
    *  Unique Id for the Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  Basic Authorization credentials for branches for the Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  BuildSpec content for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Create date / time for the Amplify App. 
    */
  var createTime: CreateTime = js.native
  /**
    *  Custom redirect / rewrite rules for the Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  Default domain for the Amplify App. 
    */
  var defaultDomain: DefaultDomain = js.native
  /**
    *  Description for the Amplify App. 
    */
  var description: Description = js.native
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables Basic Authorization for branches for the Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables auto-building of branches for the Amplify App. 
    */
  var enableBranchAutoBuild: EnableBranchAutoBuild = js.native
  /**
    *  Environment Variables for the Amplify App. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  IAM service role ARN for the Amplify App. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  Name for the Amplify App. 
    */
  var name: Name = js.native
  /**
    *  Platform for the Amplify App. 
    */
  var platform: Platform = js.native
  /**
    *  Structure with Production Branch information. 
    */
  var productionBranch: js.UndefOr[ProductionBranch] = js.native
  /**
    *  Repository for the Amplify App. 
    */
  var repository: Repository = js.native
  /**
    *  Tag for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  Update date / time for the Amplify App. 
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
    enableAutoBranchCreation: js.UndefOr[Boolean] = js.undefined,
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
    if (!js.isUndefined(enableAutoBranchCreation)) __obj.updateDynamic("enableAutoBranchCreation")(enableAutoBranchCreation.asInstanceOf[js.Any])
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn.asInstanceOf[js.Any])
    if (productionBranch != null) __obj.updateDynamic("productionBranch")(productionBranch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

