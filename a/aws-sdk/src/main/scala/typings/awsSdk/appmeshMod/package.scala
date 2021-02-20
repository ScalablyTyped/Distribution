package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appmeshMod {
  
  type AccountId = java.lang.String
  
  type Arn = java.lang.String
  
  type AwsCloudMapInstanceAttributeKey = java.lang.String
  
  type AwsCloudMapInstanceAttributeValue = java.lang.String
  
  type AwsCloudMapInstanceAttributes = js.Array[typings.awsSdk.appmeshMod.AwsCloudMapInstanceAttribute]
  
  type AwsCloudMapName = java.lang.String
  
  type Backends = js.Array[typings.awsSdk.appmeshMod.Backend]
  
  type Boolean = scala.Boolean
  
  type CertificateAuthorityArns = js.Array[typings.awsSdk.appmeshMod.Arn]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.appmeshMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.s_
    - typings.awsSdk.awsSdkStrings.ms_
    - java.lang.String
  */
  type DurationUnit = typings.awsSdk.appmeshMod._DurationUnit | java.lang.String
  
  type DurationValue = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW_ALL
    - typings.awsSdk.awsSdkStrings.DROP_ALL
    - java.lang.String
  */
  type EgressFilterType = typings.awsSdk.appmeshMod._EgressFilterType | java.lang.String
  
  type FilePath = java.lang.String
  
  type GatewayRouteList = js.Array[typings.awsSdk.appmeshMod.GatewayRouteRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type GatewayRouteStatusCode = typings.awsSdk.appmeshMod._GatewayRouteStatusCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.`deadline-exceeded`
    - typings.awsSdk.awsSdkStrings.internal_
    - typings.awsSdk.awsSdkStrings.`resource-exhausted`
    - typings.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type GrpcRetryPolicyEvent = typings.awsSdk.appmeshMod._GrpcRetryPolicyEvent | java.lang.String
  
  type GrpcRetryPolicyEvents = js.Array[typings.awsSdk.appmeshMod.GrpcRetryPolicyEvent]
  
  type GrpcRouteMetadataList = js.Array[typings.awsSdk.appmeshMod.GrpcRouteMetadata]
  
  type HeaderMatch = java.lang.String
  
  type HeaderName = java.lang.String
  
  type HealthCheckIntervalMillis = scala.Double
  
  type HealthCheckThreshold = scala.Double
  
  type HealthCheckTimeoutMillis = scala.Double
  
  type Hostname = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GET
    - typings.awsSdk.awsSdkStrings.HEAD
    - typings.awsSdk.awsSdkStrings.POST
    - typings.awsSdk.awsSdkStrings.PUT
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.CONNECT
    - typings.awsSdk.awsSdkStrings.OPTIONS
    - typings.awsSdk.awsSdkStrings.TRACE
    - typings.awsSdk.awsSdkStrings.PATCH
    - java.lang.String
  */
  type HttpMethod = typings.awsSdk.appmeshMod._HttpMethod | java.lang.String
  
  type HttpRetryPolicyEvent = java.lang.String
  
  type HttpRetryPolicyEvents = js.Array[typings.awsSdk.appmeshMod.HttpRetryPolicyEvent]
  
  type HttpRouteHeaders = js.Array[typings.awsSdk.appmeshMod.HttpRouteHeader]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.http_
    - typings.awsSdk.awsSdkStrings.https_
    - java.lang.String
  */
  type HttpScheme = typings.awsSdk.appmeshMod._HttpScheme | java.lang.String
  
  type ListGatewayRoutesLimit = scala.Double
  
  type ListMeshesLimit = scala.Double
  
  type ListRoutesLimit = scala.Double
  
  type ListVirtualGatewaysLimit = scala.Double
  
  type ListVirtualNodesLimit = scala.Double
  
  type ListVirtualRoutersLimit = scala.Double
  
  type ListVirtualServicesLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRICT
    - typings.awsSdk.awsSdkStrings.PERMISSIVE
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ListenerTlsMode = typings.awsSdk.appmeshMod._ListenerTlsMode | java.lang.String
  
  type Listeners = js.Array[typings.awsSdk.appmeshMod.Listener]
  
  type Long = scala.Double
  
  type MaxConnections = scala.Double
  
  type MaxPendingRequests = scala.Double
  
  type MaxRequests = scala.Double
  
  type MaxRetries = scala.Double
  
  type MeshList = js.Array[typings.awsSdk.appmeshMod.MeshRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type MeshStatusCode = typings.awsSdk.appmeshMod._MeshStatusCode | java.lang.String
  
  type MethodName = java.lang.String
  
  type OutlierDetectionMaxEjectionPercent = scala.Double
  
  type OutlierDetectionMaxServerErrors = scala.Double
  
  type PercentInt = scala.Double
  
  type PortNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.http_
    - typings.awsSdk.awsSdkStrings.tcp_
    - typings.awsSdk.awsSdkStrings.http2
    - typings.awsSdk.awsSdkStrings.grpc
    - java.lang.String
  */
  type PortProtocol = typings.awsSdk.appmeshMod._PortProtocol | java.lang.String
  
  type PortSet = js.Array[typings.awsSdk.appmeshMod.PortNumber]
  
  type ResourceName = java.lang.String
  
  type RouteList = js.Array[typings.awsSdk.appmeshMod.RouteRef]
  
  type RoutePriority = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type RouteStatusCode = typings.awsSdk.appmeshMod._RouteStatusCode | java.lang.String
  
  type ServiceName = java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.appmeshMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.appmeshMod.TagRef]
  
  type TagValue = java.lang.String
  
  type TagsLimit = scala.Double
  
  type TcpRetryPolicyEvent = typings.awsSdk.awsSdkStrings.`connection-error` | java.lang.String
  
  type TcpRetryPolicyEvents = js.Array[typings.awsSdk.appmeshMod.TcpRetryPolicyEvent]
  
  type Timestamp = typings.std.Date
  
  type VirtualGatewayCertificateAuthorityArns = js.Array[typings.awsSdk.appmeshMod.Arn]
  
  type VirtualGatewayHealthCheckIntervalMillis = scala.Double
  
  type VirtualGatewayHealthCheckThreshold = scala.Double
  
  type VirtualGatewayHealthCheckTimeoutMillis = scala.Double
  
  type VirtualGatewayList = js.Array[typings.awsSdk.appmeshMod.VirtualGatewayRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRICT
    - typings.awsSdk.awsSdkStrings.PERMISSIVE
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type VirtualGatewayListenerTlsMode = typings.awsSdk.appmeshMod._VirtualGatewayListenerTlsMode | java.lang.String
  
  type VirtualGatewayListeners = js.Array[typings.awsSdk.appmeshMod.VirtualGatewayListener]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.http_
    - typings.awsSdk.awsSdkStrings.http2
    - typings.awsSdk.awsSdkStrings.grpc
    - java.lang.String
  */
  type VirtualGatewayPortProtocol = typings.awsSdk.appmeshMod._VirtualGatewayPortProtocol | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type VirtualGatewayStatusCode = typings.awsSdk.appmeshMod._VirtualGatewayStatusCode | java.lang.String
  
  type VirtualNodeList = js.Array[typings.awsSdk.appmeshMod.VirtualNodeRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type VirtualNodeStatusCode = typings.awsSdk.appmeshMod._VirtualNodeStatusCode | java.lang.String
  
  type VirtualRouterList = js.Array[typings.awsSdk.appmeshMod.VirtualRouterRef]
  
  type VirtualRouterListeners = js.Array[typings.awsSdk.appmeshMod.VirtualRouterListener]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type VirtualRouterStatusCode = typings.awsSdk.appmeshMod._VirtualRouterStatusCode | java.lang.String
  
  type VirtualServiceList = js.Array[typings.awsSdk.appmeshMod.VirtualServiceRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type VirtualServiceStatusCode = typings.awsSdk.appmeshMod._VirtualServiceStatusCode | java.lang.String
  
  type WeightedTargets = js.Array[typings.awsSdk.appmeshMod.WeightedTarget]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-10-01`
    - typings.awsSdk.awsSdkStrings.`2019-01-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.appmeshMod._apiVersion | java.lang.String
}
