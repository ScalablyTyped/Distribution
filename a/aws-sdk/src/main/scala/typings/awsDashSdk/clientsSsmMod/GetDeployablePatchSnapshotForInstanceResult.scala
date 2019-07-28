package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the instance for the specified patch snapshot.
    */
  var Product: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Product] = js.undefined
  /**
    * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
    */
  var SnapshotDownloadUrl: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SnapshotDownloadUrl] = js.undefined
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SnapshotId] = js.undefined
}

object GetDeployablePatchSnapshotForInstanceResult {
  @scala.inline
  def apply(
    InstanceId: InstanceId = null,
    Product: Product = null,
    SnapshotDownloadUrl: SnapshotDownloadUrl = null,
    SnapshotId: SnapshotId = null
  ): GetDeployablePatchSnapshotForInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Product != null) __obj.updateDynamic("Product")(Product)
    if (SnapshotDownloadUrl != null) __obj.updateDynamic("SnapshotDownloadUrl")(SnapshotDownloadUrl)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
  }
}

