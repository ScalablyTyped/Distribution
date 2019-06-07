package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServicesRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the service or services you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether you want to see the resource tags for the service. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[ServiceFieldList] = js.undefined
  /**
    * A list of services to describe. You may specify up to 10 services to describe in a single operation.
    */
  var services: StringList
}

object DescribeServicesRequest {
  @scala.inline
  def apply(services: StringList, cluster: String = null, include: ServiceFieldList = null): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal(services = services)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[DescribeServicesRequest]
  }
}

