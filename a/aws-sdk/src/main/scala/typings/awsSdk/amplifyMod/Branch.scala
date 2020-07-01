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
    updateTime: UpdateTime,
    associatedResources: AssociatedResources = null,
    backendEnvironmentArn: BackendEnvironmentArn = null,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    destinationBranch: BranchName = null,
    pullRequestEnvironmentName: PullRequestEnvironmentName = null,
    sourceBranch: BranchName = null,
    tags: TagMap = null,
    thumbnailUrl: ThumbnailUrl = null
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId.asInstanceOf[js.Any], branchArn = branchArn.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], customDomains = customDomains.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableAutoBuild = enableAutoBuild.asInstanceOf[js.Any], enableBasicAuth = enableBasicAuth.asInstanceOf[js.Any], enableNotification = enableNotification.asInstanceOf[js.Any], enablePullRequestPreview = enablePullRequestPreview.asInstanceOf[js.Any], environmentVariables = environmentVariables.asInstanceOf[js.Any], framework = framework.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    if (associatedResources != null) __obj.updateDynamic("associatedResources")(associatedResources.asInstanceOf[js.Any])
    if (backendEnvironmentArn != null) __obj.updateDynamic("backendEnvironmentArn")(backendEnvironmentArn.asInstanceOf[js.Any])
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials.asInstanceOf[js.Any])
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec.asInstanceOf[js.Any])
    if (destinationBranch != null) __obj.updateDynamic("destinationBranch")(destinationBranch.asInstanceOf[js.Any])
    if (pullRequestEnvironmentName != null) __obj.updateDynamic("pullRequestEnvironmentName")(pullRequestEnvironmentName.asInstanceOf[js.Any])
    if (sourceBranch != null) __obj.updateDynamic("sourceBranch")(sourceBranch.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}

