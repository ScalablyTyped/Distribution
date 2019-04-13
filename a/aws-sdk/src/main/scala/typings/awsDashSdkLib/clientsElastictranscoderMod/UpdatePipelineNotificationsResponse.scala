package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineNotificationsResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline associated with this notification.
    */
  var Pipeline: js.UndefOr[Pipeline] = js.undefined
}

object UpdatePipelineNotificationsResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null): UpdatePipelineNotificationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline)
    __obj.asInstanceOf[UpdatePipelineNotificationsResponse]
  }
}

