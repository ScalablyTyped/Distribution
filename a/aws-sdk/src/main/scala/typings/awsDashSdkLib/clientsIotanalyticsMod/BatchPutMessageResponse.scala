package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutMessageResponse extends js.Object {
  /**
    * A list of any errors encountered when sending the messages to the channel.
    */
  var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
}

object BatchPutMessageResponse {
  @scala.inline
  def apply(batchPutMessageErrorEntries: BatchPutMessageErrorEntries = null): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (batchPutMessageErrorEntries != null) __obj.updateDynamic("batchPutMessageErrorEntries")(batchPutMessageErrorEntries)
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
}

