package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPartResult extends js.Object {
  /**
    * Entity tag of the object.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * Date and time at which the object was uploaded.
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LastModified] = js.undefined
}

object CopyPartResult {
  @scala.inline
  def apply(ETag: ETag = null, LastModified: LastModified = null): CopyPartResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    __obj.asInstanceOf[CopyPartResult]
  }
}

