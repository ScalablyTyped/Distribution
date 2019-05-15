package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDhcpOptionsResult extends js.Object {
  /**
    * Information about one or more DHCP options sets.
    */
  var DhcpOptions: js.UndefOr[DhcpOptionsList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeDhcpOptionsResult {
  @scala.inline
  def apply(DhcpOptions: DhcpOptionsList = null, NextToken: String = null): DescribeDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (DhcpOptions != null) __obj.updateDynamic("DhcpOptions")(DhcpOptions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDhcpOptionsResult]
  }
}

