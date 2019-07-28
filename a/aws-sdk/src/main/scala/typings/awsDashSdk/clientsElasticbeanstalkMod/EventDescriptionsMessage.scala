package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDescriptionsMessage extends js.Object {
  /**
    *  A list of EventDescription. 
    */
  var Events: js.UndefOr[EventDescriptionList] = js.undefined
  /**
    *  If returned, this indicates that there are more results to obtain. Use this token in the next DescribeEvents call to get the next batch of events. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object EventDescriptionsMessage {
  @scala.inline
  def apply(Events: EventDescriptionList = null, NextToken: Token = null): EventDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[EventDescriptionsMessage]
  }
}

