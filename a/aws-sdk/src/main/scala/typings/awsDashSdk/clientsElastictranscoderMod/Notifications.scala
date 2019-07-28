package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
    */
  var Completed: js.UndefOr[SnsTopic] = js.undefined
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
    */
  var Error: js.UndefOr[SnsTopic] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.
    */
  var Progressing: js.UndefOr[SnsTopic] = js.undefined
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
    */
  var Warning: js.UndefOr[SnsTopic] = js.undefined
}

object Notifications {
  @scala.inline
  def apply(
    Completed: SnsTopic = null,
    Error: SnsTopic = null,
    Progressing: SnsTopic = null,
    Warning: SnsTopic = null
  ): Notifications = {
    val __obj = js.Dynamic.literal()
    if (Completed != null) __obj.updateDynamic("Completed")(Completed)
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (Progressing != null) __obj.updateDynamic("Progressing")(Progressing)
    if (Warning != null) __obj.updateDynamic("Warning")(Warning)
    __obj.asInstanceOf[Notifications]
  }
}

