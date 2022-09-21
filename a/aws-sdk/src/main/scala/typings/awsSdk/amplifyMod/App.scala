package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the Amplify app. 
    */
  var appArn: AppArn
  
  /**
    *  The unique ID of the Amplify app. 
    */
  var appId: AppId
  
  /**
    *  Describes the automated branch creation configuration for the Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined
  
  /**
    *  Describes the automated branch creation glob patterns for the Amplify app. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined
  
  /**
    *  The basic authorization credentials for branches for the Amplify app. You must base64-encode the authorization credentials and provide them in the format user:password.
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  Describes the content of the build specification (build spec) for the Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  
  /**
    *  Creates a date and time for the Amplify app. 
    */
  var createTime: js.Date
  
  /**
    * Describes the custom HTTP headers for the Amplify app.
    */
  var customHeaders: js.UndefOr[CustomHeaders] = js.undefined
  
  /**
    *  Describes the custom redirect and rewrite rules for the Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.undefined
  
  /**
    *  The default domain for the Amplify app. 
    */
  var defaultDomain: DefaultDomain
  
  /**
    *  The description for the Amplify app. 
    */
  var description: Description
  
  /**
    *  Enables automated branch creation for the Amplify app. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined
  
  /**
    *  Enables basic authorization for the Amplify app's branches. 
    */
  var enableBasicAuth: EnableBasicAuth
  
  /**
    *  Enables the auto-building of branches for the Amplify app. 
    */
  var enableBranchAutoBuild: EnableBranchAutoBuild
  
  /**
    *  Automatically disconnect a branch in the Amplify Console when you delete a branch from your Git repository. 
    */
  var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined
  
  /**
    *  The environment variables for the Amplify app. 
    */
  var environmentVariables: EnvironmentVariables
  
  /**
    *  The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) of the Amplify app. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
  
  /**
    *  The name for the Amplify app. 
    */
  var name: Name
  
  /**
    *  The platform for the Amplify app. 
    */
  var platform: Platform
  
  /**
    *  Describes the information about a production branch of the Amplify app. 
    */
  var productionBranch: js.UndefOr[ProductionBranch] = js.undefined
  
  /**
    *  The Git repository for the Amplify app. 
    */
  var repository: Repository
  
  /**
    *  This is for internal use.  The Amplify service uses this parameter to specify the authentication protocol to use to access the Git repository for an Amplify app. Amplify specifies TOKEN for a GitHub repository, SIGV4 for an Amazon Web Services CodeCommit repository, and SSH for GitLab and Bitbucket repositories.
    */
  var repositoryCloneMethod: js.UndefOr[RepositoryCloneMethod] = js.undefined
  
  /**
    *  The tag for the Amplify app. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  Updates the date and time for the Amplify app. 
    */
  var updateTime: js.Date
}
object App {
  
  inline def apply(
    appArn: AppArn,
    appId: AppId,
    createTime: js.Date,
    defaultDomain: DefaultDomain,
    description: Description,
    enableBasicAuth: EnableBasicAuth,
    enableBranchAutoBuild: EnableBranchAutoBuild,
    environmentVariables: EnvironmentVariables,
    name: Name,
    platform: Platform,
    repository: Repository,
    updateTime: js.Date
  ): App = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], defaultDomain = defaultDomain.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableBranchAutoBuild = enableBranchAutoBuild.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAppArn(value: AppArn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAutoBranchCreationConfig(value: AutoBranchCreationConfig): Self = StObject.set(x, "autoBranchCreationConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoBranchCreationConfigUndefined: Self = StObject.set(x, "autoBranchCreationConfig", js.undefined)
    
    inline def setAutoBranchCreationPatterns(value: AutoBranchCreationPatterns): Self = StObject.set(x, "autoBranchCreationPatterns", value.asInstanceOf[js.Any])
    
    inline def setAutoBranchCreationPatternsUndefined: Self = StObject.set(x, "autoBranchCreationPatterns", js.undefined)
    
    inline def setAutoBranchCreationPatternsVarargs(value: AutoBranchCreationPattern*): Self = StObject.set(x, "autoBranchCreationPatterns", js.Array(value*))
    
    inline def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    inline def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    inline def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCustomHeaders(value: CustomHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomRules(value: CustomRules): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
    
    inline def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
    
    inline def setCustomRulesVarargs(value: CustomRule*): Self = StObject.set(x, "customRules", js.Array(value*))
    
    inline def setDefaultDomain(value: DefaultDomain): Self = StObject.set(x, "defaultDomain", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = StObject.set(x, "enableAutoBranchCreation", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBranchCreationUndefined: Self = StObject.set(x, "enableAutoBranchCreation", js.undefined)
    
    inline def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = StObject.set(x, "enableBranchAutoBuild", value.asInstanceOf[js.Any])
    
    inline def setEnableBranchAutoDeletion(value: EnableBranchAutoDeletion): Self = StObject.set(x, "enableBranchAutoDeletion", value.asInstanceOf[js.Any])
    
    inline def setEnableBranchAutoDeletionUndefined: Self = StObject.set(x, "enableBranchAutoDeletion", js.undefined)
    
    inline def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setIamServiceRoleArn(value: ServiceRoleArn): Self = StObject.set(x, "iamServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamServiceRoleArnUndefined: Self = StObject.set(x, "iamServiceRoleArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setProductionBranch(value: ProductionBranch): Self = StObject.set(x, "productionBranch", value.asInstanceOf[js.Any])
    
    inline def setProductionBranchUndefined: Self = StObject.set(x, "productionBranch", js.undefined)
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCloneMethod(value: RepositoryCloneMethod): Self = StObject.set(x, "repositoryCloneMethod", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCloneMethodUndefined: Self = StObject.set(x, "repositoryCloneMethod", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
