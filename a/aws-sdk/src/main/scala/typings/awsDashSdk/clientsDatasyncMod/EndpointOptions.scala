package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointOptions extends js.Object {
  var Fips: js.UndefOr[Boolean] = js.undefined
  var PrivateLink: js.UndefOr[Boolean] = js.undefined
}

object EndpointOptions {
  @scala.inline
  def apply(Fips: js.UndefOr[Boolean] = js.undefined, PrivateLink: js.UndefOr[Boolean] = js.undefined): EndpointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Fips)) __obj.updateDynamic("Fips")(Fips)
    if (!js.isUndefined(PrivateLink)) __obj.updateDynamic("PrivateLink")(PrivateLink)
    __obj.asInstanceOf[EndpointOptions]
  }
}

