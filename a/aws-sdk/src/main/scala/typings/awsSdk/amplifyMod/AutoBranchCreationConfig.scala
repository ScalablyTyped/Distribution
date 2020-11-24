package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoBranchCreationConfig extends js.Object {
  
  /**
    *  The basic authorization credentials for the autocreated branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  
  /**
    *  The build specification (build spec) for the autocreated branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  
  /**
    *  Enables auto building for the autocreated branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.native
  
  /**
    *  Enables basic authorization for the autocreated branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.native
  
  /**
    *  Enables pull request previews for the autocreated branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.native
  
  /**
    *  The environment variables for the autocreated branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    *  The framework for the autocreated branch. 
    */
  var framework: js.UndefOr[Framework] = js.native
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.native
  
  /**
    *  Describes the current stage for the autocreated branch. 
    */
  var stage: js.UndefOr[Stage] = js.native
}
object AutoBranchCreationConfig {
  
  @scala.inline
  def apply(): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
  
  @scala.inline
  implicit class AutoBranchCreationConfigOps[Self <: AutoBranchCreationConfig] (val x: Self) extends AnyVal {
    
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
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = this.set("basicAuthCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicAuthCredentials: Self = this.set("basicAuthCredentials", js.undefined)
    
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = this.set("buildSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildSpec: Self = this.set("buildSpec", js.undefined)
    
    @scala.inline
    def setEnableAutoBuild(value: EnableAutoBuild): Self = this.set("enableAutoBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoBuild: Self = this.set("enableAutoBuild", js.undefined)
    
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = this.set("enableBasicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBasicAuth: Self = this.set("enableBasicAuth", js.undefined)
    
    @scala.inline
    def setEnablePerformanceMode(value: EnablePerformanceMode): Self = this.set("enablePerformanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePerformanceMode: Self = this.set("enablePerformanceMode", js.undefined)
    
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
  }
}
