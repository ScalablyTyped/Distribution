package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSpotInstancesResult extends js.Object {
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
}

object RequestSpotInstancesResult {
  @scala.inline
  def apply(SpotInstanceRequests: SpotInstanceRequestList = null): RequestSpotInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (SpotInstanceRequests != null) __obj.updateDynamic("SpotInstanceRequests")(SpotInstanceRequests)
    __obj.asInstanceOf[RequestSpotInstancesResult]
  }
}

