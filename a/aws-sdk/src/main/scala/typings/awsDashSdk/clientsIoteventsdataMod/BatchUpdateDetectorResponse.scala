package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateDetectorResponse extends js.Object {
  /**
    * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did not occur.)
    */
  var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.native
}

object BatchUpdateDetectorResponse {
  @scala.inline
  def apply(batchUpdateDetectorErrorEntries: BatchUpdateDetectorErrorEntries = null): BatchUpdateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (batchUpdateDetectorErrorEntries != null) __obj.updateDynamic("batchUpdateDetectorErrorEntries")(batchUpdateDetectorErrorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDetectorResponse]
  }
}

