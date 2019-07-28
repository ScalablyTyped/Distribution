package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityFilter extends js.Object {
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.undefined
  /**
    * A list of IDs for affected entities.
    */
  var entityValues: js.UndefOr[entityValueList] = js.undefined
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList
  /**
    * A list of the most recent dates and times that the entity was updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined
  /**
    * A list of entity status codes (IMPAIRED, UNIMPAIRED, or UNKNOWN).
    */
  var statusCodes: js.UndefOr[entityStatusCodeList] = js.undefined
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagFilter] = js.undefined
}

object EntityFilter {
  @scala.inline
  def apply(
    eventArns: eventArnList,
    entityArns: entityArnList = null,
    entityValues: entityValueList = null,
    lastUpdatedTimes: dateTimeRangeList = null,
    statusCodes: entityStatusCodeList = null,
    tags: tagFilter = null
  ): EntityFilter = {
    val __obj = js.Dynamic.literal(eventArns = eventArns)
    if (entityArns != null) __obj.updateDynamic("entityArns")(entityArns)
    if (entityValues != null) __obj.updateDynamic("entityValues")(entityValues)
    if (lastUpdatedTimes != null) __obj.updateDynamic("lastUpdatedTimes")(lastUpdatedTimes)
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[EntityFilter]
  }
}

