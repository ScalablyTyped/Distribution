package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnCode: js.UndefOr[Boolean] = js.native
}

object DeleteEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(ReturnCode: js.UndefOr[scala.Boolean] = js.undefined): DeleteEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnCode)) __obj.updateDynamic("ReturnCode")(ReturnCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
  }
}

