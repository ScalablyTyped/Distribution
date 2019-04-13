package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  /**
    *  Id of the active job for a branch, part of an Amplify App. 
    */
  var activeJobId: ActiveJobId
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
    *  Display name for a branch, part of an Amplify App. 
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
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
    *  Environment Variables specific to a branch, part of an Amplify App. 
    */
  var environmentVariables: EnvironmentVariables
  /**
    *  Framework for a branch, part of an Amplify App. 
    */
  var framework: Framework
  /**
    *  Stage for a branch, part of an Amplify App. 
    */
  var stage: Stage
  /**
    *  Tag for branch for Amplify App. 
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    *  Thumbnail Url for the branch. 
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
    enableAutoBuild: EnableAutoBuild,
    enableBasicAuth: EnableBasicAuth,
    enableNotification: EnableNotification,
    environmentVariables: EnvironmentVariables,
    framework: Framework,
    stage: Stage,
    totalNumberOfJobs: TotalNumberOfJobs,
    ttl: TTL,
    updateTime: UpdateTime,
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    displayName: DisplayName = null,
    tags: Tags = null,
    thumbnailUrl: ThumbnailUrl = null
  ): Branch = {
    val __obj = js.Dynamic.literal(activeJobId = activeJobId, branchArn = branchArn, branchName = branchName, createTime = createTime, customDomains = customDomains, description = description, enableAutoBuild = enableAutoBuild, enableBasicAuth = enableBasicAuth, enableNotification = enableNotification, environmentVariables = environmentVariables, framework = framework, stage = stage.asInstanceOf[js.Any], totalNumberOfJobs = totalNumberOfJobs, ttl = ttl, updateTime = updateTime)
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    __obj.asInstanceOf[Branch]
  }
}

