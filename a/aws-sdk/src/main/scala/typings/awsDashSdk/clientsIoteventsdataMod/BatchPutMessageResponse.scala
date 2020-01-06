package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageResponse extends js.Object {
  /**
    * A list of any errors encountered when sending the messages.
    */
  var BatchPutMessageErrorEntries: js.UndefOr[typings.awsDashSdk.clientsIoteventsdataMod.BatchPutMessageErrorEntries] = js.native
}

object BatchPutMessageResponse {
  @scala.inline
  def apply(BatchPutMessageErrorEntries: BatchPutMessageErrorEntries = null): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (BatchPutMessageErrorEntries != null) __obj.updateDynamic("BatchPutMessageErrorEntries")(BatchPutMessageErrorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
}

