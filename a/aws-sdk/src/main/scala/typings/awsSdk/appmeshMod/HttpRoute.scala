package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRoute extends js.Object {
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: HttpRouteAction = js.native
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: HttpRouteMatch = js.native
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.native
  var timeout: js.UndefOr[HttpTimeout] = js.native
}

object HttpRoute {
  @scala.inline
  def apply(
    action: HttpRouteAction,
    `match`: HttpRouteMatch,
    retryPolicy: HttpRetryPolicy = null,
    timeout: HttpTimeout = null
  ): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (retryPolicy != null) __obj.updateDynamic("retryPolicy")(retryPolicy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRoute]
  }
}

