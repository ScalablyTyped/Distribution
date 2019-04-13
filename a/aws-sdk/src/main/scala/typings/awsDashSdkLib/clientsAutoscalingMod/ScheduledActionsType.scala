package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledActionsType extends js.Object {
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * The scheduled actions.
    */
  var ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined
}

object ScheduledActionsType {
  @scala.inline
  def apply(NextToken: XmlString = null, ScheduledUpdateGroupActions: ScheduledUpdateGroupActions = null): ScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScheduledUpdateGroupActions != null) __obj.updateDynamic("ScheduledUpdateGroupActions")(ScheduledUpdateGroupActions)
    __obj.asInstanceOf[ScheduledActionsType]
  }
}

