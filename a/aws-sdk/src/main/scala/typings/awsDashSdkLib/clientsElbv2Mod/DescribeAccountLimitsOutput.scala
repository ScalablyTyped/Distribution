package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[Limits] = js.undefined
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeAccountLimitsOutput {
  @scala.inline
  def apply(Limits: Limits = null, NextMarker: Marker = null): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
}

