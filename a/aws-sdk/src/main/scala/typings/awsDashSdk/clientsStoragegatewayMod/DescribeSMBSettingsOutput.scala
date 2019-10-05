package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSMBSettingsOutput extends js.Object {
  /**
    * The name of the domain that the gateway is joined to.
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DomainName] = js.undefined
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
    */
  var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of security strategy that was specified for file gateway. ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment.  MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer.  MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer. 
    */
  var SMBSecurityStrategy: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.SMBSecurityStrategy] = js.undefined
}

object DescribeSMBSettingsOutput {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    GatewayARN: GatewayARN = null,
    SMBGuestPasswordSet: js.UndefOr[scala.Boolean] = js.undefined,
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

