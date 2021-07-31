package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppRequest extends StObject {
  
  /**
    *  The personal access token for a third-party source control system for an Amplify app. The token is used to create webhook and a read-only deploy key. The token is not stored. 
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
    *  The basic authorization credentials for an Amplify app. 
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
    *  The OAuth token for a third-party source control system for an Amplify app. The token is used to create a webhook and a read-only deploy key. The OAuth token is not stored. 
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
  
  @scala.inline
  def apply(appId: AppId): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
  
  @scala.inline
  implicit class UpdateAppRequestMutableBuilder[Self <: UpdateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBranchCreationConfig(value: AutoBranchCreationConfig): Self = StObject.set(x, "autoBranchCreationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBranchCreationConfigUndefined: Self = StObject.set(x, "autoBranchCreationConfig", js.undefined)
    
    @scala.inline
    def setAutoBranchCreationPatterns(value: AutoBranchCreationPatterns): Self = StObject.set(x, "autoBranchCreationPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBranchCreationPatternsUndefined: Self = StObject.set(x, "autoBranchCreationPatterns", js.undefined)
    
    @scala.inline
    def setAutoBranchCreationPatternsVarargs(value: AutoBranchCreationPattern*): Self = StObject.set(x, "autoBranchCreationPatterns", js.Array(value :_*))
    
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: CustomHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    @scala.inline
    def setCustomRules(value: CustomRules): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
    
    @scala.inline
    def setCustomRulesVarargs(value: CustomRule*): Self = StObject.set(x, "customRules", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = StObject.set(x, "enableAutoBranchCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoBranchCreationUndefined: Self = StObject.set(x, "enableAutoBranchCreation", js.undefined)
    
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
    @scala.inline
    def setEnableBranchAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableBranchAutoBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBranchAutoBuildUndefined: Self = StObject.set(x, "enableBranchAutoBuild", js.undefined)
    
    @scala.inline
    def setEnableBranchAutoDeletion(value: EnableBranchAutoDeletion): Self = StObject.set(x, "enableBranchAutoDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBranchAutoDeletionUndefined: Self = StObject.set(x, "enableBranchAutoDeletion", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setIamServiceRoleArn(value: ServiceRoleArn): Self = StObject.set(x, "iamServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamServiceRoleArnUndefined: Self = StObject.set(x, "iamServiceRoleArn", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOauthToken(value: OauthToken): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
