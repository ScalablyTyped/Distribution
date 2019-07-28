package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffectedEntity extends js.Object {
  /**
    * The 12-digit AWS account number that contains the affected entity.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  /**
    * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
    */
  var entityArn: js.UndefOr[typings.awsDashSdk.clientsHealthMod.entityArn] = js.undefined
  var entityUrl: js.UndefOr[typings.awsDashSdk.clientsHealthMod.entityUrl] = js.undefined
  /**
    * The ID of the affected entity.
    */
  var entityValue: js.UndefOr[typings.awsDashSdk.clientsHealthMod.entityValue] = js.undefined
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsDashSdk.clientsHealthMod.eventArn] = js.undefined
  /**
    * The most recent time that the entity was updated.
    */
  var lastUpdatedTime: js.UndefOr[timestamp] = js.undefined
  /**
    * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
    */
  var statusCode: js.UndefOr[entityStatusCode] = js.undefined
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagSet] = js.undefined
}

object AffectedEntity {
  @scala.inline
  def apply(
    awsAccountId: accountId = null,
    entityArn: entityArn = null,
    entityUrl: entityUrl = null,
    entityValue: entityValue = null,
    eventArn: eventArn = null,
    lastUpdatedTime: timestamp = null,
    statusCode: entityStatusCode = null,
    tags: tagSet = null
  ): AffectedEntity = {
    val __obj = js.Dynamic.literal()
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId)
    if (entityArn != null) __obj.updateDynamic("entityArn")(entityArn)
    if (entityUrl != null) __obj.updateDynamic("entityUrl")(entityUrl)
    if (entityValue != null) __obj.updateDynamic("entityValue")(entityValue)
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn)
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[AffectedEntity]
  }
}

