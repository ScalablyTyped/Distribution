package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /**
    * The Region service endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  /**
    * The Region opt-in status. The possible values are opt-in-not-required, opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[String] = js.undefined
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object Region {
  @scala.inline
  def apply(Endpoint: String = null, OptInStatus: String = null, RegionName: String = null): Region = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (OptInStatus != null) __obj.updateDynamic("OptInStatus")(OptInStatus)
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[Region]
  }
}

