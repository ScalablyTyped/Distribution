package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEventPatternResponse extends js.Object {
  /**
    * Indicates whether the event matches the event pattern.
    */
  var Result: js.UndefOr[Boolean] = js.native
}

object TestEventPatternResponse {
  @scala.inline
  def apply(Result: js.UndefOr[scala.Boolean] = js.undefined): TestEventPatternResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Result)) __obj.updateDynamic("Result")(Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEventPatternResponse]
  }
}

