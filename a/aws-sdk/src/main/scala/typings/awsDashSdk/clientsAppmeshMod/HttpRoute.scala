package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: HttpRouteAction
  /**
    * The criteria for determining an HTTP request match.
    */
  var `match`: HttpRouteMatch
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.undefined
}

object HttpRoute {
  @scala.inline
  def apply(action: HttpRouteAction, `match`: HttpRouteMatch, retryPolicy: HttpRetryPolicy = null): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action)
    __obj.updateDynamic("match")(`match`)
    if (retryPolicy != null) __obj.updateDynamic("retryPolicy")(retryPolicy)
    __obj.asInstanceOf[HttpRoute]
  }
}

