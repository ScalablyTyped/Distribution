package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotAttributeResult extends js.Object {
  /**
    * The users and groups that have the permissions for creating volumes from the snapshot.
    */
  var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.native
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object DescribeSnapshotAttributeResult {
  @scala.inline
  def apply(
    CreateVolumePermissions: CreateVolumePermissionList = null,
    ProductCodes: ProductCodeList = null,
    SnapshotId: String = null
  ): DescribeSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (CreateVolumePermissions != null) __obj.updateDynamic("CreateVolumePermissions")(CreateVolumePermissions.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotAttributeResult]
  }
}

