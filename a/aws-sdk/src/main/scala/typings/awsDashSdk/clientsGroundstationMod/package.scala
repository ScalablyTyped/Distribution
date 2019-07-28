package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.dBW
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGroundstationMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEGREE_ANGLE
    - typings.awsDashSdk.awsDashSdkStrings.RADIAN
    - java.lang.String
  */
  type AngleUnits = _AngleUnits | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GHz
    - typings.awsDashSdk.awsDashSdkStrings.MHz
    - typings.awsDashSdk.awsDashSdkStrings.kHz
    - java.lang.String
  */
  type BandwidthUnits = _BandwidthUnits | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConfigArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`antenna-downlink`
    - typings.awsDashSdk.awsDashSdkStrings.`antenna-downlink-demod-decode`
    - typings.awsDashSdk.awsDashSdkStrings.`antenna-uplink`
    - typings.awsDashSdk.awsDashSdkStrings.`dataflow-endpoint`
    - typings.awsDashSdk.awsDashSdkStrings.tracking
    - typings.awsDashSdk.awsDashSdkStrings.`uplink-echo`
    - java.lang.String
  */
  type ConfigCapabilityType = _ConfigCapabilityType | java.lang.String
  type ConfigList = js.Array[ConfigListItem]
  type ContactList = js.Array[ContactData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.AWS_CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_TO_SCHEDULE
    - typings.awsDashSdk.awsDashSdkStrings.PASS
    - typings.awsDashSdk.awsDashSdkStrings.POSTPASS
    - typings.awsDashSdk.awsDashSdkStrings.PREPASS
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULING
    - java.lang.String
  */
  type ContactStatus = _ContactStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PREFERRED
    - typings.awsDashSdk.awsDashSdkStrings.REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.REQUIRED
    - java.lang.String
  */
  type Criticality = _Criticality | java.lang.String
  type DataflowEdge = js.Array[ConfigArn]
  type DataflowEdgeList = js.Array[DataflowEdge]
  type DataflowEndpointGroupArn = java.lang.String
  type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EirpUnits = dBW | java.lang.String
  type EndpointDetailsList = js.Array[EndpointDetails]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.created
    - typings.awsDashSdk.awsDashSdkStrings.creating
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GHz
    - typings.awsDashSdk.awsDashSdkStrings.MHz
    - typings.awsDashSdk.awsDashSdkStrings.kHz
    - java.lang.String
  */
  type FrequencyUnits = _FrequencyUnits | java.lang.String
  type GroundStationList = js.Array[GroundStationData]
  type Integer = scala.Double
  type JsonString = java.lang.String
  type MissionProfileArn = java.lang.String
  type MissionProfileList = js.Array[MissionProfileListItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LEFT_HAND
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.RIGHT_HAND
    - java.lang.String
  */
  type Polarization = _Polarization | java.lang.String
  type RoleArn = java.lang.String
  type SafeName = java.lang.String
  type SatelliteList = js.Array[SatelliteListItem]
  type SecurityGroupIdList = js.Array[String]
  type StatusList = js.Array[ContactStatus]
  type String = java.lang.String
  type SubnetList = js.Array[String]
  type TagKeys = js.Array[String]
  type TagsMap = StringDictionary[String]
  type Timestamp = Date
  type Uuid = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-05-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type noradSatelliteID = scala.Double
  type satelliteArn = java.lang.String
}
