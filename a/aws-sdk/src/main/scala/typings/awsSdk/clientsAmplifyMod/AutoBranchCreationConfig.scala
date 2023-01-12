package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoBranchCreationConfig extends StObject {
  
  /**
    *  The basic authorization credentials for the autocreated branch. You must base64-encode the authorization credentials and provide them in the format user:password.
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  The build specification (build spec) for the autocreated branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  
  /**
    *  Enables auto building for the autocreated branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  
  /**
    *  Enables basic authorization for the autocreated branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  
  /**
    * Enables performance mode for the branch. Performance mode optimizes for faster hosting performance by keeping content cached at the edge for a longer interval. When performance mode is enabled, hosting configuration or code changes can take up to 10 minutes to roll out. 
    */
  var enablePerformanceMode: js.UndefOr[EnablePerformanceMode] = js.undefined
  
  /**
    *  Enables pull request previews for the autocreated branch. 
    */
  var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview] = js.undefined
  
  /**
    *  The environment variables for the autocreated branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  
  /**
    *  The framework for the autocreated branch. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
  
  /**
    *  The Amplify environment name for the pull request. 
    */
  var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName] = js.undefined
  
  /**
    *  Describes the current stage for the autocreated branch. 
    */
  var stage: js.UndefOr[Stage] = js.undefined
}
object AutoBranchCreationConfig {
  
  inline def apply(): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoBranchCreationConfig] (val x: Self) extends AnyVal {
    
    inline def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    inline def setBuildSpec(value: BuildSpec): Self = StObject.set(x, "buildSpec", value.asInstanceOf[js.Any])
    
    inline def setBuildSpecUndefined: Self = StObject.set(x, "buildSpec", js.undefined)
    
    inline def setEnableAutoBuild(value: EnableAutoBuild): Self = StObject.set(x, "enableAutoBuild", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoBuildUndefined: Self = StObject.set(x, "enableAutoBuild", js.undefined)
    
    inline def setEnableBasicAuth(value: EnableBasicAuth): Self = StObject.set(x, "enableBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setEnableBasicAuthUndefined: Self = StObject.set(x, "enableBasicAuth", js.undefined)
    
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
  }
}
