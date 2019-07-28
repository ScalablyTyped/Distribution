package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMountTargetsRequest extends js.Object {
  /**
    * (Optional) ID of the file system whose mount targets you want to list (String). It must be included in your request if MountTargetId is not included.
    */
  var FileSystemId: js.UndefOr[typings.awsDashSdk.clientsEfsMod.FileSystemId] = js.undefined
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeMountTargets operation (String). If present, it specifies to continue the list from where the previous returning call left off.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEfsMod.Marker] = js.undefined
  /**
    * (Optional) Maximum number of mount targets to return in the response. Currently, this number is automatically set to 10, and other values are ignored. The response is paginated at 10 per page if you have more than 10 mount targets.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsEfsMod.MaxItems] = js.undefined
  /**
    * (Optional) ID of the mount target that you want to have described (String). It must be included in your request if FileSystemId is not included.
    */
  var MountTargetId: js.UndefOr[typings.awsDashSdk.clientsEfsMod.MountTargetId] = js.undefined
}

object DescribeMountTargetsRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId = null,
    Marker: Marker = null,
    MaxItems: js.UndefOr[MaxItems] = js.undefined,
    MountTargetId: MountTargetId = null
  ): DescribeMountTargetsRequest = {
    val __obj = js.Dynamic.literal()
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (MountTargetId != null) __obj.updateDynamic("MountTargetId")(MountTargetId)
    __obj.asInstanceOf[DescribeMountTargetsRequest]
  }
}

