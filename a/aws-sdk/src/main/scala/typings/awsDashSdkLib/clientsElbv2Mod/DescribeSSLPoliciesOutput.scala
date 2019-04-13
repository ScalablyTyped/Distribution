package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSSLPoliciesOutput extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Information about the policies.
    */
  var SslPolicies: js.UndefOr[SslPolicies] = js.undefined
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

