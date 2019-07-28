package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityPoolUsageResponse extends js.Object {
  /**
    * Information about the usage of the identity pool.
    */
  var IdentityPoolUsage: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolUsage] = js.undefined
}

object DescribeIdentityPoolUsageResponse {
  @scala.inline
  def apply(IdentityPoolUsage: IdentityPoolUsage = null): DescribeIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolUsage != null) __obj.updateDynamic("IdentityPoolUsage")(IdentityPoolUsage)
    __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
  }
}

