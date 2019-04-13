package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSMBSettingsOutput extends js.Object {
  /**
    * The name of the domain that the gateway is joined to.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
    */
  var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined
}

object DescribeSMBSettingsOutput {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    GatewayARN: GatewayARN = null,
    SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined
  ): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(SMBGuestPasswordSet)) __obj.updateDynamic("SMBGuestPasswordSet")(SMBGuestPasswordSet)
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
}

