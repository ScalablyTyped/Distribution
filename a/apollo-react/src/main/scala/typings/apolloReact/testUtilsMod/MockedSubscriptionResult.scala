package typings.apolloReact.testUtilsMod

import typings.std.Error
import typings.typedGraphql.mod.GraphQLResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockedSubscriptionResult extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var result: js.UndefOr[GraphQLResult] = js.undefined
}

object MockedSubscriptionResult {
  @scala.inline
  def apply(delay: Int | Double = null, error: Error = null, result: GraphQLResult = null): MockedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockedSubscriptionResult]
  }
}

