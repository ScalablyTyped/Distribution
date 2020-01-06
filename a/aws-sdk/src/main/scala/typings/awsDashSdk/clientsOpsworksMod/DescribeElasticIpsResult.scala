package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticIpsResult extends js.Object {
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.ElasticIps] = js.native
}

object DescribeElasticIpsResult {
  @scala.inline
  def apply(ElasticIps: ElasticIps = null): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticIps != null) __obj.updateDynamic("ElasticIps")(ElasticIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
}

