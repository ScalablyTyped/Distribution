package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGroundstationMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEGREE_ANGLE
    - awsDashSdkLib.awsDashSdkLibStrings.RADIAN
    - java.lang.String
  */
  type AngleUnits = _AngleUnits | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GHz
    - awsDashSdkLib.awsDashSdkLibStrings.MHz
    - awsDashSdkLib.awsDashSdkLibStrings.kHz
    - java.lang.String
  */
  type BandwidthUnits = _BandwidthUnits | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConfigArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`antenna-downlink`
    - awsDashSdkLib.awsDashSdkLibStrings.`antenna-downlink-demod-decode`
    - awsDashSdkLib.awsDashSdkLibStrings.`antenna-uplink`
    - awsDashSdkLib.awsDashSdkLibStrings.`dataflow-endpoint`
    - awsDashSdkLib.awsDashSdkLibStrings.tracking
    - awsDashSdkLib.awsDashSdkLibStrings.`uplink-echo`
    - java.lang.String
  */
  type ConfigCapabilityType = _ConfigCapabilityType | java.lang.String
  type ConfigList = js.Array[ConfigListItem]
  type ContactList = js.Array[ContactData]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED_TO_SCHEDULE
    - awsDashSdkLib.awsDashSdkLibStrings.PASS
    - awsDashSdkLib.awsDashSdkLibStrings.POSTPASS
    - awsDashSdkLib.awsDashSdkLibStrings.PREPASS
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULING
    - java.lang.String
  */
  type ContactStatus = _ContactStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PREFERRED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.REQUIRED
    - java.lang.String
  */
  type Criticality = _Criticality | java.lang.String
  type DataflowEdge = js.Array[ConfigArn]
  type DataflowEdgeList = js.Array[DataflowEdge]
  type DataflowEndpointGroupArn = java.lang.String
  type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EirpUnits = awsDashSdkLib.awsDashSdkLibStrings.dBW | java.lang.String
  type EndpointDetailsList = js.Array[EndpointDetails]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.created
    - awsDashSdkLib.awsDashSdkLibStrings.creating
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GHz
    - awsDashSdkLib.awsDashSdkLibStrings.MHz
    - awsDashSdkLib.awsDashSdkLibStrings.kHz
    - java.lang.String
  */
  type FrequencyUnits = _FrequencyUnits | java.lang.String
  type GroundStationList = js.Array[GroundStationData]
  type Integer = scala.Double
  type JsonString = java.lang.String
  type MissionProfileArn = java.lang.String
  type MissionProfileList = js.Array[MissionProfileListItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LEFT_HAND
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.RIGHT_HAND
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
  type TagsMap = org.scalablytyped.runtime.StringDictionary[String]
  type Timestamp = stdLib.Date
  type Uuid = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2019-05-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type noradSatelliteID = scala.Double
  type satelliteArn = java.lang.String
}
