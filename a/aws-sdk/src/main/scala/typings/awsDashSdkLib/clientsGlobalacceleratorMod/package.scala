package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlobalacceleratorMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - java.lang.String
  */
  type AcceleratorStatus = _AcceleratorStatus | java.lang.String
  type Accelerators = js.Array[Accelerator]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_IP
    - java.lang.String
  */
  type ClientAffinity = _ClientAffinity | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EndpointConfigurations = js.Array[EndpointConfiguration]
  type EndpointDescriptions = js.Array[EndpointDescription]
  type EndpointGroups = js.Array[EndpointGroup]
  type EndpointWeight = scala.Double
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.HTTPS
    - java.lang.String
  */
  type HealthCheckProtocol = _HealthCheckProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIAL
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - java.lang.String
  */
  type HealthState = _HealthState | java.lang.String
  type IdempotencyToken = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = awsDashSdkLib.awsDashSdkLibStrings.IPV4 | java.lang.String
  type IpAddresses = js.Array[IpAddress]
  type IpSets = js.Array[IpSet]
  type Listeners = js.Array[Listener]
  type MaxResults = scala.Double
  type PortNumber = scala.Double
  type PortRanges = js.Array[PortRange]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.UDP
    - java.lang.String
  */
  type Protocol = _Protocol | java.lang.String
  type ThresholdCount = scala.Double
  type Timestamp = stdLib.Date
  type TrafficDialPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
