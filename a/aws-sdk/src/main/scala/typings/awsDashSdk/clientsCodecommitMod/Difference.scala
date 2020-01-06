package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Difference extends js.Object {
  /**
    * Information about an afterBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * Information about a beforeBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.native
  /**
    * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
    */
  var changeType: js.UndefOr[ChangeTypeEnum] = js.native
}

object Difference {
  @scala.inline
  def apply(afterBlob: BlobMetadata = null, beforeBlob: BlobMetadata = null, changeType: ChangeTypeEnum = null): Difference = {
    val __obj = js.Dynamic.literal()
    if (afterBlob != null) __obj.updateDynamic("afterBlob")(afterBlob.asInstanceOf[js.Any])
    if (beforeBlob != null) __obj.updateDynamic("beforeBlob")(beforeBlob.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
}

