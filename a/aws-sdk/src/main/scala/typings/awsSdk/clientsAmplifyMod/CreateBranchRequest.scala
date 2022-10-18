package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBranchRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.undefined
  
  /**
    *  The basic authorization credentials for the branch. You must base64-encode the authorization credentials and provide them in the format user:password.
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  The name for the branch. 
    */
  var branchName: BranchName
  
  /**
    *  The build specification (build spec) for the branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  
  /**
    *  The description for the branch. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The display name for a branch. This is used as the default domain prefix. 
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    *  Enables auto building for the branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  
  /**
    *  Enables basic authorization for the branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  
  /**
    *  Enables notifications for the branch. 
    */
  var enableNotification: js.UndefOr[EnableNotification] = js.undefined
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined
  
  /**
    *  Enables pull request previews for this branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined
  
  /**
    *  The environment variables for the branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    *  The framework for the branch. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined
  
  /**
    *  Describes the current stage for the branch. 
    */
  var stage: js.UndefOr[Stage] = js.undefined
  
  /**
    *  The tag for the branch. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The content Time To Live (TTL) for the website in seconds. 
    */
  var ttl: js.UndefOr[TTL] = js.undefined
}
object CreateBranchRequest {
  
  inline def apply(appId: AppId, branchName: BranchName): CreateBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchRequest]
  }
  
  extension [Self <: CreateBranchRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = StObject.set(x, "backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentArnUndefined: Self = StObject.set(x, "backendEnvironmentArn", js.undefined)
    
    inline def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    inline def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableAutoBuild", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBuildUndefined: Self = StObject.set(x, "enableAutoBuild", js.undefined)
    
    inline def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
    inline def setEnableNotification(value: EnableNotification): Self = StObject.set(x, "enableNotification", value.asInstanceOf[js.Any])
    
    inline def setEnableNotificationUndefined: Self = StObject.set(x, "enableNotification", js.undefined)
    
    inline def setEnablePerformanceMode(value: EnablePerformanceMode): Self = StObject.set(x, "enablePerformanceMode", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceModeUndefined: Self = StObject.set(x, "enablePerformanceMode", js.undefined)
    
    inline def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = StObject.set(x, "enablePullRequestPreview", value.asInstanceOf[js.Any])
    
    inline def setEnablePullRequestPreviewUndefined: Self = StObject.set(x, "enablePullRequestPreview", js.undefined)
    
    inline def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = StObject.set(x, "pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setPullRequestEnvironmentNameUndefined: Self = StObject.set(x, "pullRequestEnvironmentName", js.undefined)
    
    inline def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTtl(value: TTL): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
