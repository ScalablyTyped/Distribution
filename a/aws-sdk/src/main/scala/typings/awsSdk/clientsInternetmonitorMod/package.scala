package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABILITY
  - typings.awsSdk.awsSdkStrings.PERFORMANCE
  - java.lang.String
*/
type HealthEventImpactType = _HealthEventImpactType | java.lang.String

type HealthEventList = js.Array[HealthEvent]

type HealthEventName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.RESOLVED
  - java.lang.String
*/
type HealthEventStatus = _HealthEventStatus | java.lang.String

type ImpactedLocationsList = js.Array[ImpactedLocation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogDeliveryStatus = _LogDeliveryStatus | java.lang.String

type Long = scala.Double

type MaxCityNetworksToMonitor = scala.Double

type MaxResults = scala.Double

type MonitorArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type MonitorConfigState = _MonitorConfigState | java.lang.String

type MonitorList = js.Array[Monitor]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.COLLECTING_DATA
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - typings.awsSdk.awsSdkStrings.FAULT_SERVICE
  - typings.awsSdk.awsSdkStrings.FAULT_ACCESS_CLOUDWATCH
  - java.lang.String
*/
type MonitorProcessingStatusCode = _MonitorProcessingStatusCode | java.lang.String

type NetworkList = js.Array[Network]

type ResourceName = java.lang.String

type S3ConfigBucketNameString = java.lang.String

type SetOfARNs = js.Array[Arn]

type String = java.lang.String

type SyntheticTimestampDateTime = js.Date

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TrafficPercentageToMonitor = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.Internet_
  - java.lang.String
*/
type TriangulationEventType = _TriangulationEventType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-06-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
