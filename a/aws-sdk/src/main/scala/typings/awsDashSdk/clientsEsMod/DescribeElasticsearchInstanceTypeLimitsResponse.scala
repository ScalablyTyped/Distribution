package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
  var LimitsByRole: js.UndefOr[typings.awsDashSdk.clientsEsMod.LimitsByRole] = js.undefined
}

object DescribeElasticsearchInstanceTypeLimitsResponse {
  @scala.inline
  def apply(LimitsByRole: LimitsByRole = null): DescribeElasticsearchInstanceTypeLimitsResponse = {
    val __obj = js.Dynamic.literal()
    if (LimitsByRole != null) __obj.updateDynamic("LimitsByRole")(LimitsByRole)
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
  }
}

