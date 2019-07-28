package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSpeechSynthesisTasksOutput extends js.Object {
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPollyMod.NextToken] = js.undefined
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typings.awsDashSdk.clientsPollyMod.SynthesisTasks] = js.undefined
}

object ListSpeechSynthesisTasksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, SynthesisTasks: SynthesisTasks = null): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SynthesisTasks != null) __obj.updateDynamic("SynthesisTasks")(SynthesisTasks)
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
}

