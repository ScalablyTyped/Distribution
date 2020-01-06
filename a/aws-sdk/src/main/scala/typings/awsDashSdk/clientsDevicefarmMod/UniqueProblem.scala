package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueProblem extends js.Object {
  /**
    * A message about the unique problems' result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Information about the problems.
    */
  var problems: js.UndefOr[Problems] = js.native
}

object UniqueProblem {
  @scala.inline
  def apply(message: Message = null, problems: Problems = null): UniqueProblem = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (problems != null) __obj.updateDynamic("problems")(problems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueProblem]
  }
}

