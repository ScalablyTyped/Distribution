package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppRequest extends StObject {
  
  /**
    *  The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  
  /**
    *  The automated branch creation configuration for an Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  
  /**
    *  The automated branch creation glob patterns for an Amplify app. 
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
    * The custom HTTP headers for an Amplify app.
    */
  var customHeaders: js.UndefOr[CustomHeaders] = js.native
  
  /**
    *  The custom rewrite and redirect rules for an Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  
  /**
    *  The description for an Amplify app. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  Enables automated branch creation for an Amplify app. 
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
    *  The name for an Amplify app. 
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
  def apply(name: Name): CreateAppRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit class CreateAppRequestMutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
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
    def setEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = StObject.set(x, "enableBranchAutoBuild", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
