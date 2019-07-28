package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSnapshotAttributeResult extends js.Object {
  /**
    * The users and groups that have the permissions for creating volumes from the snapshot.
    */
  var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.undefined
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}

object DescribeSnapshotAttributeResult {
  @scala.inline
  def apply(
    CreateVolumePermissions: CreateVolumePermissionList = null,
    ProductCodes: ProductCodeList = null,
    SnapshotId: String = null
  ): DescribeSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (CreateVolumePermissions != null) __obj.updateDynamic("CreateVolumePermissions")(CreateVolumePermissions)
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    __obj.asInstanceOf[DescribeSnapshotAttributeResult]
  }
}

