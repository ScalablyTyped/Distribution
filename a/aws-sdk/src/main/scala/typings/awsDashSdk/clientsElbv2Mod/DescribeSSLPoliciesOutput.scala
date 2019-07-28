package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSSLPoliciesOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Information about the policies.
    */
  var SslPolicies: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SslPolicies] = js.undefined
}

object DescribeSSLPoliciesOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, SslPolicies: SslPolicies = null): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (SslPolicies != null) __obj.updateDynamic("SslPolicies")(SslPolicies)
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
}

