package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventTopicsResult extends js.Object {
  /**
    * A list of SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[EventTopics] = js.undefined
}

object DescribeEventTopicsResult {
  @scala.inline
  def apply(EventTopics: EventTopics = null): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    if (EventTopics != null) __obj.updateDynamic("EventTopics")(EventTopics)
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
}

