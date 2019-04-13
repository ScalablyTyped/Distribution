package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskSetsRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist in.
    */
  var cluster: String
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
    */
  var service: String
  /**
    * The ID or full Amazon Resource Name (ARN) of task sets to describe.
    */
  var taskSets: js.UndefOr[StringList] = js.undefined
}

object DescribeTaskSetsRequest {
  @scala.inline
  def apply(cluster: String, service: String, taskSets: StringList = null): DescribeTaskSetsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster, service = service)
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets)
    __obj.asInstanceOf[DescribeTaskSetsRequest]
  }
}

