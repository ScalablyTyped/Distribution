package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticLoadBalancersResult extends js.Object {
  /**
    * A list of ElasticLoadBalancer objects that describe the specified Elastic Load Balancing instances.
    */
  var ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers] = js.undefined
}

object DescribeElasticLoadBalancersResult {
  @scala.inline
  def apply(ElasticLoadBalancers: ElasticLoadBalancers = null): DescribeElasticLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticLoadBalancers != null) __obj.updateDynamic("ElasticLoadBalancers")(ElasticLoadBalancers)
    __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
  }
}

