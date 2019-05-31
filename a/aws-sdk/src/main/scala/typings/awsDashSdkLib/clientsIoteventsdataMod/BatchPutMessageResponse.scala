package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutMessageResponse extends js.Object {
  /**
    * A list of any errors encountered when sending the messages.
    */
  var BatchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
}

object BatchPutMessageResponse {
  @scala.inline
  def apply(BatchPutMessageErrorEntries: BatchPutMessageErrorEntries = null): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (BatchPutMessageErrorEntries != null) __obj.updateDynamic("BatchPutMessageErrorEntries")(BatchPutMessageErrorEntries)
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
}

