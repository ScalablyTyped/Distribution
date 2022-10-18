package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.dBW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEGREE_ANGLE
  - typings.awsSdk.awsSdkStrings.RADIAN
  - java.lang.String
*/
type AngleUnits = _AngleUnits | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GHz
  - typings.awsSdk.awsSdkStrings.MHz
  - typings.awsSdk.awsSdkStrings.kHz
  - java.lang.String
*/
type BandwidthUnits = _BandwidthUnits | java.lang.String

type Boolean = scala.Boolean

type BucketArn = java.lang.String

type ConfigArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`antenna-downlink`
  - typings.awsSdk.awsSdkStrings.`antenna-downlink-demod-decode`
  - typings.awsSdk.awsSdkStrings.`antenna-uplink`
  - typings.awsSdk.awsSdkStrings.`dataflow-endpoint`
  - typings.awsSdk.awsSdkStrings.tracking
  - typings.awsSdk.awsSdkStrings.`uplink-echo`
  - typings.awsSdk.awsSdkStrings.`s3-recording`
  - java.lang.String
*/
type ConfigCapabilityType = _ConfigCapabilityType | java.lang.String

type ConfigList = js.Array[ConfigListItem]

type ContactList = js.Array[ContactData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.AWS_CANCELLED
  - typings.awsSdk.awsSdkStrings.AWS_FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.FAILED_TO_SCHEDULE
  - typings.awsSdk.awsSdkStrings.PASS
  - typings.awsSdk.awsSdkStrings.POSTPASS
  - typings.awsSdk.awsSdkStrings.PREPASS
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.SCHEDULING
  - java.lang.String
*/
type ContactStatus = _ContactStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PREFERRED
  - typings.awsSdk.awsSdkStrings.REMOVED
  - typings.awsSdk.awsSdkStrings.REQUIRED
  - java.lang.String
*/
type Criticality = _Criticality | java.lang.String

type DataflowEdge = js.Array[ConfigArn]

type DataflowEdgeList = js.Array[DataflowEdge]

type DataflowEndpointGroupArn = java.lang.String

type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]

type DataflowEndpointMtuInteger = scala.Double

type DataflowList = js.Array[DataflowDetail]

type Double = scala.Double

type DurationInSeconds = scala.Double

type EirpUnits = dBW | java.lang.String

type EndpointDetailsList = js.Array[EndpointDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.created__
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.deleted__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type EndpointStatus = _EndpointStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GHz
  - typings.awsSdk.awsSdkStrings.MHz
  - typings.awsSdk.awsSdkStrings.kHz
  - java.lang.String
*/
type FrequencyUnits = _FrequencyUnits | java.lang.String

type GroundStationIdList = js.Array[String]

type GroundStationList = js.Array[GroundStationData]

type Integer = scala.Double

type JsonString = java.lang.String

type MissionProfileArn = java.lang.String

type MissionProfileList = js.Array[MissionProfileListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEFT_HAND
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.RIGHT_HAND
  - java.lang.String
*/
type Polarization = _Polarization | java.lang.String

type RoleArn = java.lang.String

type S3KeyPrefix = java.lang.String

type SafeName = java.lang.String

type SatelliteList = js.Array[SatelliteListItem]

type SecurityGroupIdList = js.Array[String]

type StatusList = js.Array[ContactStatus]

type String = java.lang.String

type SubnetList = js.Array[String]

type TagKeys = js.Array[String]

type TagsMap = StringDictionary[String]

type Timestamp = js.Date

type Uuid = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-05-23`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type noradSatelliteID = scala.Double

type satelliteArn = java.lang.String
