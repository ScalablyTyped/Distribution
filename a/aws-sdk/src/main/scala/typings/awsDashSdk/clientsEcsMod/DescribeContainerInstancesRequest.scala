package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContainerInstancesRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the container instance or container instances you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * A list of up to 100 container instance IDs or full Amazon Resource Name (ARN) entries.
    */
  var containerInstances: StringList
  /**
    * Specifies whether you want to see the resource tags for the container instance. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[ContainerInstanceFieldList] = js.undefined
}

object DescribeContainerInstancesRequest {
  @scala.inline
  def apply(containerInstances: StringList, cluster: String = null, include: ContainerInstanceFieldList = null): DescribeContainerInstancesRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[DescribeContainerInstancesRequest]
  }
}

