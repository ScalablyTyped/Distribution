package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRoute extends js.Object {
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcRouteAction = js.native
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcRouteMatch = js.native
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[GrpcRetryPolicy] = js.native
}

object GrpcRoute {
  @scala.inline
  def apply(action: GrpcRouteAction, `match`: GrpcRouteMatch, retryPolicy: GrpcRetryPolicy = null): GrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (retryPolicy != null) __obj.updateDynamic("retryPolicy")(retryPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRoute]
  }
}

