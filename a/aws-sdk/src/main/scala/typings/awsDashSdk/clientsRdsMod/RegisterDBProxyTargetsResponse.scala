package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDBProxyTargetsResponse extends js.Object {
  /**
    * One or more DBProxyTarget objects that are created when you register targets with a target group.
    */
  var DBProxyTargets: js.UndefOr[TargetList] = js.native
}

object RegisterDBProxyTargetsResponse {
  @scala.inline
  def apply(DBProxyTargets: TargetList = null): RegisterDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxyTargets != null) __obj.updateDynamic("DBProxyTargets")(DBProxyTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDBProxyTargetsResponse]
  }
}

