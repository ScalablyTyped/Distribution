package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectOutput extends js.Object {
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
    */
  var DeleteMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DeleteMarker] = js.native
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.native
  /**
    * Returns the version ID of the delete marker created as a result of the DELETE operation.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteObjectOutput {
  @scala.inline
  def apply(
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    RequestCharged: RequestCharged = null,
    VersionId: ObjectVersionId = null
  ): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectOutput]
  }
}

