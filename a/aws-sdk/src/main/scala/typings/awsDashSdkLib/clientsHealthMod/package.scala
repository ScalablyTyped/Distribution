package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsHealthMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeEventDetailsFailedSet = js.Array[EventDetailsErrorItem]
  type DescribeEventDetailsSuccessfulSet = js.Array[EventDetails]
  type EntityAggregateList = js.Array[EntityAggregate]
  type EntityList = js.Array[AffectedEntity]
  type EventAggregateList = js.Array[EventAggregate]
  type EventArnsList = js.Array[eventArn]
  type EventList = js.Array[Event]
  type EventTypeCategoryList = js.Array[eventTypeCategory]
  type EventTypeCodeList = js.Array[eventTypeCode]
  type EventTypeList = js.Array[EventType]
  type accountId = java.lang.String
  type aggregateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-08-04`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type availabilityZone = java.lang.String
  type availabilityZones = js.Array[availabilityZone]
  type count = scala.Double
  type dateTimeRangeList = js.Array[DateTimeRange]
  type entityArn = java.lang.String
  type entityArnList = js.Array[entityArn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNIMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type entityStatusCode = _entityStatusCode | java.lang.String
  type entityStatusCodeList = js.Array[entityStatusCode]
  type entityUrl = java.lang.String
  type entityValue = java.lang.String
  type entityValueList = js.Array[entityValue]
  type eventAggregateField = awsDashSdkLib.awsDashSdkLibStrings.eventTypeCategory | java.lang.String
  type eventArn = java.lang.String
  type eventArnList = js.Array[eventArn]
  type eventDescription = java.lang.String
  type eventMetadata = org.scalablytyped.runtime.StringDictionary[metadataValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - awsDashSdkLib.awsDashSdkLibStrings.upcoming
    - java.lang.String
  */
  type eventStatusCode = _eventStatusCode | java.lang.String
  type eventStatusCodeList = js.Array[eventStatusCode]
  type eventType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.issue
    - awsDashSdkLib.awsDashSdkLibStrings.accountNotification
    - awsDashSdkLib.awsDashSdkLibStrings.scheduledChange
    - java.lang.String
  */
  type eventTypeCategory = _eventTypeCategory | java.lang.String
  type eventTypeCategoryList = js.Array[eventTypeCategory]
  type eventTypeCode = java.lang.String
  type eventTypeList = js.Array[eventType]
  type locale = java.lang.String
  type maxResults = scala.Double
  type metadataKey = java.lang.String
  type metadataValue = java.lang.String
  type nextToken = java.lang.String
  type region = java.lang.String
  type regionList = js.Array[region]
  type service = java.lang.String
  type serviceList = js.Array[service]
  type tagFilter = js.Array[tagSet]
  type tagKey = java.lang.String
  type tagSet = org.scalablytyped.runtime.StringDictionary[tagValue]
  type tagValue = java.lang.String
  type timestamp = stdLib.Date
}
