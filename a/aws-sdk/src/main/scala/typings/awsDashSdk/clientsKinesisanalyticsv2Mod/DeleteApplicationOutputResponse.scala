package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationOutputResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The current application version ID.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
}

object DeleteApplicationOutputResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  ): DeleteApplicationOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN)
    if (!js.isUndefined(ApplicationVersionId)) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId)
    __obj.asInstanceOf[DeleteApplicationOutputResponse]
  }
}

