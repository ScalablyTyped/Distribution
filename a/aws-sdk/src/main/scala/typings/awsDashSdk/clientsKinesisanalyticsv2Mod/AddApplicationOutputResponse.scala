package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationOutputResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.OutputDescriptions] = js.undefined
}

object AddApplicationOutputResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: Int | Double = null,
    OutputDescriptions: OutputDescriptions = null
  ): AddApplicationOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    if (OutputDescriptions != null) __obj.updateDynamic("OutputDescriptions")(OutputDescriptions)
    __obj.asInstanceOf[AddApplicationOutputResponse]
  }
}

