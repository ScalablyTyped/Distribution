package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
    *  ARN for the Amplify App. 
    */
  var appArn: AppArn
  /**
    *  Unique Id for the Amplify App. 
    */
  var appId: AppId
  /**
    *  Automated branch creation config for the Amplify App. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined
  /**
    *  Automated branch creation glob patterns for the Amplify App. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined
  /**
    *  Basic Authorization credentials for branches for the Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  BuildSpec content for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Create date / time for the Amplify App. 
    */
  var createTime: CreateTime
  /**
    *  Custom redirect / rewrite rules for the Amplify App. 
    */
  var customRules: js.UndefOr[CustomRules] = js.undefined
  /**
    *  Default domain for the Amplify App. 
    */
  var defaultDomain: DefaultDomain
  /**
    *  Description for the Amplify App. 
    */
  var description: Description
  /**
    *  Enables automated branch creation for the Amplify App. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined
  /**
    *  Enables Basic Authorization for branches for the Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth
  /**
    *  Enables auto-building of branches for the Amplify App. 
    */
  var enableBranchAutoBuild: EnableBranchAutoBuild
  /**
    *  Environment Variables for the Amplify App. 
    */
  var environmentVariables: EnvironmentVariables
  /**
    *  IAM service role ARN for the Amplify App. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
  /**
    *  Name for the Amplify App. 
    */
  var name: Name
  /**
    *  Platform for the Amplify App. 
    */
  var platform: Platform
  /**
    *  Structure with Production Branch information. 
    */
  var productionBranch: js.UndefOr[ProductionBranch] = js.undefined
  /**
    *  Repository for the Amplify App. 
    */
  var repository: Repository
  /**
    *  Tag for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    *  Update date / time for the Amplify App. 
    */
  var updateTime: UpdateTime
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
    val __obj = js.Dynamic.literal(appArn = appArn, appId = appId, createTime = createTime, defaultDomain = defaultDomain, description = description, enableBasicAuth = enableBasicAuth, enableBranchAutoBuild = enableBranchAutoBuild, environmentVariables = environmentVariables, name = name, platform = platform.asInstanceOf[js.Any], repository = repository, updateTime = updateTime)
    if (autoBranchCreationConfig != null) __obj.updateDynamic("autoBranchCreationConfig")(autoBranchCreationConfig)
    if (autoBranchCreationPatterns != null) __obj.updateDynamic("autoBranchCreationPatterns")(autoBranchCreationPatterns)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (customRules != null) __obj.updateDynamic("customRules")(customRules)
    if (!js.isUndefined(enableAutoBranchCreation)) __obj.updateDynamic("enableAutoBranchCreation")(enableAutoBranchCreation)
    if (iamServiceRoleArn != null) __obj.updateDynamic("iamServiceRoleArn")(iamServiceRoleArn)
    if (productionBranch != null) __obj.updateDynamic("productionBranch")(productionBranch)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[App]
  }
}

