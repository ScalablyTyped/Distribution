package typings.angularCore.timingStrategyMod

import typings.angularCore.queryDefinitionMod.QueryTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingResult extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var timing: QueryTiming | Null
}

object TimingResult {
  @scala.inline
  def apply(message: String = null, timing: QueryTiming = null): TimingResult = {
    val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingResult]
  }
}

