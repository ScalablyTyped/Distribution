package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  /**
    *  Id of the active job for a branch, part of an Amplify App. 
    */
  var activeJobId: ActiveJobId
  /**
    *  List of custom resources that are linked to this branch. 
    */
  var associatedResources: js.UndefOr[AssociatedResources] = js.undefined
  /**
    *  Basic Authorization credentials for a branch, part of an Amplify App. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  ARN for a branch, part of an Amplify App. 
    */
  var branchArn: BranchArn
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName
  /**
    *  BuildSpec content for branch for Amplify App. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Creation date and time for a branch, part of an Amplify App. 
    */
  var createTime: CreateTime
  /**
    *  Custom domains for a branch, part of an Amplify App. 
    */
  var customDomains: CustomDomains
  /**
    *  Description for a branch, part of an Amplify App. 
    */
  var description: Description
  /**
    *  The destination branch if the branch is a pull request branch. 
    */
  var destinationBranch: js.UndefOr[BranchName] = js.undefined
  /**
    *  Display name for a branch, will use as the default domain prefix. 
    */
  var displayName: DisplayName
  /**
    *  Enables auto-building on push for a branch, part of an Amplify App. 
    */
  var enableAutoBuild: EnableAutoBuild
  /**
    *  Enables Basic Authorization for a branch, part of an Amplify App. 
    */
  var enableBasicAuth: EnableBasicAuth
  /**
    *  Enables notifications for a branch, part of an Amplify App. 
    */
  var enableNotification: EnableNotification
  /**
    *  Enables Pull Request Preview for this branch. 
    */
  var enablePullRequestPreview: EnablePullRequestPreview
  /**
    *  Environment Variables specific to a branch, part of an Amplify App. 
    */
  var environmentVariables: EnvironmentVariables
  /**
    *  Framework for a branch, part of an Amplify App. 
    */
  var framework: Framework
  /**
    *  The source branch if the branch is a pull request branch. 
    */
  var sourceBranch: js.UndefOr[BranchName] = js.undefined
  /**
    *  Stage for a branch, part of an Amplify App. 
    */
  var stage: Stage
  /**
    *  Tag for branch for Amplify App. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    *  Thumbnail URL for the branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
  /**
    *  Total number of Jobs part of an Amplify App. 
    */
  var totalNumberOfJobs: TotalNumberOfJobs
  /**
    *  The content TTL for the website in seconds. 
    */
  var ttl: TTL
  /**
    *  Last updated date and time for a branch, part of an Amplify App. 
    */
  var updateTime: UpdateTime
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
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    destinationBranch: BranchName = null,
    sourceBranch: BranchName = null,
    tags: TagMap = null,
    thumbnailUrl: ThumbnailUrl = null
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId, branchArn = branchArn, branchName = branchName, createTime = createTime, customDomains = customDomains, description = description, displayName = displayName, enableAutoBuild = enableAutoBuild, enableBasicAuth = enableBasicAuth, enableNotification = enableNotification, enablePullRequestPreview = enablePullRequestPreview, environmentVariables = environmentVariables, framework = framework, stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs, ttl = ttl, updateTime = updateTime)
    if (associatedResources != null) __obj.updateDynamic("associatedResources")(associatedResources)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (destinationBranch != null) __obj.updateDynamic("destinationBranch")(destinationBranch)
    if (sourceBranch != null) __obj.updateDynamic("sourceBranch")(sourceBranch)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    __obj.asInstanceOf[Branch]
  }
}

