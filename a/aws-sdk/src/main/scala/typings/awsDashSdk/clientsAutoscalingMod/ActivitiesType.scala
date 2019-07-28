package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesType extends js.Object {
  /**
    * The scaling activities. Activities are sorted by start time. Activities still in progress are described first.
    */
  var Activities: typings.awsDashSdk.clientsAutoscalingMod.Activities
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object ActivitiesType {
  @scala.inline
  def apply(Activities: Activities, NextToken: XmlString = null): ActivitiesType = {
    val __obj = js.Dynamic.literal(Activities = Activities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ActivitiesType]
  }
}

