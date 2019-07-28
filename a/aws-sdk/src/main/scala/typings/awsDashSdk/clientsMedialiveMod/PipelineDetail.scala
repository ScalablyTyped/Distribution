package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineDetail extends js.Object {
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[__string] = js.undefined
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[__string] = js.undefined
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[__string] = js.undefined
}

object PipelineDetail {
  @scala.inline
  def apply(
    ActiveInputAttachmentName: __string = null,
    ActiveInputSwitchActionName: __string = null,
    PipelineId: __string = null
  ): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    if (ActiveInputAttachmentName != null) __obj.updateDynamic("ActiveInputAttachmentName")(ActiveInputAttachmentName)
    if (ActiveInputSwitchActionName != null) __obj.updateDynamic("ActiveInputSwitchActionName")(ActiveInputSwitchActionName)
    if (PipelineId != null) __obj.updateDynamic("PipelineId")(PipelineId)
    __obj.asInstanceOf[PipelineDetail]
  }
}

