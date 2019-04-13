package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeElasticIpsResult extends js.Object {
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[ElasticIps] = js.undefined
}

object DescribeElasticIpsResult {
  @scala.inline
  def apply(ElasticIps: ElasticIps = null): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticIps != null) __obj.updateDynamic("ElasticIps")(ElasticIps)
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
}

