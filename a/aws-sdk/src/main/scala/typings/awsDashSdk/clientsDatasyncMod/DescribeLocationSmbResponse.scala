package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationSmbResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  /**
    * The time that the SMB location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The name of the Windows domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon resource Name (ARN) of the SMB location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.native
  /**
    * The URL of the source SBM location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationUri] = js.native
  /**
    * The mount options that are available for DataSync to use to access an SMB location.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.native
  /**
    * The user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var User: js.UndefOr[SmbUser] = js.native
}

object DescribeLocationSmbResponse {
  @scala.inline
  def apply(
    AgentArns: AgentArnList = null,
    CreationTime: Time = null,
    Domain: SmbDomain = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    MountOptions: SmbMountOptions = null,
    User: SmbUser = null
  ): DescribeLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    if (AgentArns != null) __obj.updateDynamic("AgentArns")(AgentArns.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (MountOptions != null) __obj.updateDynamic("MountOptions")(MountOptions.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationSmbResponse]
  }
}

