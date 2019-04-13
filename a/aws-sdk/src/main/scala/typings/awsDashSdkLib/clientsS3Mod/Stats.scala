package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * The total number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined
  /**
    * The total number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[BytesReturned] = js.undefined
  /**
    * The total number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[BytesScanned] = js.undefined
}

object Stats {
  @scala.inline
  def apply(
    BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
    BytesReturned: js.UndefOr[BytesReturned] = js.undefined,
    BytesScanned: js.UndefOr[BytesScanned] = js.undefined
  ): Stats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesProcessed)) __obj.updateDynamic("BytesProcessed")(BytesProcessed)
    if (!js.isUndefined(BytesReturned)) __obj.updateDynamic("BytesReturned")(BytesReturned)
    if (!js.isUndefined(BytesScanned)) __obj.updateDynamic("BytesScanned")(BytesScanned)
    __obj.asInstanceOf[Stats]
  }
}

