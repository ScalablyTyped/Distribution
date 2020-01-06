package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  /**
    * The total number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesProcessed] = js.native
  /**
    * The total number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesReturned] = js.native
  /**
    * The total number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesScanned] = js.native
}

object Stats {
  @scala.inline
  def apply(
    BytesProcessed: Int | Double = null,
    BytesReturned: Int | Double = null,
    BytesScanned: Int | Double = null
  ): Stats = {
    val __obj = js.Dynamic.literal()
    if (BytesProcessed != null) __obj.updateDynamic("BytesProcessed")(BytesProcessed.asInstanceOf[js.Any])
    if (BytesReturned != null) __obj.updateDynamic("BytesReturned")(BytesReturned.asInstanceOf[js.Any])
    if (BytesScanned != null) __obj.updateDynamic("BytesScanned")(BytesScanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

