package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcceleratorEvents = js.Array[AcceleratorEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOYED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type AcceleratorStatus = _AcceleratorStatus | String

type Accelerators = js.Array[Accelerator]

type ByoipCidrEvents = js.Array[ByoipCidrEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_PROVISIONING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.PENDING_ADVERTISING
  - typings.awsSdk.awsSdkStrings.ADVERTISING
  - typings.awsSdk.awsSdkStrings.PENDING_WITHDRAWING
  - typings.awsSdk.awsSdkStrings.PENDING_DEPROVISIONING
  - typings.awsSdk.awsSdkStrings.DEPROVISIONED
  - typings.awsSdk.awsSdkStrings.FAILED_PROVISION
  - typings.awsSdk.awsSdkStrings.FAILED_ADVERTISING
  - typings.awsSdk.awsSdkStrings.FAILED_WITHDRAW
  - typings.awsSdk.awsSdkStrings.FAILED_DEPROVISION
  - java.lang.String
*/
type ByoipCidrState = _ByoipCidrState | String

type ByoipCidrs = js.Array[ByoipCidr]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SOURCE_IP
  - java.lang.String
*/
type ClientAffinity = _ClientAffinity | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPLOYED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type CustomRoutingAcceleratorStatus = _CustomRoutingAcceleratorStatus | String

type CustomRoutingAccelerators = js.Array[CustomRoutingAccelerator]

type CustomRoutingDestinationConfigurations = js.Array[CustomRoutingDestinationConfiguration]

type CustomRoutingDestinationDescriptions = js.Array[CustomRoutingDestinationDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type CustomRoutingDestinationTrafficState = _CustomRoutingDestinationTrafficState | String

type CustomRoutingEndpointConfigurations = js.Array[CustomRoutingEndpointConfiguration]

type CustomRoutingEndpointDescriptions = js.Array[CustomRoutingEndpointDescription]

type CustomRoutingEndpointGroups = js.Array[CustomRoutingEndpointGroup]

type CustomRoutingListeners = js.Array[CustomRoutingListener]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type CustomRoutingProtocol = _CustomRoutingProtocol | String

type CustomRoutingProtocols = js.Array[CustomRoutingProtocol]

type DestinationAddresses = js.Array[IpAddress]

type DestinationPortMappings = js.Array[DestinationPortMapping]

type DestinationPorts = js.Array[PortNumber]

type EndpointConfigurations = js.Array[EndpointConfiguration]

type EndpointDescriptions = js.Array[EndpointDescription]

type EndpointGroups = js.Array[EndpointGroup]

type EndpointIds = js.Array[GenericString]

type EndpointWeight = Double

type GenericBoolean = Boolean

type GenericString = String

type HealthCheckIntervalSeconds = Double

type HealthCheckPath = String

type HealthCheckPort = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - java.lang.String
*/
type HealthCheckProtocol = _HealthCheckProtocol | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIAL
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type HealthState = _HealthState | String

type IdempotencyToken = String

type IpAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPv4_
  - typings.awsSdk.awsSdkStrings.IPv6_
  - java.lang.String
*/
type IpAddressFamily = _IpAddressFamily | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPV4
  - typings.awsSdk.awsSdkStrings.DUAL_STACK
  - java.lang.String
*/
type IpAddressType = _IpAddressType | String

type IpAddresses = js.Array[IpAddress]

type IpSets = js.Array[IpSet]

type Listeners = js.Array[Listener]

type MaxResults = Double

type PortMappings = js.Array[PortMapping]

type PortMappingsMaxResults = Double

type PortNumber = Double

type PortOverrides = js.Array[PortOverride]

type PortRanges = js.Array[PortRange]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type Protocol = _Protocol | String

type Protocols = js.Array[Protocol]

type ResourceArn = String

type SocketAddresses = js.Array[SocketAddress]

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type ThresholdCount = Double

type Timestamp = js.Date

type TrafficDialPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-08-08`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
