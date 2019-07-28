package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateActionsMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Returns a list of update actions
    */
  var UpdateActions: js.UndefOr[UpdateActionList] = js.undefined
}

object UpdateActionsMessage {
  @scala.inline
  def apply(Marker: String = null, UpdateActions: UpdateActionList = null): UpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (UpdateActions != null) __obj.updateDynamic("UpdateActions")(UpdateActions)
    __obj.asInstanceOf[UpdateActionsMessage]
  }
}

