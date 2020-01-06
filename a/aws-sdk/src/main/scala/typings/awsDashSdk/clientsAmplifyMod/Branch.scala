package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends js.Object {
  /**
    *  Id of the active job for a branch, part of an Amplify App. 
    */
  var activeJobId: ActiveJobId = js.native
  /**
    *  List of custom resources that are linked to this branch. 
    */
  var associatedResources: js.UndefOr[AssociatedResources] = js.native
  /**
    *  ARN for a Backend Environment, part of an Amplify App. 
    */
  var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn] = js.native
  /**
    *  Basic Authorization credentials for a branch, part of an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  ARN for a branch, part of an Amplify App. 
    */
  var branchArn: BranchArn = js.native
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName = js.native
  /**
    *  BuildSpec content for branch for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  Creation date and time for a branch, part of an Amplify App. 
    */
  var createTime: CreateTime = js.native
  /**
    *  Custom domains for a branch, part of an Amplify App. 
    */
  var customDomains: CustomDomains = js.native
  /**
    *  Description for a branch, part of an Amplify App. 
    */
  var description: Description = js.native
  /**
    *  The destination branch if the branch is a pull request branch. 
    */
  var destinationBranch: js.UndefOr[BranchName] = js.native
  /**
    *  Display name for a branch, will use as the default domain prefix. 
    */
  var displayName: DisplayName = js.native
  /**
    *  Enables auto-building on push for a branch, part of an Amplify App. 
    */
  var enableAutoBuild: EnableAutoBuild = js.native
  /**
    *  Enables Basic Authorization for a branch, part of an Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth = js.native
  /**
    *  Enables notifications for a branch, part of an Amplify App. 
    */
  var enableNotification: EnableNotification = js.native
  /**
    *  Enables Pull Request Preview for this branch. 
    */
  var enablePullRequestPreview: EnablePullRequestPreview = js.native
  /**
    *  Environment Variables specific to a branch, part of an Amplify App. 
    */
  var environmentVariables: EnvironmentVariables = js.native
  /**
    *  Framework for a branch, part of an Amplify App. 
    */
  var framework: Framework = js.native
  /**
    *  The Amplify Environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  /**
    *  The source branch if the branch is a pull request branch. 
    */
  var sourceBranch: js.UndefOr[BranchName] = js.native
  /**
    *  Stage for a branch, part of an Amplify App. 
    */
  var stage: Stage = js.native
  /**
    *  Tag for branch for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    *  Thumbnail URL for the branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
  /**
    *  Total number of Jobs part of an Amplify App. 
    */
  var totalNumberOfJobs: TotalNumberOfJobs = js.native
  /**
    *  The content TTL for the website in seconds. 
    */
  var ttl: TTL = js.native
  /**
    *  Last updated date and time for a branch, part of an Amplify App. 
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

