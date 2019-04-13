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
}

object DescribeDhcpOptionsResult {
  @scala.inline
  def apply(DhcpOptions: DhcpOptionsList = null): DescribeDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (DhcpOptions != null) __obj.updateDynamic("DhcpOptions")(DhcpOptions)
    __obj.asInstanceOf[DescribeDhcpOptionsResult]
  }
}

