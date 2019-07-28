package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyObjectResult extends js.Object {
  /**
    * 
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * 
    */
  var LastModified: js.UndefOr[typings.awsDashSdk.clientsS3Mod.LastModified] = js.undefined
}

object CopyObjectResult {
  @scala.inline
  def apply(ETag: ETag = null, LastModified: LastModified = null): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    __obj.asInstanceOf[CopyObjectResult]
  }
}

