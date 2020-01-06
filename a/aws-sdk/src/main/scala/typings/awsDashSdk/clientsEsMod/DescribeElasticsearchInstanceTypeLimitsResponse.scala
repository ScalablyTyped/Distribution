package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
  var LimitsByRole: js.UndefOr[typings.awsDashSdk.clientsEsMod.LimitsByRole] = js.native
}

object DescribeElasticsearchInstanceTypeLimitsResponse {
  @scala.inline
  def apply(LimitsByRole: LimitsByRole = null): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    if (LimitsByRole != null) __obj.updateDynamic("LimitsByRole")(LimitsByRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
}

