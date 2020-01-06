package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClassicLinkInstancesResult extends js.Object {
  /**
    * Information about one or more linked EC2-Classic instances.
    */
  var Instances: js.UndefOr[ClassicLinkInstanceList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClassicLinkInstancesResult {
  @scala.inline
  def apply(Instances: ClassicLinkInstanceList = null, NextToken: String = null): DescribeClassicLinkInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClassicLinkInstancesResult]
  }
}

