package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpeechSynthesisTaskOutput extends js.Object {
  /**
    * SynthesisTask object that provides information from the requested task, including output format, creation time, task status, and so on.
    */
  var SynthesisTask: js.UndefOr[typings.awsDashSdk.clientsPollyMod.SynthesisTask] = js.native
}

object GetSpeechSynthesisTaskOutput {
  @scala.inline
  def apply(SynthesisTask: SynthesisTask = null): GetSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    if (SynthesisTask != null) __obj.updateDynamic("SynthesisTask")(SynthesisTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpeechSynthesisTaskOutput]
  }
}

