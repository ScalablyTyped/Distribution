package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Describes the custom HTTP headers for the Amplify app.
    */
  var customHeaders: js.UndefOr[CustomHeaders] = js.native
  
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
    *  Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository. 
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
    updateTime: UpdateTime
  ): App = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], defaultDomain = defaultDomain.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableBranchAutoBuild = enableBranchAutoBuild.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppArn(value: AppArn): Self = this.set("appArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: CreateTime): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDomain(value: DefaultDomain): Self = this.set("defaultDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = this.set("enableBasicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = this.set("enableBranchAutoBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: UpdateTime): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBranchCreationConfig(value: AutoBranchCreationConfig): Self = this.set("autoBranchCreationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBranchCreationConfig: Self = this.set("autoBranchCreationConfig", js.undefined)
    
    @scala.inline
    def setAutoBranchCreationPatternsVarargs(value: AutoBranchCreationPattern*): Self = this.set("autoBranchCreationPatterns", js.Array(value :_*))
    
    @scala.inline
    def setAutoBranchCreationPatterns(value: AutoBranchCreationPatterns): Self = this.set("autoBranchCreationPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBranchCreationPatterns: Self = this.set("autoBranchCreationPatterns", js.undefined)
    
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = this.set("basicAuthCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicAuthCredentials: Self = this.set("basicAuthCredentials", js.undefined)
    
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = this.set("buildSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildSpec: Self = this.set("buildSpec", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: CustomHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setCustomRulesVarargs(value: CustomRule*): Self = this.set("customRules", js.Array(value :_*))
    
    @scala.inline
    def setCustomRules(value: CustomRules): Self = this.set("customRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRules: Self = this.set("customRules", js.undefined)
    
    @scala.inline
    def setEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = this.set("enableAutoBranchCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoBranchCreation: Self = this.set("enableAutoBranchCreation", js.undefined)
    
    @scala.inline
    def setEnableBranchAutoDeletion(value: EnableBranchAutoDeletion): Self = this.set("enableBranchAutoDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBranchAutoDeletion: Self = this.set("enableBranchAutoDeletion", js.undefined)
    
    @scala.inline
    def setIamServiceRoleArn(value: ServiceRoleArn): Self = this.set("iamServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamServiceRoleArn: Self = this.set("iamServiceRoleArn", js.undefined)
    
    @scala.inline
    def setProductionBranch(value: ProductionBranch): Self = this.set("productionBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionBranch: Self = this.set("productionBranch", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
