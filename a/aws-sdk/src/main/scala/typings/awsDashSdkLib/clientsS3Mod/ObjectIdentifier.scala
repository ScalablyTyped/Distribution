package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectIdentifier extends js.Object {
  /**
    * Key name of the object to delete.
    */
  var Key: ObjectKey
  /**
    * VersionId for the specific version of the object to delete.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object ObjectIdentifier {
  @scala.inline
  def apply(Key: ObjectKey, VersionId: ObjectVersionId = null): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[ObjectIdentifier]
  }
}

