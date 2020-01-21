package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeploymentRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * The configuration version to deploy.
    */
  var ConfigurationVersion: Version = js.native
  /**
    * The deployment strategy ID.
    */
  var DeploymentStrategyId: typings.awsSdk.appconfigMod.DeploymentStrategyId = js.native
  /**
    * A description of the deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * The environment ID.
    */
  var EnvironmentId: Id = js.native
  /**
    * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object StartDeploymentRequest {
  @scala.inline
  def apply(
    ApplicationId: Id,
    ConfigurationProfileId: Id,
    ConfigurationVersion: Version,
    DeploymentStrategyId: DeploymentStrategyId,
    EnvironmentId: Id,
    Description: Description = null,
    Tags: TagMap = null
  ): StartDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any], DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentRequest]
  }
}

