package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationVpcConfigurationResponse extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application. 
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The parameters of the new VPC configuration.
    */
  var VpcConfigurationDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.VpcConfigurationDescription] = js.native
}

object AddApplicationVpcConfigurationResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: Int | Double = null,
    VpcConfigurationDescription: VpcConfigurationDescription = null
  ): AddApplicationVpcConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    if (VpcConfigurationDescription != null) __obj.updateDynamic("VpcConfigurationDescription")(VpcConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationVpcConfigurationResponse]
  }
}

