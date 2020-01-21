package typings.apolloReact.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockedSubscription extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var request: ParsedRequest
  var results: js.UndefOr[js.Array[MockedSubscriptionResult]] = js.undefined
}

object MockedSubscription {
  @scala.inline
  def apply(
    request: ParsedRequest,
    id: Int | Double = null,
    results: js.Array[MockedSubscriptionResult] = null
  ): MockedSubscription = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockedSubscription]
  }
}

