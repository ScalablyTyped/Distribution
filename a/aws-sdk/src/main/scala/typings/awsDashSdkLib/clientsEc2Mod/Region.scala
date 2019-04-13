package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /**
    * The region service endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  /**
    * The name of the region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object Region {
  @scala.inline
  def apply(Endpoint: String = null, RegionName: String = null): Region = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[Region]
  }
}

