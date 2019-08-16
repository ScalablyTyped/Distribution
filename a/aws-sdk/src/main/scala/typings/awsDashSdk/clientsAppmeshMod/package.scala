package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppmeshMod {
  type Arn = java.lang.String
  type AwsCloudMapInstanceAttributeKey = java.lang.String
  type AwsCloudMapInstanceAttributeValue = java.lang.String
  type AwsCloudMapInstanceAttributes = js.Array[AwsCloudMapInstanceAttribute]
  type AwsCloudMapName = java.lang.String
  type Backends = js.Array[Backend]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_ALL
    - typings.awsDashSdk.awsDashSdkStrings.DROP_ALL
    - java.lang.String
  */
  type EgressFilterType = _EgressFilterType | java.lang.String
  type FilePath = java.lang.String
  type HeaderMatch = java.lang.String
  type HeaderName = java.lang.String
  type HealthCheckIntervalMillis = Double
  type HealthCheckThreshold = Double
  type HealthCheckTimeoutMillis = Double
  type Hostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.connect
    - typings.awsDashSdk.awsDashSdkStrings.delete
    - typings.awsDashSdk.awsDashSdkStrings.get
    - typings.awsDashSdk.awsDashSdkStrings.head
    - typings.awsDashSdk.awsDashSdkStrings.options
    - typings.awsDashSdk.awsDashSdkStrings.patch
    - typings.awsDashSdk.awsDashSdkStrings.post
    - typings.awsDashSdk.awsDashSdkStrings.put
    - typings.awsDashSdk.awsDashSdkStrings.trace
    - java.lang.String
  */
  type HttpMethod = _HttpMethod | java.lang.String
  type HttpRouteHeaders = js.Array[HttpRouteHeader]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.http
    - typings.awsDashSdk.awsDashSdkStrings.https
    - java.lang.String
  */
  type HttpScheme = _HttpScheme | java.lang.String
  type ListMeshesLimit = Double
  type ListRoutesLimit = Double
  type ListVirtualNodesLimit = Double
  type ListVirtualRoutersLimit = Double
  type ListVirtualServicesLimit = Double
  type Listeners = js.Array[Listener]
  type Long = Double
  type MeshList = js.Array[MeshRef]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type MeshStatusCode = _MeshStatusCode | java.lang.String
  type PercentInt = Double
  type PortNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.http
    - typings.awsDashSdk.awsDashSdkStrings.tcp
    - java.lang.String
  */
  type PortProtocol = _PortProtocol | java.lang.String
  type ResourceName = java.lang.String
  type RouteList = js.Array[RouteRef]
  type RoutePriority = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type RouteStatusCode = _RouteStatusCode | java.lang.String
  type ServiceName = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagRef]
  type TagValue = java.lang.String
  type TagsLimit = Double
  type Timestamp = Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualNodeStatusCode = _VirtualNodeStatusCode | java.lang.String
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterListeners = js.Array[VirtualRouterListener]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualRouterStatusCode = _VirtualRouterStatusCode | java.lang.String
  type VirtualServiceList = js.Array[VirtualServiceRef]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type VirtualServiceStatusCode = _VirtualServiceStatusCode | java.lang.String
  type WeightedTargets = js.Array[WeightedTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2019-01-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
