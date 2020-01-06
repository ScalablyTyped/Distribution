package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportDefinitionsRequest extends js.Object {
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsCurMod.MaxResults] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeReportDefinitionsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: GenericString = null): DescribeReportDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportDefinitionsRequest]
  }
}

