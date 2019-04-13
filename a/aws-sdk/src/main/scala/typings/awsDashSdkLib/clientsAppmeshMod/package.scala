package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppmeshMod {
  type Arn = java.lang.String
  type Backends = js.Array[Backend]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOW_ALL
    - awsDashSdkLib.awsDashSdkLibStrings.DROP_ALL
    - java.lang.String
  */
  type EgressFilterType = _EgressFilterType | java.lang.String
  type FilePath = java.lang.String
  type HealthCheckIntervalMillis = scala.Double
  type HealthCheckThreshold = scala.Double
  type HealthCheckTimeoutMillis = scala.Double
  type Hostname = java.lang.String
  type ListMeshesLimit = scala.Double
  type ListRoutesLimit = scala.Double
  type ListVirtualNodesLimit = scala.Double
  type ListVirtualRoutersLimit = scala.Double
  type ListVirtualServicesLimit = scala.Double
  type Listeners = js.Array[Listener]
  type Long = scala.Double
  type MeshList = js.Array[MeshRef]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type MeshStatusCode = _MeshStatusCode | java.lang.String
  type PercentInt = scala.Double
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.http
    - awsDashSdkLib.awsDashSdkLibStrings.tcp
    - java.lang.String
  */
  type PortProtocol = _PortProtocol | java.lang.String
  type ResourceName = java.lang.String
  type RouteList = js.Array[RouteRef]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type RouteStatusCode = _RouteStatusCode | java.lang.String
  type ServiceName = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagRef]
  type TagValue = java.lang.String
  type TagsLimit = scala.Double
  type Timestamp = stdLib.Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type VirtualNodeStatusCode = _VirtualNodeStatusCode | java.lang.String
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterListeners = js.Array[VirtualRouterListener]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type VirtualRouterStatusCode = _VirtualRouterStatusCode | java.lang.String
  type VirtualServiceList = js.Array[VirtualServiceRef]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type VirtualServiceStatusCode = _VirtualServiceStatusCode | java.lang.String
  type WeightedTargets = js.Array[WeightedTarget]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-10-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2019-01-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
