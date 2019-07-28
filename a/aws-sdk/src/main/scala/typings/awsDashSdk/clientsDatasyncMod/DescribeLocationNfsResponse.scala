package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationNfsResponse extends js.Object {
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The Amazon resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.undefined
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationUri] = js.undefined
  /**
    * The NFS mount options that DataSync used to mount your NFS share.
    */
  var MountOptions: js.UndefOr[NfsMountOptions] = js.undefined
  var OnPremConfig: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.OnPremConfig] = js.undefined
}

object DescribeLocationNfsResponse {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    MountOptions: NfsMountOptions = null,
    OnPremConfig: OnPremConfig = null
  ): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (MountOptions != null) __obj.updateDynamic("MountOptions")(MountOptions)
    if (OnPremConfig != null) __obj.updateDynamic("OnPremConfig")(OnPremConfig)
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
}

