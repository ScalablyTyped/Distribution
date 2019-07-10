package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoBranchCreationConfig extends js.Object {
  /**
    *  Basic Authorization credentials for the auto created branch. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  /**
    *  BuildSpec for the auto created branch. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.undefined
  /**
    *  Enables auto building for the auto created branch. 
    */
  var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
  /**
    *  Enables Basic Auth for the auto created branch. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
  /**
    *  Environment Variables for the auto created branch. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    *  Framework for the auto created branch. 
    */
  var framework: js.UndefOr[Framework] = js.undefined
  /**
    *  Stage for the auto created branch. 
    */
  var stage: js.UndefOr[Stage] = js.undefined
}

object AutoBranchCreationConfig {
  @scala.inline
  def apply(
    basicAuthCredentials: BasicAuthCredentials = null,
    buildSpec: BuildSpec = null,
    enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
    enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
    environmentVariables: EnvironmentVariables = null,
    framework: Framework = null,
    stage: Stage = null
  ): AutoBranchCreationConfig = {
    val __obj = js.Dynamic.literal()
    if (basicAuthCredentials != null) __obj.updateDynamic("basicAuthCredentials")(basicAuthCredentials)
    if (buildSpec != null) __obj.updateDynamic("buildSpec")(buildSpec)
    if (!js.isUndefined(enableAutoBuild)) __obj.updateDynamic("enableAutoBuild")(enableAutoBuild)
    if (!js.isUndefined(enableBasicAuth)) __obj.updateDynamic("enableBasicAuth")(enableBasicAuth)
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoBranchCreationConfig]
  }
}

