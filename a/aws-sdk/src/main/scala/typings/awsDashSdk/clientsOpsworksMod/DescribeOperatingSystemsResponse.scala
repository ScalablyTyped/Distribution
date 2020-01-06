package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOperatingSystemsResponse extends js.Object {
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.OperatingSystems] = js.native
}

object DescribeOperatingSystemsResponse {
  @scala.inline
  def apply(OperatingSystems: OperatingSystems = null): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystems != null) __obj.updateDynamic("OperatingSystems")(OperatingSystems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
}

