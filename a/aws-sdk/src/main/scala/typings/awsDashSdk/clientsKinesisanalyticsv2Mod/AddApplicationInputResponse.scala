package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationInputResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  /**
    * Describes the application input configuration. 
    */
  var InputDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputDescriptions] = js.undefined
}

object AddApplicationInputResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
    InputDescriptions: InputDescriptions = null
  ): AddApplicationInputResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (!js.isUndefined(ApplicationVersionId)) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId)
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions)
    __obj.asInstanceOf[AddApplicationInputResponse]
  }
}

