package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEventFilter extends js.Object {
  /**
    * A list of 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountIds: js.UndefOr[awsAccountIdsList] = js.native
  var endTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * REPLACEME
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  /**
    * REPLACEME
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  var lastUpdatedTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * A list of AWS Regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  var startTime: js.UndefOr[DateTimeRange] = js.native
}

object OrganizationEventFilter {
  @scala.inline
  def apply(
    awsAccountIds: awsAccountIdsList = null,
    endTime: DateTimeRange = null,
    entityArns: entityArnList = null,
    entityValues: entityValueList = null,
    eventStatusCodes: eventStatusCodeList = null,
    eventTypeCategories: eventTypeCategoryList = null,
    eventTypeCodes: eventTypeList = null,
    lastUpdatedTime: DateTimeRange = null,
    regions: regionList = null,
    services: serviceList = null,
    startTime: DateTimeRange = null
  ): OrganizationEventFilter = {
    val __obj = js.Dynamic.literal()
    if (awsAccountIds != null) __obj.updateDynamic("awsAccountIds")(awsAccountIds.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (entityArns != null) __obj.updateDynamic("entityArns")(entityArns.asInstanceOf[js.Any])
    if (entityValues != null) __obj.updateDynamic("entityValues")(entityValues.asInstanceOf[js.Any])
    if (eventStatusCodes != null) __obj.updateDynamic("eventStatusCodes")(eventStatusCodes.asInstanceOf[js.Any])
    if (eventTypeCategories != null) __obj.updateDynamic("eventTypeCategories")(eventTypeCategories.asInstanceOf[js.Any])
    if (eventTypeCodes != null) __obj.updateDynamic("eventTypeCodes")(eventTypeCodes.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationEventFilter]
  }
}

