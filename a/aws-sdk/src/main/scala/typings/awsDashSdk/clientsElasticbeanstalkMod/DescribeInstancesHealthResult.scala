package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesHealthResult extends js.Object {
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.InstanceHealthList] = js.native
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.NextToken] = js.native
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RefreshedAt] = js.native
}

object DescribeInstancesHealthResult {
  @scala.inline
  def apply(
    InstanceHealthList: InstanceHealthList = null,
    NextToken: NextToken = null,
    RefreshedAt: RefreshedAt = null
  ): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceHealthList != null) __obj.updateDynamic("InstanceHealthList")(InstanceHealthList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RefreshedAt != null) __obj.updateDynamic("RefreshedAt")(RefreshedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
}

