package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsHealthMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[OrganizationAffectedEntitiesErrorItem]
  type DescribeEventDetailsFailedSet = js.Array[EventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationFailedSet = js.Array[OrganizationEventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[OrganizationEventDetails]
  type DescribeEventDetailsSuccessfulSet = js.Array[EventDetails]
  type EntityAggregateList = js.Array[EntityAggregate]
  type EntityList = js.Array[AffectedEntity]
  type EventAggregateList = js.Array[EventAggregate]
  type EventArnsList = js.Array[eventArn]
  type EventList = js.Array[Event]
  type EventTypeCategoryList = js.Array[eventTypeCategory]
  type EventTypeCodeList = js.Array[eventTypeCode]
  type EventTypeList = js.Array[EventType]
  type OrganizationEntityFiltersList = js.Array[EventAccountFilter]
  type OrganizationEventDetailFiltersList = js.Array[EventAccountFilter]
  type OrganizationEventList = js.Array[OrganizationEvent]
  type accountId = String
  type affectedAccountsList = js.Array[accountId]
  type aggregateValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-08-04`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type availabilityZone = String
  type availabilityZones = js.Array[availabilityZone]
  type awsAccountIdsList = js.Array[accountId]
  type count = Double
  type dateTimeRangeList = js.Array[DateTimeRange]
  type entityArn = String
  type entityArnList = js.Array[entityArn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.UNIMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type entityStatusCode = _entityStatusCode | String
  type entityStatusCodeList = js.Array[entityStatusCode]
  type entityUrl = String
  type entityValue = String
  type entityValueList = js.Array[entityValue]
  type eventAggregateField = typings.awsDashSdk.awsDashSdkStrings.eventTypeCategory | String
  type eventArn = String
  type eventArnList = js.Array[eventArn]
  type eventDescription = String
  type eventMetadata = StringDictionary[metadataValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.closed_
    - typings.awsDashSdk.awsDashSdkStrings.upcoming
    - java.lang.String
  */
  type eventStatusCode = _eventStatusCode | String
  type eventStatusCodeList = js.Array[eventStatusCode]
  type eventType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.issue
    - typings.awsDashSdk.awsDashSdkStrings.accountNotification
    - typings.awsDashSdk.awsDashSdkStrings.scheduledChange
    - typings.awsDashSdk.awsDashSdkStrings.investigation
    - java.lang.String
  */
  type eventTypeCategory = _eventTypeCategory | String
  type eventTypeCategoryList = js.Array[eventTypeCategory]
  type eventTypeCode = String
  type eventTypeList = js.Array[eventType]
  type healthServiceAccessStatusForOrganization = String
  type locale = String
  type maxResults = Double
  type metadataKey = String
  type metadataValue = String
  type nextToken = String
  type region = String
  type regionList = js.Array[region]
  type service = String
  type serviceList = js.Array[service]
  type tagFilter = js.Array[tagSet]
  type tagKey = String
  type tagSet = StringDictionary[tagValue]
  type tagValue = String
  type timestamp = Date
}
