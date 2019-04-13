package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverInstancesResponse extends js.Object {
  /**
    * A complex type that contains one HttpInstanceSummary for each registered instance.
    */
  var Instances: js.UndefOr[HttpInstanceSummaryList] = js.undefined
}

object DiscoverInstancesResponse {
  @scala.inline
  def apply(Instances: HttpInstanceSummaryList = null): DiscoverInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[DiscoverInstancesResponse]
  }
}

