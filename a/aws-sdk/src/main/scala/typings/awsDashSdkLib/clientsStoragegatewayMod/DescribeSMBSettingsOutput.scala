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
  /**
    * The type of security strategy that was specified for file gateway. ClientSpecified: SMBv1 is enabled, SMB signing is offered but not required, SMB encryption is offered but not required. MandatorySigning: SMBv1 is disabled, SMB signing is required, SMB encryption is offered but not required. MandatoryEncryption: SMBv1 is disabled, SMB signing is offered but not required, SMB encryption is required.
    */
  var SMBSecurityStrategy: js.UndefOr[SMBSecurityStrategy] = js.undefined
}

object DescribeSMBSettingsOutput {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    GatewayARN: GatewayARN = null,
    SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined,
    SMBSecurityStrategy: SMBSecurityStrategy = null
  ): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(SMBGuestPasswordSet)) __obj.updateDynamic("SMBGuestPasswordSet")(SMBGuestPasswordSet)
    if (SMBSecurityStrategy != null) __obj.updateDynamic("SMBSecurityStrategy")(SMBSecurityStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
}

