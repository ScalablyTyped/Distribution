package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBranchRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  
  /**
    *  The basic authorization credentials for the branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  
  /**
    *  The name for the branch. 
    */
  var branchName: BranchName = js.native
  
  /**
    *  The build specification (build spec) for the branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  
  /**
    *  The description for the branch. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  The display name for a branch. This is used as the default domain prefix. 
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  
  /**
    *  Enables auto building for the branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  
  /**
    *  Enables basic authorization for the branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  
  /**
    *  Enables notifications for the branch. 
    */
  var enableNotification: js.UndefOr[EnableNotification] = js.native
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.native
  
  /**
    *  Enables pull request previews for this branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  
  /**
    *  The environment variables for the branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    *  The framework for the branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  
  /**
    *  Describes the current stage for the branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
  
  /**
    *  The tag for the branch. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    *  The content Time To Live (TTL) for the website in seconds. 
    */
  var ttl: js.UndefOr[TTL] = js.native
}
object CreateBranchRequest {
  
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): CreateBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchRequest]
  }
  
  @scala.inline
  implicit class CreateBranchRequestMutableBuilder[Self <: CreateBranchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = StObject.set(x, "backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendEnvironmentArnUndefined: Self = StObject.set(x, "backendEnvironmentArn", js.undefined)
    
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableAutoBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoBuildUndefined: Self = StObject.set(x, "enableAutoBuild", js.undefined)
    
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
    @scala.inline
    def setEnableNotification(value: EnableNotification): Self = StObject.set(x, "enableNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNotificationUndefined: Self = StObject.set(x, "enableNotification", js.undefined)
    
    @scala.inline
    def setEnablePerformanceMode(value: EnablePerformanceMode): Self = StObject.set(x, "enablePerformanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePerformanceModeUndefined: Self = StObject.set(x, "enablePerformanceMode", js.undefined)
    
    @scala.inline
    def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = StObject.set(x, "enablePullRequestPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePullRequestPreviewUndefined: Self = StObject.set(x, "enablePullRequestPreview", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    @scala.inline
    def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = StObject.set(x, "pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestEnvironmentNameUndefined: Self = StObject.set(x, "pullRequestEnvironmentName", js.undefined)
    
    @scala.inline
    def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTtl(value: TTL): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
