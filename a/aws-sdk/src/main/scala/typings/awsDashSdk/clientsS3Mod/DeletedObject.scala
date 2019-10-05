package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedObject extends js.Object {
  /**
    * 
    */
  var DeleteMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DeleteMarker] = js.undefined
  /**
    * 
    */
  var DeleteMarkerVersionId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DeleteMarkerVersionId] = js.undefined
  /**
    * 
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object DeletedObject {
  @scala.inline
  def apply(
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    DeleteMarkerVersionId: DeleteMarkerVersionId = null,
    Key: ObjectKey = null,
    VersionId: ObjectVersionId = null
  ): DeletedObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker)
    if (DeleteMarkerVersionId != null) __obj.updateDynamic("DeleteMarkerVersionId")(DeleteMarkerVersionId)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeletedObject]
  }
}

