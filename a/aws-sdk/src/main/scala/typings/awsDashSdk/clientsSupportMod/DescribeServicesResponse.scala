package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesResponse extends js.Object {
  /**
    * A JSON-formatted list of AWS services.
    */
  var services: js.UndefOr[ServiceList] = js.native
}

object DescribeServicesResponse {
  @scala.inline
  def apply(services: ServiceList = null): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServicesResponse]
  }
}

