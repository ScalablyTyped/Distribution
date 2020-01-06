package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  /**
    * The time the job finished transcoding, in epoch milliseconds.
    */
  var FinishTimeMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The time the job began transcoding, in epoch milliseconds.
    */
  var StartTimeMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
    */
  var SubmitTimeMillis: js.UndefOr[NullableLong] = js.native
}

object Timing {
  @scala.inline
  def apply(
    FinishTimeMillis: Int | Double = null,
    StartTimeMillis: Int | Double = null,
    SubmitTimeMillis: Int | Double = null
  ): Timing = {
    val __obj = js.Dynamic.literal()
    if (FinishTimeMillis != null) __obj.updateDynamic("FinishTimeMillis")(FinishTimeMillis.asInstanceOf[js.Any])
    if (StartTimeMillis != null) __obj.updateDynamic("StartTimeMillis")(StartTimeMillis.asInstanceOf[js.Any])
    if (SubmitTimeMillis != null) __obj.updateDynamic("SubmitTimeMillis")(SubmitTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
}

