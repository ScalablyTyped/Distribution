package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppRequest extends StObject {
  
  /**
    * The personal access token for a GitHub repository for an Amplify app. The personal access token is used to authorize access to a GitHub repository using the Amplify GitHub App. The token is not stored. Use accessToken for GitHub repositories only. To authorize access to a repository provider such as Bitbucket or CodeCommit, use oauthToken. You must specify either accessToken or oauthToken when you update an app. Existing Amplify apps deployed from a GitHub repository using OAuth continue to work with CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For more information, see Migrating an existing OAuth app to the Amplify GitHub App in the Amplify User Guide .
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The automated branch creation configuration for an Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined
  
  /**
    *  Describes the automated branch creation glob patterns for an Amplify app. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined
  
  /**
    *  The basic authorization credentials for an Amplify app. You must base64-encode the authorization credentials and provide them in the format user:password.
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  The build specification (build spec) for an Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  
  /**
    * The custom HTTP headers for an Amplify app.
    */
  var customHeaders: js.UndefOr[CustomHeaders] = js.undefined
  
  /**
    *  The custom redirect and rewrite rules for an Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.undefined
  
  /**
    *  The description for an Amplify app. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  Enables automated branch creation for an Amplify app. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined
  
  /**
    *  Enables basic authorization for an Amplify app. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  
  /**
    *  Enables branch auto-building for an Amplify app. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  
  /**
    *  Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository. 
    */
  var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.undefined
  
  /**
    *  The environment variables for an Amplify app. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    *  The AWS Identity and Access Management (IAM) service role for an Amplify app. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
  
  /**
    *  The name for an Amplify app. 
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key using SSH cloning. The OAuth token is not stored. Use oauthToken for repository providers other than GitHub, such as Bitbucket or CodeCommit. To authorize access to GitHub as your repository provider, use accessToken. You must specify either oauthToken or accessToken when you update an app. Existing Amplify apps deployed from a GitHub repository using OAuth continue to work with CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For more information, see Migrating an existing OAuth app to the Amplify GitHub App in the Amplify User Guide .
    */
  var oauthToken: js.UndefOr[OauthToken] = js.undefined
  
  /**
    *  The platform for an Amplify app. 
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    *  The name of the repository for an Amplify app 
    */
  var repository: js.UndefOr[Repository] = js.undefined
}
object UpdateAppRequest {
  
  inline def apply(appId: AppId): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
  
  extension [Self <: UpdateAppRequest](x: Self) {
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
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
    
    inline def setCustomHeaders(value: CustomHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomRules(value: CustomRules): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
    
    inline def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
    
    inline def setCustomRulesVarargs(value: CustomRule*): Self = StObject.set(x, "customRules", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = StObject.set(x, "enableAutoBranchCreation", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBranchCreationUndefined: Self = StObject.set(x, "enableAutoBranchCreation", js.undefined)
    
    inline def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
    inline def setEnableBranchAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableBranchAutoBuild", value.asInstanceOf[js.Any])
    
    inline def setEnableBranchAutoBuildUndefined: Self = StObject.set(x, "enableBranchAutoBuild", js.undefined)
    
    inline def setEnableBranchAutoDeletion(value: EnableBranchAutoDeletion): Self = StObject.set(x, "enableBranchAutoDeletion", value.asInstanceOf[js.Any])
    
    inline def setEnableBranchAutoDeletionUndefined: Self = StObject.set(x, "enableBranchAutoDeletion", js.undefined)
    
    inline def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setIamServiceRoleArn(value: ServiceRoleArn): Self = StObject.set(x, "iamServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamServiceRoleArnUndefined: Self = StObject.set(x, "iamServiceRoleArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOauthToken(value: OauthToken): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
