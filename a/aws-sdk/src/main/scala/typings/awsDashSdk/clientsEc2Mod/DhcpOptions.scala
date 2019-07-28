package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhcpOptions extends js.Object {
  /**
    * One or more DHCP options in the set.
    */
  var DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.undefined
  /**
    * The ID of the set of DHCP options.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object DhcpOptions {
  @scala.inline
  def apply(
    DhcpConfigurations: DhcpConfigurationList = null,
    DhcpOptionsId: String = null,
    OwnerId: String = null,
    Tags: TagList = null
  ): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    if (DhcpConfigurations != null) __obj.updateDynamic("DhcpConfigurations")(DhcpConfigurations)
    if (DhcpOptionsId != null) __obj.updateDynamic("DhcpOptionsId")(DhcpOptionsId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DhcpOptions]
  }
}

