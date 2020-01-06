package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifier extends js.Object {
  /**
    * Key name of the object to delete.
    */
  var Key: ObjectKey = js.native
  /**
    * VersionId for the specific version of the object to delete.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object ObjectIdentifier {
  @scala.inline
  def apply(Key: ObjectKey, VersionId: ObjectVersionId = null): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
}

