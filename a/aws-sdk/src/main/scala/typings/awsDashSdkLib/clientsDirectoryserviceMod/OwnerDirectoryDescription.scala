package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerDirectoryDescription extends js.Object {
  /**
    * Identifier of the directory owner account.
    */
  var AccountId: js.UndefOr[CustomerId] = js.undefined
  /**
    * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * IP address of the directory’s domain controllers.
    */
  var DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined
  /**
    * Information about the status of the RADIUS server.
    */
  var RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined
  /**
    * Information about the VPC settings for the directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
}

object OwnerDirectoryDescription {
  @scala.inline
  def apply(
    AccountId: CustomerId = null,
    DirectoryId: DirectoryId = null,
    DnsIpAddrs: DnsIpAddrs = null,
    RadiusSettings: RadiusSettings = null,
    RadiusStatus: RadiusStatus = null,
    VpcSettings: DirectoryVpcSettingsDescription = null
  ): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (DnsIpAddrs != null) __obj.updateDynamic("DnsIpAddrs")(DnsIpAddrs)
    if (RadiusSettings != null) __obj.updateDynamic("RadiusSettings")(RadiusSettings)
    if (RadiusStatus != null) __obj.updateDynamic("RadiusStatus")(RadiusStatus.asInstanceOf[js.Any])
    if (VpcSettings != null) __obj.updateDynamic("VpcSettings")(VpcSettings)
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
}

