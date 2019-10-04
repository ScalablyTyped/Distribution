package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationSmbResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  /**
    * The time that the SMB location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The name of the Windows domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  /**
    * The Amazon resource Name (ARN) of the SMB location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.undefined
  /**
    * The URL of the source SBM location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationUri] = js.undefined
  /**
    * The mount options that are available for DataSync to use to access an SMB location.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.undefined
  /**
    * The user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var User: js.UndefOr[SmbUser] = js.undefined
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
    if (AgentArns != null) __obj.updateDynamic("AgentArns")(AgentArns)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (MountOptions != null) __obj.updateDynamic("MountOptions")(MountOptions)
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[DescribeLocationSmbResponse]
  }
}

