package typings.awsSdk.appmeshMod

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
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[GrpcTimeout] = js.native
}

object GrpcRoute {
  @scala.inline
  def apply(action: GrpcRouteAction, `match`: GrpcRouteMatch): GrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRoute]
  }
  @scala.inline
  implicit class GrpcRouteOps[Self <: GrpcRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: GrpcRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: GrpcRouteMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryPolicy(value: GrpcRetryPolicy): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    @scala.inline
    def setTimeout(value: GrpcTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

