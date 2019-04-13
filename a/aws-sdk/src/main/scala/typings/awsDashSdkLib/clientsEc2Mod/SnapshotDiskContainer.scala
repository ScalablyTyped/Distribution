package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotDiskContainer extends js.Object {
  /**
    * The description of the disk image being imported.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK 
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..).
    */
  var Url: js.UndefOr[String] = js.undefined
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucket] = js.undefined
}

object SnapshotDiskContainer {
  @scala.inline
  def apply(
    Description: String = null,
    Format: String = null,
    Url: String = null,
    UserBucket: UserBucket = null
  ): SnapshotDiskContainer = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket)
    __obj.asInstanceOf[SnapshotDiskContainer]
  }
}

