package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * The current number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesProcessed] = js.undefined
  /**
    * The current number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesReturned] = js.undefined
  /**
    * The current number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BytesScanned] = js.undefined
}

object Progress {
  @scala.inline
  def apply(
    BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
    BytesReturned: js.UndefOr[BytesReturned] = js.undefined,
    BytesScanned: js.UndefOr[BytesScanned] = js.undefined
  ): Progress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesProcessed)) __obj.updateDynamic("BytesProcessed")(BytesProcessed)
    if (!js.isUndefined(BytesReturned)) __obj.updateDynamic("BytesReturned")(BytesReturned)
    if (!js.isUndefined(BytesScanned)) __obj.updateDynamic("BytesScanned")(BytesScanned)
    __obj.asInstanceOf[Progress]
  }
}

