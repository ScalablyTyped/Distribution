package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlobalacceleratorMod {
  import typings.awsDashSdk.awsDashSdkStrings.IPV4
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type AcceleratorStatus = _AcceleratorStatus | String
  type Accelerators = js.Array[Accelerator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_IP
    - java.lang.String
  */
  type ClientAffinity = _ClientAffinity | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type EndpointConfigurations = js.Array[EndpointConfiguration]
  type EndpointDescriptions = js.Array[EndpointDescription]
  type EndpointGroups = js.Array[EndpointGroup]
  type EndpointWeight = Double
  type GenericBoolean = Boolean
  type GenericString = String
  type HealthCheckIntervalSeconds = Double
  type HealthCheckPort = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.HTTPS
    - java.lang.String
  */
  type HealthCheckProtocol = _HealthCheckProtocol | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIAL
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type HealthState = _HealthState | String
  type IdempotencyToken = String
  type IpAddress = String
  type IpAddressType = IPV4 | String
  type IpAddresses = js.Array[IpAddress]
  type IpSets = js.Array[IpSet]
  type Listeners = js.Array[Listener]
  type MaxResults = Double
  type PortNumber = Double
  type PortRanges = js.Array[PortRange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - typings.awsDashSdk.awsDashSdkStrings.UDP
    - java.lang.String
  */
  type Protocol = _Protocol | String
  type ThresholdCount = Double
  type Timestamp = Date
  type TrafficDialPercentage = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-08-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
