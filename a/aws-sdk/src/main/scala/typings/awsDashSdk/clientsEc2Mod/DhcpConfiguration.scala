package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhcpConfiguration extends js.Object {
  /**
    * The name of a DHCP option.
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * One or more values for the DHCP option.
    */
  var Values: js.UndefOr[DhcpConfigurationValueList] = js.undefined
}

object DhcpConfiguration {
  @scala.inline
  def apply(Key: String = null, Values: DhcpConfigurationValueList = null): DhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[DhcpConfiguration]
  }
}

