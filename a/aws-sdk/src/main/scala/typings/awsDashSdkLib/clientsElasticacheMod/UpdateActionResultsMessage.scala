package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateActionResultsMessage extends js.Object {
  /**
    * Update actions that have been processed successfully
    */
  var ProcessedUpdateActions: js.UndefOr[ProcessedUpdateActionList] = js.undefined
  /**
    * Update actions that haven't been processed successfully
    */
  var UnprocessedUpdateActions: js.UndefOr[UnprocessedUpdateActionList] = js.undefined
}

object UpdateActionResultsMessage {
  @scala.inline
  def apply(
    ProcessedUpdateActions: ProcessedUpdateActionList = null,
    UnprocessedUpdateActions: UnprocessedUpdateActionList = null
  ): UpdateActionResultsMessage = {
    val __obj = js.Dynamic.literal()
    if (ProcessedUpdateActions != null) __obj.updateDynamic("ProcessedUpdateActions")(ProcessedUpdateActions)
    if (UnprocessedUpdateActions != null) __obj.updateDynamic("UnprocessedUpdateActions")(UnprocessedUpdateActions)
    __obj.asInstanceOf[UpdateActionResultsMessage]
  }
}

