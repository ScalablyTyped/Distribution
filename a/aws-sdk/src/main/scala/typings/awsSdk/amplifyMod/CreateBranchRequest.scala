package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchRequest extends js.Object {
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
    *  Enables pull request preview for this branch. 
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
  implicit class CreateBranchRequestOps[Self <: CreateBranchRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
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
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEnableAutoBuild(value: EnableAutoBuild): Self = this.set("enableAutoBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoBuild: Self = this.set("enableAutoBuild", js.undefined)
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = this.set("enableBasicAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBasicAuth: Self = this.set("enableBasicAuth", js.undefined)
    @scala.inline
    def setEnableNotification(value: EnableNotification): Self = this.set("enableNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNotification: Self = this.set("enableNotification", js.undefined)
    @scala.inline
    def setEnablePullRequestPreview(value: EnablePullRequestPreview): Self = this.set("enablePullRequestPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePullRequestPreview: Self = this.set("enablePullRequestPreview", js.undefined)
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    @scala.inline
    def setFramework(value: Framework): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    @scala.inline
    def setPullRequestEnvironmentName(value: PullRequestEnvironmentName): Self = this.set("pullRequestEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestEnvironmentName: Self = this.set("pullRequestEnvironmentName", js.undefined)
    @scala.inline
    def setStage(value: Stage): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTtl(value: TTL): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

