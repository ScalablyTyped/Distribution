package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/appmesh", "AppMesh")
@js.native
object AppMeshNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateMeshInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name to use for the service mesh.
         */
    var meshName: ResourceName
  }
  
  
  trait CreateMeshOutput extends js.Object {
    /**
         * The full description of your service mesh following the create call.
         */
    var mesh: js.UndefOr[MeshData] = js.undefined
  }
  
  
  trait CreateRouteInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which to create the route.
         */
    var meshName: ResourceName
    /**
         * The name to use for the route.
         */
    var routeName: ResourceName
    /**
         * The route specification to apply.
         */
    var spec: RouteSpec
    /**
         * The name of the virtual router in which to create the route.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait CreateRouteOutput extends js.Object {
    /**
         * The full description of your mesh following the create call.
         */
    var route: js.UndefOr[RouteData] = js.undefined
  }
  
  
  trait CreateVirtualNodeInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which to create the virtual node.
         */
    var meshName: ResourceName
    /**
         * The virtual node specification to apply.
         */
    var spec: VirtualNodeSpec
    /**
         * The name to use for the virtual node.
         */
    var virtualNodeName: ResourceName
  }
  
  
  trait CreateVirtualNodeOutput extends js.Object {
    /**
         * The full description of your virtual node following the create call.
         */
    var virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
  }
  
  
  trait CreateVirtualRouterInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which to create the virtual router.
         */
    var meshName: ResourceName
    /**
         * The virtual router specification to apply.
         */
    var spec: VirtualRouterSpec
    /**
         * The name to use for the virtual router.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait CreateVirtualRouterOutput extends js.Object {
    /**
         * The full description of your virtual router following the create call.
         */
    var virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
  }
  
  
  trait DeleteMeshInput extends js.Object {
    /**
         * The name of the service mesh to delete.
         */
    var meshName: ResourceName
  }
  
  
  trait DeleteMeshOutput extends js.Object {
    /**
         * The service mesh that was deleted.
         */
    var mesh: js.UndefOr[MeshData] = js.undefined
  }
  
  
  trait DeleteRouteInput extends js.Object {
    /**
         * The name of the service mesh in which to delete the route.
         */
    var meshName: ResourceName
    /**
         * The name of the route to delete.
         */
    var routeName: ResourceName
    /**
         * The name of the virtual router in which to delete the route.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait DeleteRouteOutput extends js.Object {
    /**
         * The route that was deleted.
         */
    var route: js.UndefOr[RouteData] = js.undefined
  }
  
  
  trait DeleteVirtualNodeInput extends js.Object {
    /**
         * The name of the service mesh in which to delete the virtual node.
         */
    var meshName: ResourceName
    /**
         * The name of the virtual node to delete.
         */
    var virtualNodeName: ResourceName
  }
  
  
  trait DeleteVirtualNodeOutput extends js.Object {
    /**
         * The virtual node that was deleted.
         */
    var virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
  }
  
  
  trait DeleteVirtualRouterInput extends js.Object {
    /**
         * The name of the service mesh in which to delete the virtual router.
         */
    var meshName: ResourceName
    /**
         * The name of the virtual router to delete.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait DeleteVirtualRouterOutput extends js.Object {
    /**
         * The virtual router that was deleted.
         */
    var virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
  }
  
  
  trait DescribeMeshInput extends js.Object {
    /**
         * The name of the service mesh to describe.
         */
    var meshName: ResourceName
  }
  
  
  trait DescribeMeshOutput extends js.Object {
    /**
         * The full description of your service mesh.
         */
    var mesh: js.UndefOr[MeshData] = js.undefined
  }
  
  
  trait DescribeRouteInput extends js.Object {
    /**
         * The name of the service mesh in which the route resides.
         */
    var meshName: ResourceName
    /**
         * The name of the route to describe.
         */
    var routeName: ResourceName
    /**
         * The name of the virtual router with which the route is associated.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait DescribeRouteOutput extends js.Object {
    /**
         * The full description of your route.
         */
    var route: js.UndefOr[RouteData] = js.undefined
  }
  
  
  trait DescribeVirtualNodeInput extends js.Object {
    /**
         * The name of the service mesh in which the virtual node resides.
         */
    var meshName: ResourceName
    /**
         * The name of the virtual node to describe.
         */
    var virtualNodeName: ResourceName
  }
  
  
  trait DescribeVirtualNodeOutput extends js.Object {
    /**
         * The full description of your virtual node.
         */
    var virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
  }
  
  
  trait DescribeVirtualRouterInput extends js.Object {
    /**
         * The name of the service mesh in which the virtual router resides.
         */
    var meshName: ResourceName
    /**
         * The name of the virtual router to describe.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait DescribeVirtualRouterOutput extends js.Object {
    /**
         * The full description of your virtual router.
         */
    var virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
  }
  
  
  trait DnsServiceDiscovery extends js.Object {
    /**
         * The DNS service name for your virtual node.
         */
    var serviceName: js.UndefOr[ServiceName] = js.undefined
  }
  
  
  trait HealthCheckPolicy extends js.Object {
    /**
         * The number of consecutive successful health checks that must occur before declaring
             listener healthy.
         */
    var healthyThreshold: js.UndefOr[NonNegativeInt] = js.undefined
    /**
         * The time period in milliseconds between each health check execution.
         */
    var intervalMillis: js.UndefOr[DurationMillis] = js.undefined
    /**
         * The destination path for the health check request.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The destination port for the health check request.
         */
    var port: js.UndefOr[PortNumber] = js.undefined
    /**
         * The protocol for the health check request.
         */
    var protocol: js.UndefOr[PortProtocol] = js.undefined
    /**
         * The amount of time to wait when receiving a response from the health check, in
             milliseconds.
         */
    var timeoutMillis: js.UndefOr[DurationMillis] = js.undefined
    /**
         * The number of consecutive failed health checks that must occur before declaring a
             virtual node unhealthy. 
         */
    var unhealthyThreshold: js.UndefOr[NonNegativeInt] = js.undefined
  }
  
  
  trait HttpRoute extends js.Object {
    /**
         * The action to take if a match is determined.
         */
    var action: js.UndefOr[HttpRouteAction] = js.undefined
    /**
         * The criteria for determining an HTTP request match.
         */
    var `match`: js.UndefOr[HttpRouteMatch] = js.undefined
  }
  
  
  trait HttpRouteAction extends js.Object {
    /**
         * The targets that traffic is routed to when a request matches the route. You can specify
             one or more targets and their relative weights with which to distribute traffic.
         */
    var weightedTargets: js.UndefOr[WeightedTargets] = js.undefined
  }
  
  
  trait HttpRouteMatch extends js.Object {
    /**
         * Specifies the path with which to match requests. This parameter must always start with
                /, which by itself matches all requests to the virtual router service name.
             You can also match for path-based routing of requests. For example, if your virtual router
             service name is my-service.local, and you want the route to match requests to
                my-service.local/metrics, then your prefix should be
             /metrics.
         */
    var prefix: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListMeshesInput extends js.Object {
    /**
         * The maximum number of mesh results returned by ListMeshes in paginated
             output. When this parameter is used, ListMeshes only returns
                limit results in a single page along with a nextToken response
             element. The remaining results of the initial request can be seen by sending another
                ListMeshes request with the returned nextToken value. This
             value can be between 1 and 100. If this parameter is not
             used, then ListMeshes returns up to 100 results and a
                nextToken value if applicable.
         */
    var limit: js.UndefOr[ListMeshesLimit] = js.undefined
    /**
         * The nextToken value returned from a previous paginated
             ListMeshes request where limit was used and the
             results exceeded the value of that parameter. Pagination continues from the end of the
             previous results that returned the nextToken value.
             
                This token should be treated as an opaque identifier that is only used to
                    retrieve the next items in a list and not for other programmatic purposes.
            
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListMeshesOutput extends js.Object {
    /**
         * The list of existing service meshes.
         */
    var meshes: MeshList
    /**
         * The nextToken value to include in a future ListMeshes
             request. When the results of a ListMeshes request exceed
             limit, this value can be used to retrieve the next page of
             results. This value is null when there are no more results to
             return.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListRoutesInput extends js.Object {
    /**
         * The maximum number of mesh results returned by ListRoutes in paginated
             output. When this parameter is used, ListRoutes only returns
                limit results in a single page along with a nextToken response
             element. The remaining results of the initial request can be seen by sending another
                ListRoutes request with the returned nextToken value. This
             value can be between 1 and 100. If this parameter is not
             used, then ListRoutes returns up to 100 results and a
                nextToken value if applicable.
         */
    var limit: js.UndefOr[ListRoutesLimit] = js.undefined
    /**
         * The name of the service mesh in which to list routes.
         */
    var meshName: ResourceName
    /**
         * The nextToken value returned from a previous paginated
             ListRoutes request where limit was used and the
             results exceeded the value of that parameter. Pagination continues from the end of the
             previous results that returned the nextToken value.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the virtual router in which to list routes.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait ListRoutesOutput extends js.Object {
    /**
         * The nextToken value to include in a future ListRoutes
             request. When the results of a ListRoutes request exceed
             limit, this value can be used to retrieve the next page of
             results. This value is null when there are no more results to
             return.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The list of existing routes for the specified service mesh and virtual router.
         */
    var routes: RouteList
  }
  
  
  trait ListVirtualNodesInput extends js.Object {
    /**
         * The maximum number of mesh results returned by ListVirtualNodes in
             paginated output. When this parameter is used, ListVirtualNodes only returns
             limit results in a single page along with a nextToken
             response element. The remaining results of the initial request can be seen by sending
             another ListVirtualNodes request with the returned nextToken
             value. This value can be between 1 and 100. If this
             parameter is not used, then ListVirtualNodes returns up to
             100 results and a nextToken value if applicable.
         */
    var limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined
    /**
         * The name of the service mesh in which to list virtual nodes.
         */
    var meshName: ResourceName
    /**
         * The nextToken value returned from a previous paginated
             ListVirtualNodes request where limit was used and the
             results exceeded the value of that parameter. Pagination continues from the end of the
             previous results that returned the nextToken value.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListVirtualNodesOutput extends js.Object {
    /**
         * The nextToken value to include in a future ListVirtualNodes
             request. When the results of a ListVirtualNodes request exceed
             limit, this value can be used to retrieve the next page of
             results. This value is null when there are no more results to
             return.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The list of existing virtual nodes for the specified service mesh.
         */
    var virtualNodes: VirtualNodeList
  }
  
  
  trait ListVirtualRoutersInput extends js.Object {
    /**
         * The maximum number of mesh results returned by ListVirtualRouters in
             paginated output. When this parameter is used, ListVirtualRouters only returns
             limit results in a single page along with a nextToken
             response element. The remaining results of the initial request can be seen by sending
             another ListVirtualRouters request with the returned nextToken
             value. This value can be between 1 and 100. If this
             parameter is not used, then ListVirtualRouters returns up to
             100 results and a nextToken value if applicable.
         */
    var limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined
    /**
         * The name of the service mesh in which to list virtual routers.
         */
    var meshName: ResourceName
    /**
         * The nextToken value returned from a previous paginated
             ListVirtualRouters request where limit was used and the
             results exceeded the value of that parameter. Pagination continues from the end of the
             previous results that returned the nextToken value.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListVirtualRoutersOutput extends js.Object {
    /**
         * The nextToken value to include in a future ListVirtualRouters
             request. When the results of a ListVirtualRouters request exceed
             limit, this value can be used to retrieve the next page of
             results. This value is null when there are no more results to
             return.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The list of existing virtual routers for the specified service mesh.
         */
    var virtualRouters: VirtualRouterList
  }
  
  
  trait Listener extends js.Object {
    /**
         * The health check information for the listener.
             
                Listener health checks are not available during the App Mesh preview.
             
         */
    var healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined
    /**
         * The port mapping information for the listener.
         */
    var portMapping: js.UndefOr[PortMapping] = js.undefined
  }
  
  
  trait MeshData extends js.Object {
    /**
         * The name of the service mesh.
         */
    var meshName: ResourceName
    /**
         * The associated metadata for the service mesh.
         */
    var metadata: ResourceMetadata
    /**
         * The status of the service mesh.
         */
    var status: js.UndefOr[MeshStatus] = js.undefined
  }
  
  
  trait MeshRef extends js.Object {
    /**
         * The full Amazon Resource Name (ARN) of the service mesh.
         */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the service mesh.
         */
    var meshName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait MeshStatus extends js.Object {
    /**
         * The current mesh status.
         */
    var status: js.UndefOr[MeshStatusCode] = js.undefined
  }
  
  
  trait PortMapping extends js.Object {
    /**
         * The port used for the port mapping.
         */
    var port: js.UndefOr[PortNumber] = js.undefined
    /**
         * The protocol used for the port mapping.
         */
    var protocol: js.UndefOr[PortProtocol] = js.undefined
  }
  
  
  trait ResourceMetadata extends js.Object {
    /**
         * The full Amazon Resource Name (ARN) for the resource.
             
                After you create a virtual node, set this value (either the full ARN or the
                truncated resource name, for example, mesh/default/virtualNode/simpleapp,
                as the APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's
                Envoy proxy container in your task definition or pod spec. This is then mapped to the
                   node.id and node.cluster Envoy parameters.
                If you require your Envoy stats or tracing to use a different name, you can override
                the node.cluster value that is set by
                   APPMESH_VIRTUAL_NODE_NAME with the
                   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
             
         */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
         * The Unix epoch timestamp in seconds for when the cluster was created.
         */
    var createdAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Unix epoch timestamp in seconds for when the cluster was last updated.
         */
    var lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The unique identifier for the resource.
         */
    var uid: js.UndefOr[String] = js.undefined
    /**
         * The version of the resource. Resources are created at version 1, and this version is
             incremented each time they are updated.
         */
    var version: js.UndefOr[Long] = js.undefined
  }
  
  
  trait RouteData extends js.Object {
    /**
         * The name of the service mesh in which the route resides.
         */
    var meshName: ResourceName
    /**
         * The associated metadata for the route.
         */
    var metadata: js.UndefOr[ResourceMetadata] = js.undefined
    /**
         * The name of the route.
         */
    var routeName: ResourceName
    /**
         * The specifications of the route.
         */
    var spec: js.UndefOr[RouteSpec] = js.undefined
    /**
         * The status of the route.
         */
    var status: js.UndefOr[RouteStatus] = js.undefined
    /**
         * The virtual router with which the route is associated.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait RouteRef extends js.Object {
    /**
         * The full Amazon Resource Name (ARN) for the route.
         */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the service mesh in which the route resides.
         */
    var meshName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the route.
         */
    var routeName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The virtual router with which the route is associated.
         */
    var virtualRouterName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait RouteSpec extends js.Object {
    /**
         * The HTTP routing information for the route.
         */
    var httpRoute: js.UndefOr[HttpRoute] = js.undefined
  }
  
  
  trait RouteStatus extends js.Object {
    /**
         * The current status for the route.
         */
    var status: js.UndefOr[RouteStatusCode] = js.undefined
  }
  
  
  trait ServiceDiscovery extends js.Object {
    /**
         * Specifies the DNS service name for the virtual node.
         */
    var dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a new service mesh. A service mesh is a logical boundary for network traffic
             between the services that reside within it.
             After you create your service mesh, you can create virtual nodes, virtual routers, and
             routes to distribute traffic between the applications in your mesh.
       */
    def createMesh(): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new service mesh. A service mesh is a logical boundary for network traffic
             between the services that reside within it.
             After you create your service mesh, you can create virtual nodes, virtual routers, and
             routes to distribute traffic between the applications in your mesh.
       */
    def createMesh(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new service mesh. A service mesh is a logical boundary for network traffic
             between the services that reside within it.
             After you create your service mesh, you can create virtual nodes, virtual routers, and
             routes to distribute traffic between the applications in your mesh.
       */
    def createMesh(params: CreateMeshInput): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new service mesh. A service mesh is a logical boundary for network traffic
             between the services that reside within it.
             After you create your service mesh, you can create virtual nodes, virtual routers, and
             routes to distribute traffic between the applications in your mesh.
       */
    def createMesh(
      params: CreateMeshInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new route that is associated with a virtual router.
             You can use the prefix parameter in your route specification for path-based
             routing of requests. For example, if your virtual router service name is
                my-service.local, and you want the route to match requests to
                my-service.local/metrics, then your prefix should be
             /metrics.
             If your route matches a request, you can distribute traffic to one or more target
             virtual nodes with relative weighting.
       */
    def createRoute(): awsDashSdkLib.libRequestMod.Request[CreateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new route that is associated with a virtual router.
             You can use the prefix parameter in your route specification for path-based
             routing of requests. For example, if your virtual router service name is
                my-service.local, and you want the route to match requests to
                my-service.local/metrics, then your prefix should be
             /metrics.
             If your route matches a request, you can distribute traffic to one or more target
             virtual nodes with relative weighting.
       */
    def createRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new route that is associated with a virtual router.
             You can use the prefix parameter in your route specification for path-based
             routing of requests. For example, if your virtual router service name is
                my-service.local, and you want the route to match requests to
                my-service.local/metrics, then your prefix should be
             /metrics.
             If your route matches a request, you can distribute traffic to one or more target
             virtual nodes with relative weighting.
       */
    def createRoute(params: CreateRouteInput): awsDashSdkLib.libRequestMod.Request[CreateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new route that is associated with a virtual router.
             You can use the prefix parameter in your route specification for path-based
             routing of requests. For example, if your virtual router service name is
                my-service.local, and you want the route to match requests to
                my-service.local/metrics, then your prefix should be
             /metrics.
             If your route matches a request, you can distribute traffic to one or more target
             virtual nodes with relative weighting.
       */
    def createRoute(
      params: CreateRouteInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual node within a service mesh.
             A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS
             service or a Kubernetes deployment. When you create a virtual node, you must specify the
             DNS service discovery name for your task group.
             Any inbound traffic that your virtual node expects should be specified as a
                listener. Any outbound traffic that your virtual node expects to reach
             should be specified as a backend.
             The response metadata for your new virtual node contains the arn that is
             associated with the virtual node. Set this value (either the full ARN or the truncated
             resource name, for example, mesh/default/virtualNode/simpleapp, as the
                APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
             proxy container in your task definition or pod spec. This is then mapped to the
                node.id and node.cluster Envoy parameters.
             
                If you require your Envoy stats or tracing to use a different name, you can override
                the node.cluster value that is set by
                   APPMESH_VIRTUAL_NODE_NAME with the
                   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
             
       */
    def createVirtualNode(): awsDashSdkLib.libRequestMod.Request[CreateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual node within a service mesh.
             A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS
             service or a Kubernetes deployment. When you create a virtual node, you must specify the
             DNS service discovery name for your task group.
             Any inbound traffic that your virtual node expects should be specified as a
                listener. Any outbound traffic that your virtual node expects to reach
             should be specified as a backend.
             The response metadata for your new virtual node contains the arn that is
             associated with the virtual node. Set this value (either the full ARN or the truncated
             resource name, for example, mesh/default/virtualNode/simpleapp, as the
                APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
             proxy container in your task definition or pod spec. This is then mapped to the
                node.id and node.cluster Envoy parameters.
             
                If you require your Envoy stats or tracing to use a different name, you can override
                the node.cluster value that is set by
                   APPMESH_VIRTUAL_NODE_NAME with the
                   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
             
       */
    def createVirtualNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual node within a service mesh.
             A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS
             service or a Kubernetes deployment. When you create a virtual node, you must specify the
             DNS service discovery name for your task group.
             Any inbound traffic that your virtual node expects should be specified as a
                listener. Any outbound traffic that your virtual node expects to reach
             should be specified as a backend.
             The response metadata for your new virtual node contains the arn that is
             associated with the virtual node. Set this value (either the full ARN or the truncated
             resource name, for example, mesh/default/virtualNode/simpleapp, as the
                APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
             proxy container in your task definition or pod spec. This is then mapped to the
                node.id and node.cluster Envoy parameters.
             
                If you require your Envoy stats or tracing to use a different name, you can override
                the node.cluster value that is set by
                   APPMESH_VIRTUAL_NODE_NAME with the
                   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
             
       */
    def createVirtualNode(params: CreateVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[CreateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual node within a service mesh.
             A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS
             service or a Kubernetes deployment. When you create a virtual node, you must specify the
             DNS service discovery name for your task group.
             Any inbound traffic that your virtual node expects should be specified as a
                listener. Any outbound traffic that your virtual node expects to reach
             should be specified as a backend.
             The response metadata for your new virtual node contains the arn that is
             associated with the virtual node. Set this value (either the full ARN or the truncated
             resource name, for example, mesh/default/virtualNode/simpleapp, as the
                APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
             proxy container in your task definition or pod spec. This is then mapped to the
                node.id and node.cluster Envoy parameters.
             
                If you require your Envoy stats or tracing to use a different name, you can override
                the node.cluster value that is set by
                   APPMESH_VIRTUAL_NODE_NAME with the
                   APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
             
       */
    def createVirtualNode(
      params: CreateVirtualNodeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual router within a service mesh.
             Virtual routers handle traffic for one or more service names within your mesh. After you
             create your virtual router, create and associate routes for your virtual router that direct
             incoming requests to different virtual nodes.
       */
    def createVirtualRouter(): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual router within a service mesh.
             Virtual routers handle traffic for one or more service names within your mesh. After you
             create your virtual router, create and associate routes for your virtual router that direct
             incoming requests to different virtual nodes.
       */
    def createVirtualRouter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual router within a service mesh.
             Virtual routers handle traffic for one or more service names within your mesh. After you
             create your virtual router, create and associate routes for your virtual router that direct
             incoming requests to different virtual nodes.
       */
    def createVirtualRouter(params: CreateVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new virtual router within a service mesh.
             Virtual routers handle traffic for one or more service names within your mesh. After you
             create your virtual router, create and associate routes for your virtual router that direct
             incoming requests to different virtual nodes.
       */
    def createVirtualRouter(
      params: CreateVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing service mesh.
             You must delete all resources (routes, virtual routers, virtual nodes) in the service
             mesh before you can delete the mesh itself.
       */
    def deleteMesh(): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing service mesh.
             You must delete all resources (routes, virtual routers, virtual nodes) in the service
             mesh before you can delete the mesh itself.
       */
    def deleteMesh(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing service mesh.
             You must delete all resources (routes, virtual routers, virtual nodes) in the service
             mesh before you can delete the mesh itself.
       */
    def deleteMesh(params: DeleteMeshInput): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing service mesh.
             You must delete all resources (routes, virtual routers, virtual nodes) in the service
             mesh before you can delete the mesh itself.
       */
    def deleteMesh(
      params: DeleteMeshInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing route.
       */
    def deleteRoute(): awsDashSdkLib.libRequestMod.Request[DeleteRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing route.
       */
    def deleteRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing route.
       */
    def deleteRoute(params: DeleteRouteInput): awsDashSdkLib.libRequestMod.Request[DeleteRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing route.
       */
    def deleteRoute(
      params: DeleteRouteInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual node.
       */
    def deleteVirtualNode(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual node.
       */
    def deleteVirtualNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual node.
       */
    def deleteVirtualNode(params: DeleteVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual node.
       */
    def deleteVirtualNode(
      params: DeleteVirtualNodeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual router.
             You must delete any routes associated with the virtual router before you can delete the
             router itself.
       */
    def deleteVirtualRouter(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual router.
             You must delete any routes associated with the virtual router before you can delete the
             router itself.
       */
    def deleteVirtualRouter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual router.
             You must delete any routes associated with the virtual router before you can delete the
             router itself.
       */
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[DeleteVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an existing virtual router.
             You must delete any routes associated with the virtual router before you can delete the
             router itself.
       */
    def deleteVirtualRouter(
      params: DeleteVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing cluster.
       */
    def describeMesh(): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing cluster.
       */
    def describeMesh(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing cluster.
       */
    def describeMesh(params: DescribeMeshInput): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing cluster.
       */
    def describeMesh(
      params: DescribeMeshInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing route.
       */
    def describeRoute(): awsDashSdkLib.libRequestMod.Request[DescribeRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing route.
       */
    def describeRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing route.
       */
    def describeRoute(params: DescribeRouteInput): awsDashSdkLib.libRequestMod.Request[DescribeRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing route.
       */
    def describeRoute(
      params: DescribeRouteInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual node.
       */
    def describeVirtualNode(): awsDashSdkLib.libRequestMod.Request[DescribeVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual node.
       */
    def describeVirtualNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual node.
       */
    def describeVirtualNode(params: DescribeVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[DescribeVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual node.
       */
    def describeVirtualNode(
      params: DescribeVirtualNodeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual router.
       */
    def describeVirtualRouter(): awsDashSdkLib.libRequestMod.Request[DescribeVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual router.
       */
    def describeVirtualRouter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual router.
       */
    def describeVirtualRouter(params: DescribeVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[DescribeVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an existing virtual router.
       */
    def describeVirtualRouter(
      params: DescribeVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing service meshes.
       */
    def listMeshes(): awsDashSdkLib.libRequestMod.Request[ListMeshesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing service meshes.
       */
    def listMeshes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMeshesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMeshesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing service meshes.
       */
    def listMeshes(params: ListMeshesInput): awsDashSdkLib.libRequestMod.Request[ListMeshesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing service meshes.
       */
    def listMeshes(
      params: ListMeshesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMeshesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMeshesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing routes in a service mesh.
       */
    def listRoutes(): awsDashSdkLib.libRequestMod.Request[ListRoutesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing routes in a service mesh.
       */
    def listRoutes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoutesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoutesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing routes in a service mesh.
       */
    def listRoutes(params: ListRoutesInput): awsDashSdkLib.libRequestMod.Request[ListRoutesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing routes in a service mesh.
       */
    def listRoutes(
      params: ListRoutesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRoutesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRoutesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual nodes.
       */
    def listVirtualNodes(): awsDashSdkLib.libRequestMod.Request[ListVirtualNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual nodes.
       */
    def listVirtualNodes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualNodesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual nodes.
       */
    def listVirtualNodes(params: ListVirtualNodesInput): awsDashSdkLib.libRequestMod.Request[ListVirtualNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual nodes.
       */
    def listVirtualNodes(
      params: ListVirtualNodesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualNodesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual routers in a service mesh.
       */
    def listVirtualRouters(): awsDashSdkLib.libRequestMod.Request[ListVirtualRoutersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual routers in a service mesh.
       */
    def listVirtualRouters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualRoutersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualRoutersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual routers in a service mesh.
       */
    def listVirtualRouters(params: ListVirtualRoutersInput): awsDashSdkLib.libRequestMod.Request[ListVirtualRoutersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of existing virtual routers in a service mesh.
       */
    def listVirtualRouters(
      params: ListVirtualRoutersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualRoutersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualRoutersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing route for a specified service mesh and virtual router.
       */
    def updateRoute(): awsDashSdkLib.libRequestMod.Request[UpdateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing route for a specified service mesh and virtual router.
       */
    def updateRoute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing route for a specified service mesh and virtual router.
       */
    def updateRoute(params: UpdateRouteInput): awsDashSdkLib.libRequestMod.Request[UpdateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing route for a specified service mesh and virtual router.
       */
    def updateRoute(
      params: UpdateRouteInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRouteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual node in a specified service mesh.
       */
    def updateVirtualNode(): awsDashSdkLib.libRequestMod.Request[UpdateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual node in a specified service mesh.
       */
    def updateVirtualNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual node in a specified service mesh.
       */
    def updateVirtualNode(params: UpdateVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[UpdateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual node in a specified service mesh.
       */
    def updateVirtualNode(
      params: UpdateVirtualNodeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual router in a specified service mesh.
       */
    def updateVirtualRouter(): awsDashSdkLib.libRequestMod.Request[UpdateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual router in a specified service mesh.
       */
    def updateVirtualRouter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual router in a specified service mesh.
       */
    def updateVirtualRouter(params: UpdateVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[UpdateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing virtual router in a specified service mesh.
       */
    def updateVirtualRouter(
      params: UpdateVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateRouteInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which the route resides.
         */
    var meshName: ResourceName
    /**
         * The name of the route to update.
         */
    var routeName: ResourceName
    /**
         * The new route specification to apply. This overwrites the existing data.
         */
    var spec: RouteSpec
    /**
         * The name of the virtual router with which the route is associated.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait UpdateRouteOutput extends js.Object {
    /**
         * A full description of the route that was updated.
         */
    var route: js.UndefOr[RouteData] = js.undefined
  }
  
  
  trait UpdateVirtualNodeInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which the virtual node resides.
         */
    var meshName: ResourceName
    /**
         * The new virtual node specification to apply. This overwrites the existing data.
         */
    var spec: VirtualNodeSpec
    /**
         * The name of the virtual node to update.
         */
    var virtualNodeName: ResourceName
  }
  
  
  trait UpdateVirtualNodeOutput extends js.Object {
    /**
         * A full description of the virtual node that was updated.
         */
    var virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
  }
  
  
  trait UpdateVirtualRouterInput extends js.Object {
    /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
         */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the service mesh in which the virtual router resides.
         */
    var meshName: ResourceName
    /**
         * The new virtual router specification to apply. This overwrites the existing data.
         */
    var spec: VirtualRouterSpec
    /**
         * The name of the virtual router to update.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait UpdateVirtualRouterOutput extends js.Object {
    /**
         * A full description of the virtual router that was updated.
         */
    var virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
  }
  
  
  trait VirtualNodeData extends js.Object {
    /**
         * The name of the service mesh in which the virtual node resides.
         */
    var meshName: ResourceName
    /**
         * The associated metadata for the virtual node.
         */
    var metadata: js.UndefOr[ResourceMetadata] = js.undefined
    /**
         * The specifications of the virtual node.
         */
    var spec: js.UndefOr[VirtualNodeSpec] = js.undefined
    /**
         * The current status for the virtual node.
         */
    var status: js.UndefOr[VirtualNodeStatus] = js.undefined
    /**
         * The name of the virtual node.
         */
    var virtualNodeName: ResourceName
  }
  
  
  trait VirtualNodeRef extends js.Object {
    /**
         * The full Amazon Resource Name (ARN) for the virtual node.
         */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the service mesh in which the virtual node resides.
         */
    var meshName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the virtual node.
         */
    var virtualNodeName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait VirtualNodeSpec extends js.Object {
    /**
         * The backends to which the virtual node is expected to send outbound traffic.
         */
    var backends: js.UndefOr[Backends] = js.undefined
    /**
         * The listeners from which the virtual node is expected to receive inbound traffic.
         */
    var listeners: js.UndefOr[Listeners] = js.undefined
    /**
         * The service discovery information for the virtual node.
         */
    var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
  }
  
  
  trait VirtualNodeStatus extends js.Object {
    /**
         * The current status of the virtual node.
         */
    var status: js.UndefOr[VirtualNodeStatusCode] = js.undefined
  }
  
  
  trait VirtualRouterData extends js.Object {
    /**
         * The name of the service mesh in which the virtual router resides.
         */
    var meshName: ResourceName
    /**
         * The associated metadata for the virtual router.
         */
    var metadata: js.UndefOr[ResourceMetadata] = js.undefined
    /**
         * The specifications of the virtual router.
         */
    var spec: js.UndefOr[VirtualRouterSpec] = js.undefined
    /**
         * The current status of the virtual router.
         */
    var status: js.UndefOr[VirtualRouterStatus] = js.undefined
    /**
         * The name of the virtual router.
         */
    var virtualRouterName: ResourceName
  }
  
  
  trait VirtualRouterRef extends js.Object {
    /**
         * The full Amazon Resource Name (ARN) for the virtual router.
         */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the service mesh in which the virtual router resides.
         */
    var meshName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the virtual router.
         */
    var virtualRouterName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait VirtualRouterSpec extends js.Object {
    /**
         * The service mesh service names to associate with the virtual router.
         */
    var serviceNames: js.UndefOr[ServiceNames] = js.undefined
  }
  
  
  trait VirtualRouterStatus extends js.Object {
    /**
         * The current status of the virtual router.
         */
    var status: js.UndefOr[VirtualRouterStatusCode] = js.undefined
  }
  
  
  trait WeightedTarget extends js.Object {
    /**
         * The virtual node to associate with the weighted target.
         */
    var virtualNode: js.UndefOr[ResourceName] = js.undefined
    /**
         * The relative weight of the weighted target.
         */
    var weight: js.UndefOr[PercentInt] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type Backends = js.Array[ServiceName]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DurationMillis = scala.Double
  type ListMeshesLimit = scala.Double
  type ListRoutesLimit = scala.Double
  type ListVirtualNodesLimit = scala.Double
  type ListVirtualRoutersLimit = scala.Double
  type Listeners = js.Array[Listener]
  type Long = scala.Double
  type MeshList = js.Array[MeshRef]
  type MeshStatusCode = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type NonNegativeInt = scala.Double
  type PercentInt = scala.Double
  type PortNumber = scala.Double
  type PortProtocol = awsDashSdkLib.awsDashSdkLibStrings.http | awsDashSdkLib.awsDashSdkLibStrings.tcp | java.lang.String
  type ResourceName = java.lang.String
  type RouteList = js.Array[RouteRef]
  type RouteStatusCode = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type ServiceName = java.lang.String
  type ServiceNames = js.Array[ServiceName]
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  type VirtualNodeStatusCode = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterStatusCode = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.INACTIVE | java.lang.String
  type WeightedTargets = js.Array[WeightedTarget]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-10-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

