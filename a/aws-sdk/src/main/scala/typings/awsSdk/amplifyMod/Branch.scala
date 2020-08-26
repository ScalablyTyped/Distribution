package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends js.Object {
  /**
    *  The ID of the active job for a branch of an Amplify app. 
    */
  var activeJobId: ActiveJobId = js.native
  /**
    *  A list of custom resources that are linked to this branch. 
    */
  var associatedResources: js.UndefOr[AssociatedResources] = js.native
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  /**
    *  The basic authorization credentials for a branch of an Amplify app. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  The Amazon Resource Name (ARN) for a branch that is part of an Amplify app. 
    */
  var branchArn: BranchArn = js.native
  /**
    *  The name for the branch that is part of an Amplify app. 
    */
  var branchName: BranchName = js.native
  /**
    *  The build specification (build spec) content for the branch of an Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  The creation date and time for a branch that is part of an Amplify app. 
    */
  var createTime: CreateTime = js.native
  /**
    *  The custom domains for a branch of an Amplify app. 
    */
  var customDomains: CustomDomains = js.native
  /**
    *  The description for the branch that is part of an Amplify app. 
    */
  var description: Description = js.native
  /**
    *  The destination branch if the branch is a pull request branch. 
    */
  var destinationBranch: js.UndefOr[BranchName] = js.native
  /**
    *  The display name for the branch. This is used as the default domain prefix. 
    */
  var displayName: DisplayName = js.native
  /**
    *  Enables auto-building on push for a branch of an Amplify app. 
    */
  var enableAutoBuild: EnableAutoBuild = js.native
  /**
    *  Enables basic authorization for a branch of an Amplify app. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables notifications for a branch that is part of an Amplify app. 
    */
  var enableNotification: EnableNotification = js.native
  /**
    *  Enables pull request preview for the branch. 
    */
  var enablePullRequestPreview: EnablePullRequestPreview = js.native
  /**
    *  The environment variables specific to a branch of an Amplify app. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  The framework for a branch of an Amplify app. 
    */
  var framework: Framework = js.native
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  The source branch if the branch is a pull request branch. 
    */
  var sourceBranch: js.UndefOr[BranchName] = js.native
  /**
    *  The current stage for the branch that is part of an Amplify app. 
    */
  var stage: Stage = js.native
  /**
    *  The tag for the branch of an Amplify app. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  The thumbnail URL for the branch of an Amplify app. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
  /**
    *  The total number of jobs that are part of an Amplify app. 
    */
  var totalNumberOfJobs: TotalNumberOfJobs = js.native
  /**
    *  The content Time to Live (TTL) for the website in seconds. 
    */
  var ttl: TTL = js.native
  /**
    *  The last updated date and time for a branch that is part of an Amplify app. 
    */
  var updateTime: UpdateTime = js.native
}

object Branch {
  @scala.inline
  def apply(
    activeJobId: ActiveJobId,
    branchArn: BranchArn,
    branchName: BranchName,
    createTime: CreateTime,
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
    updateTime: UpdateTime
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId.asInstanceOf[js.Any], branchArn = branchArn.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], customDomains = customDomains.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableAutoBuild = enableAutoBuild.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableNotification = enableNotification.asInstanceOf[js.Any], enablePullRequestPreview = enablePullRequestPreview.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], framework = framework.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  @scala.inline
  implicit class BranchOps[Self <: Branch] (val x: Self) extends AnyVal {
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
    def setActiveJobId(value: ActiveJobId): Self = this.set("activeJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchArn(value: BranchArn): Self = this.set("branchArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateTime(value: CreateTime): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomDomainsVarargs(value: CustomDomain*): Self = this.set("customDomains", js.Array(value :_*))
    @scala.inline
    def setCustomDomains(value: CustomDomains): Self = this.set("customDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableAutoBuild(value: EnableAutoBuild): Self = this.set("enableAutoBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = this.set("enableBasicAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableNotification(value: EnableNotification): Self = this.set("enableNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = this.set("enablePullRequestPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramework(value: Framework): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: Stage): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalNumberOfJobs(value: TotalNumberOfJobs): Self = this.set("totalNumberOfJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: TTL): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTime(value: UpdateTime): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatedResourcesVarargs(value: AssociatedResource*): Self = this.set("associatedResources", js.Array(value :_*))
    @scala.inline
    def setAssociatedResources(value: AssociatedResources): Self = this.set("associatedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedResources: Self = this.set("associatedResources", js.undefined)
    @scala.inline
    def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = this.set("backendEnvironmentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendEnvironmentArn: Self = this.set("backendEnvironmentArn", js.undefined)
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = this.set("basicAuthCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicAuthCredentials: Self = this.set("basicAuthCredentials", js.undefined)
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = this.set("buildSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildSpec: Self = this.set("buildSpec", js.undefined)
    @scala.inline
    def setDestinationBranch(value: BranchName): Self = this.set("destinationBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationBranch: Self = this.set("destinationBranch", js.undefined)
    @scala.inline
    def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = this.set("pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestEnvironmentName: Self = this.set("pullRequestEnvironmentName", js.undefined)
    @scala.inline
    def setSourceBranch(value: BranchName): Self = this.set("sourceBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBranch: Self = this.set("sourceBranch", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThumbnailUrl(value: ThumbnailUrl): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
  }
  
}

