package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchResult extends js.Object {
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList
  /**
    * A list of  ChangeMessageVisibilityBatchResultEntry  items.
    */
  var Successful: ChangeMessageVisibilityBatchResultEntryList
}

object ChangeMessageVisibilityBatchResult {
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: ChangeMessageVisibilityBatchResultEntryList): ChangeMessageVisibilityBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed, Successful = Successful)
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResult]
  }
}

