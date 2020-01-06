package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGatewayGroupResponse extends js.Object {
  /**
    * The ARN of the created gateway group.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
}

object CreateGatewayGroupResponse {
  @scala.inline
  def apply(GatewayGroupArn: Arn = null): CreateGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroupArn != null) __obj.updateDynamic("GatewayGroupArn")(GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayGroupResponse]
  }
}

