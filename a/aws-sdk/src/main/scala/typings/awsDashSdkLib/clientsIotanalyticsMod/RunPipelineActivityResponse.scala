package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunPipelineActivityResponse extends js.Object {
  /**
    * In case the pipeline activity fails, the log message that is generated.
    */
  var logResult: js.UndefOr[LogResult] = js.undefined
  /**
    * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the pipeline activity on each input sample message payload, encoded in base64.)
    */
  var payloads: js.UndefOr[MessagePayloads] = js.undefined
}

object RunPipelineActivityResponse {
  @scala.inline
  def apply(logResult: LogResult = null, payloads: MessagePayloads = null): RunPipelineActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (logResult != null) __obj.updateDynamic("logResult")(logResult)
    if (payloads != null) __obj.updateDynamic("payloads")(payloads)
    __obj.asInstanceOf[RunPipelineActivityResponse]
  }
}

