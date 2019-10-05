package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The current application version ID.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
}

object DeleteApplicationInputProcessingConfigurationResponse {
  @scala.inline
  def apply(ApplicationARN: ResourceARN = null, ApplicationVersionId: Int | Double = null): DeleteApplicationInputProcessingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (ApplicationVersionId != null) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
  }
}

