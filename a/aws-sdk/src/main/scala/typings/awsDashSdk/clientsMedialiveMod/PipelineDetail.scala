package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDetail extends js.Object {
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[__string] = js.native
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[__string] = js.native
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[__string] = js.native
}

object PipelineDetail {
  @scala.inline
  def apply(
    ActiveInputAttachmentName: __string = null,
    ActiveInputSwitchActionName: __string = null,
    PipelineId: __string = null
  ): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    if (ActiveInputAttachmentName != null) __obj.updateDynamic("ActiveInputAttachmentName")(ActiveInputAttachmentName.asInstanceOf[js.Any])
    if (ActiveInputSwitchActionName != null) __obj.updateDynamic("ActiveInputSwitchActionName")(ActiveInputSwitchActionName.asInstanceOf[js.Any])
    if (PipelineId != null) __obj.updateDynamic("PipelineId")(PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDetail]
  }
}

