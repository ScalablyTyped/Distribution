package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branch extends StObject {
  
  /**
    *  The ID of the active job for a branch of an Amplify app. 
    */
  var activeJobId: ActiveJobId
  
  /**
    *  A list of custom resources that are linked to this branch. 
    */
  var associatedResources: js.UndefOr[AssociatedResources] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.undefined
  
  /**
    *  The basic authorization credentials for a branch of an Amplify app. You must base64-encode the authorization credentials and provide them in the format user:password.
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for a branch that is part of an Amplify app. 
    */
  var branchArn: BranchArn
  
  /**
    *  The name for the branch that is part of an Amplify app. 
    */
  var branchName: BranchName
  
  /**
    *  The build specification (build spec) content for the branch of an Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  
  /**
    *  The creation date and time for a branch that is part of an Amplify app. 
    */
  var createTime: js.Date
  
  /**
    *  The custom domains for a branch of an Amplify app. 
    */
  var customDomains: CustomDomains
  
  /**
    *  The description for the branch that is part of an Amplify app. 
    */
  var description: Description
  
  /**
    *  The destination branch if the branch is a pull request branch. 
    */
  var destinationBranch: js.UndefOr[BranchName] = js.undefined
  
  /**
    *  The display name for the branch. This is used as the default domain prefix. 
    */
  var displayName: DisplayName
  
  /**
    *  Enables auto-building on push for a branch of an Amplify app. 
    */
  var enableAutoBuild: EnableAutoBuild
  
  /**
    *  Enables basic authorization for a branch of an Amplify app. 
    */
  var enableBasicAuth: EnableBasicAuth
  
  /**
    *  Enables notifications for a branch that is part of an Amplify app. 
    */
  var enableNotification: EnableNotification
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined
  
  /**
    *  Enables pull request previews for the branch. 
    */
  var enablePullRequestPreview: EnablePullRequestPreview
  
  /**
    *  The environment variables specific to a branch of an Amplify app. 
    */
  var environmentVariables: EnvironmentVariables
  
  /**
    *  The framework for a branch of an Amplify app. 
    */
  var framework: Framework
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined
  
  /**
    *  The source branch if the branch is a pull request branch. 
    */
  var sourceBranch: js.UndefOr[BranchName] = js.undefined
  
  /**
    *  The current stage for the branch that is part of an Amplify app. 
    */
  var stage: Stage
  
  /**
    *  The tag for the branch of an Amplify app. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The thumbnail URL for the branch of an Amplify app. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
  
  /**
    *  The total number of jobs that are part of an Amplify app. 
    */
  var totalNumberOfJobs: TotalNumberOfJobs
  
  /**
    *  The content Time to Live (TTL) for the website in seconds. 
    */
  var ttl: TTL
  
  /**
    *  The last updated date and time for a branch that is part of an Amplify app. 
    */
  var updateTime: js.Date
}
object Branch {
  
  inline def apply(
    activeJobId: ActiveJobId,
    branchArn: BranchArn,
    branchName: BranchName,
    createTime: js.Date,
    customDomains: CustomDomains,
    description: Description,
    displayName: DisplayName,
    enableAutoBuild: EnableAutoBuild,
    enableBasicAuth: EnableBasicAuth,
    enableNotification: EnableNotification,
    enablePullRequestPreview: EnablePullRequestPreview,
    environmentVariables: EnvironmentVariables,
    framework: Framework,
    stage: Stage,
    totalNumberOfJobs: TotalNumberOfJobs,
    ttl: TTL,
    updateTime: js.Date
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId.asInstanceOf[js.Any], branchArn = branchArn.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], customDomains = customDomains.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableAutoBuild = enableAutoBuild.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableNotification = enableNotification.asInstanceOf[js.Any], enablePullRequestPreview = enablePullRequestPreview.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], framework = framework.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  
  extension [Self <: Branch](x: Self) {
    
    inline def setActiveJobId(value: ActiveJobId): Self = StObject.set(x, "activeJobId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResources(value: AssociatedResources): Self = StObject.set(x, "associatedResources", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResourcesUndefined: Self = StObject.set(x, "associatedResources", js.undefined)
    
    inline def setAssociatedResourcesVarargs(value: AssociatedResource*): Self = StObject.set(x, "associatedResources", js.Array(value*))
    
    inline def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = StObject.set(x, "backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentArnUndefined: Self = StObject.set(x, "backendEnvironmentArn", js.undefined)
    
    inline def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    inline def setBranchArn(value: BranchArn): Self = StObject.set(x, "branchArn", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    inline def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCustomDomains(value: CustomDomains): Self = StObject.set(x, "customDomains", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainsVarargs(value: CustomDomain*): Self = StObject.set(x, "customDomains", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDestinationBranch(value: BranchName): Self = StObject.set(x, "destinationBranch", value.asInstanceOf[js.Any])
    
    inline def setDestinationBranchUndefined: Self = StObject.set(x, "destinationBranch", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableAutoBuild", value.asInstanceOf[js.Any])
    
    inline def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setEnableNotification(value: EnableNotification): Self = StObject.set(x, "enableNotification", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceMode(value: EnablePerformanceMode): Self = StObject.set(x, "enablePerformanceMode", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceModeUndefined: Self = StObject.set(x, "enablePerformanceMode", js.undefined)
    
    inline def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = StObject.set(x, "enablePullRequestPreview", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariables(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = StObject.set(x, "pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setPullRequestEnvironmentNameUndefined: Self = StObject.set(x, "pullRequestEnvironmentName", js.undefined)
    
    inline def setSourceBranch(value: BranchName): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
    
    inline def setSourceBranchUndefined: Self = StObject.set(x, "sourceBranch", js.undefined)
    
    inline def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setThumbnailUrl(value: ThumbnailUrl): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTotalNumberOfJobs(value: TotalNumberOfJobs): Self = StObject.set(x, "totalNumberOfJobs", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: TTL): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
