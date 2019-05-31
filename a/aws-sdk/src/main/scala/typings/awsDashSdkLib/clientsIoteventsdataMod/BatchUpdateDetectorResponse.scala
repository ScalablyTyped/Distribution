package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateDetectorResponse extends js.Object {
  /**
    * A list of those detector updates which resulted in errors. (The specific update did not occur if an error is listed here.)
    */
  var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.undefined
}

object BatchUpdateDetectorResponse {
  @scala.inline
  def apply(batchUpdateDetectorErrorEntries: BatchUpdateDetectorErrorEntries = null): BatchUpdateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (batchUpdateDetectorErrorEntries != null) __obj.updateDynamic("batchUpdateDetectorErrorEntries")(batchUpdateDetectorErrorEntries)
    __obj.asInstanceOf[BatchUpdateDetectorResponse]
  }
}

