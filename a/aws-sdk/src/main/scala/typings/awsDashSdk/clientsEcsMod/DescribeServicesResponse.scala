package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServicesResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  /**
    * The list of services described.
    */
  var services: js.UndefOr[Services] = js.undefined
}

object DescribeServicesResponse {
  @scala.inline
  def apply(failures: Failures = null, services: Services = null): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[DescribeServicesResponse]
  }
}

