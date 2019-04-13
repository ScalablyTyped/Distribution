package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOperatingSystemsResponse extends js.Object {
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[OperatingSystems] = js.undefined
}

object DescribeOperatingSystemsResponse {
  @scala.inline
  def apply(OperatingSystems: OperatingSystems = null): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystems != null) __obj.updateDynamic("OperatingSystems")(OperatingSystems)
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
}

