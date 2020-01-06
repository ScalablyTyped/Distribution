package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationRequest extends js.Object {
  /**
    * The application to get.
    */
  var Application: StringWithLengthBetween1And64 = js.native
  /**
    * The configuration version returned in the most recent GetConfiguration response.
    */
  var ClientConfigurationVersion: js.UndefOr[Version] = js.native
  /**
    * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration in intervals, as defined in the deployment strategy.
    */
  var ClientId: StringWithLengthBetween1And64 = js.native
  /**
    * The configuration to get.
    */
  var Configuration: StringWithLengthBetween1And64 = js.native
  /**
    * The environment to get.
    */
  var Environment: StringWithLengthBetween1And64 = js.native
}

object GetConfigurationRequest {
  @scala.inline
  def apply(
    Application: StringWithLengthBetween1And64,
    ClientId: StringWithLengthBetween1And64,
    Configuration: StringWithLengthBetween1And64,
    Environment: StringWithLengthBetween1And64,
    ClientConfigurationVersion: Version = null
  ): GetConfigurationRequest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any])
    if (ClientConfigurationVersion != null) __obj.updateDynamic("ClientConfigurationVersion")(ClientConfigurationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationRequest]
  }
}

