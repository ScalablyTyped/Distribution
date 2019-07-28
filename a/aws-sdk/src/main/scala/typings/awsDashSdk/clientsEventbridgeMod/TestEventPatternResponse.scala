package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEventPatternResponse extends js.Object {
  /**
    * Indicates whether the event matches the event pattern.
    */
  var Result: js.UndefOr[Boolean] = js.undefined
}

object TestEventPatternResponse {
  @scala.inline
  def apply(Result: js.UndefOr[Boolean] = js.undefined): TestEventPatternResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Result)) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[TestEventPatternResponse]
  }
}

