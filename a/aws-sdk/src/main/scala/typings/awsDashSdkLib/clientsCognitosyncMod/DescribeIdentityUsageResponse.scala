package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityUsageResponse extends js.Object {
  /**
    * Usage information for the identity.
    */
  var IdentityUsage: js.UndefOr[IdentityUsage] = js.undefined
}

object DescribeIdentityUsageResponse {
  @scala.inline
  def apply(IdentityUsage: IdentityUsage = null): DescribeIdentityUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityUsage != null) __obj.updateDynamic("IdentityUsage")(IdentityUsage)
    __obj.asInstanceOf[DescribeIdentityUsageResponse]
  }
}

