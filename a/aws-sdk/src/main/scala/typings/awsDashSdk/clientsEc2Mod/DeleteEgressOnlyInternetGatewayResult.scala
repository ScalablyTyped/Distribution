package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnCode: js.UndefOr[Boolean] = js.undefined
}

object DeleteEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(ReturnCode: js.UndefOr[Boolean] = js.undefined): DeleteEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnCode)) __obj.updateDynamic("ReturnCode")(ReturnCode)
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
  }
}

