package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTasksRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task or tasks to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the task or tasks you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether you want to see the resource tags for the task. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[TaskFieldList] = js.undefined
  /**
    * A list of up to 100 task IDs or full ARN entries.
    */
  var tasks: StringList
}

object DescribeTasksRequest {
  @scala.inline
  def apply(tasks: StringList, cluster: String = null, include: TaskFieldList = null): DescribeTasksRequest = {
    val __obj = js.Dynamic.literal(tasks = tasks)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[DescribeTasksRequest]
  }
}

