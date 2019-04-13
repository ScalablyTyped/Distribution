package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timing extends js.Object {
  /**
    * The time the job finished transcoding, in epoch milliseconds.
    */
  var FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined
  /**
    * The time the job began transcoding, in epoch milliseconds.
    */
  var StartTimeMillis: js.UndefOr[NullableLong] = js.undefined
  /**
    * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
    */
  var SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined
}

object Timing {
  @scala.inline
  def apply(
    FinishTimeMillis: js.UndefOr[NullableLong] = js.undefined,
    StartTimeMillis: js.UndefOr[NullableLong] = js.undefined,
    SubmitTimeMillis: js.UndefOr[NullableLong] = js.undefined
  ): Timing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FinishTimeMillis)) __obj.updateDynamic("FinishTimeMillis")(FinishTimeMillis)
    if (!js.isUndefined(StartTimeMillis)) __obj.updateDynamic("StartTimeMillis")(StartTimeMillis)
    if (!js.isUndefined(SubmitTimeMillis)) __obj.updateDynamic("SubmitTimeMillis")(SubmitTimeMillis)
    __obj.asInstanceOf[Timing]
  }
}

