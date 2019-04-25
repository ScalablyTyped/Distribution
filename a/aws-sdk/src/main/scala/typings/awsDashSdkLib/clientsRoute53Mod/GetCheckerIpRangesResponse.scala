package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCheckerIpRangesResponse extends js.Object {
  /**
    * A complex type that contains sorted list of IP ranges in CIDR format for Amazon Route 53 health checkers.
    */
  var CheckerIpRanges: awsDashSdkLib.clientsRoute53Mod.CheckerIpRanges
}

object GetCheckerIpRangesResponse {
  @scala.inline
  def apply(CheckerIpRanges: CheckerIpRanges): GetCheckerIpRangesResponse = {
    val __obj = js.Dynamic.literal(CheckerIpRanges = CheckerIpRanges)
  
    __obj.asInstanceOf[GetCheckerIpRangesResponse]
  }
}

