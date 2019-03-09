package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/appmesh", "AppMesh")
@js.native
object AppMeshNs extends js.Object {
  trait Backend extends js.Object {
    /**
      * Specifies a virtual service to use as a backend for a virtual node. 
      */
    var virtualService: js.UndefOr[VirtualServiceBackend] = js.undefined
  }
  
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
    var mesh: MeshData
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
    var route: RouteData
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
    var virtualNode: VirtualNodeData
  }
  
  trait CreateVirtualRouterInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh to create the virtual router in.
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
    var virtualRouter: VirtualRouterData
  }
  
  trait CreateVirtualServiceInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh in which to create the virtual service.
      */
    var meshName: ResourceName
    /**
      * The virtual service specification to apply.
      */
    var spec: VirtualServiceSpec
    /**
      * The name to use for the virtual service.
      */
    var virtualServiceName: ServiceName
  }
  
  trait CreateVirtualServiceOutput extends js.Object {
    /**
      * The full description of your virtual service following the create call.
      */
    var virtualService: VirtualServiceData
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
    var mesh: MeshData
  }
  
  trait DeleteRouteInput extends js.Object {
    /**
      * The name of the service mesh to delete the route in.
      */
    var meshName: ResourceName
    /**
      * The name of the route to delete.
      */
    var routeName: ResourceName
    /**
      * The name of the virtual router to delete the route in.
      */
    var virtualRouterName: ResourceName
  }
  
  trait DeleteRouteOutput extends js.Object {
    /**
      * The route that was deleted.
      */
    var route: RouteData
  }
  
  trait DeleteVirtualNodeInput extends js.Object {
    /**
      * The name of the service mesh to delete the virtual node in.
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
    var virtualNode: VirtualNodeData
  }
  
  trait DeleteVirtualRouterInput extends js.Object {
    /**
      * The name of the service mesh to delete the virtual router in.
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
    var virtualRouter: VirtualRouterData
  }
  
  trait DeleteVirtualServiceInput extends js.Object {
    /**
      * The name of the service mesh to delete the virtual service in.
      */
    var meshName: ResourceName
    /**
      * The name of the virtual service to delete.
      */
    var virtualServiceName: ServiceName
  }
  
  trait DeleteVirtualServiceOutput extends js.Object {
    /**
      * The virtual service that was deleted.
      */
    var virtualService: VirtualServiceData
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
    var mesh: MeshData
  }
  
  trait DescribeRouteInput extends js.Object {
    /**
      * The name of the service mesh that the route resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the route to describe.
      */
    var routeName: ResourceName
    /**
      * The name of the virtual router that the route is associated with.
      */
    var virtualRouterName: ResourceName
  }
  
  trait DescribeRouteOutput extends js.Object {
    /**
      * The full description of your route.
      */
    var route: RouteData
  }
  
  trait DescribeVirtualNodeInput extends js.Object {
    /**
      * The name of the service mesh that the virtual node resides in.
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
    var virtualNode: VirtualNodeData
  }
  
  trait DescribeVirtualRouterInput extends js.Object {
    /**
      * The name of the service mesh that the virtual router resides in.
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
    var virtualRouter: VirtualRouterData
  }
  
  trait DescribeVirtualServiceInput extends js.Object {
    /**
      * The name of the service mesh that the virtual service resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the virtual service to describe.
      */
    var virtualServiceName: ServiceName
  }
  
  trait DescribeVirtualServiceOutput extends js.Object {
    /**
      * The full description of your virtual service.
      */
    var virtualService: VirtualServiceData
  }
  
  trait DnsServiceDiscovery extends js.Object {
    /**
      * Specifies the DNS service discovery hostname for the virtual node. 
      */
    var hostname: Hostname
  }
  
  trait HealthCheckPolicy extends js.Object {
    /**
      * The number of consecutive successful health checks that must occur before declaring
      listener healthy.
      */
    var healthyThreshold: HealthCheckThreshold
    /**
      * The time period in milliseconds between each health check execution.
      */
    var intervalMillis: HealthCheckIntervalMillis
    /**
      * The destination path for the health check request. This is required only if the
      specified protocol is HTTP. If the protocol is TCP, this parameter is ignored.
      */
    var path: js.UndefOr[String] = js.undefined
    /**
      * The destination port for the health check request. This port must match the port defined
      in the PortMapping for the listener.
      */
    var port: js.UndefOr[PortNumber] = js.undefined
    /**
      * The protocol for the health check request.
      */
    var protocol: PortProtocol
    /**
      * The amount of time to wait when receiving a response from the health check, in
      milliseconds.
      */
    var timeoutMillis: HealthCheckTimeoutMillis
    /**
      * The number of consecutive failed health checks that must occur before declaring a
      virtual node unhealthy. 
      */
    var unhealthyThreshold: HealthCheckThreshold
  }
  
  trait HttpRoute extends js.Object {
    /**
      * The action to take if a match is determined.
      */
    var action: HttpRouteAction
    /**
      * The criteria for determining an HTTP request match.
      */
    var `match`: HttpRouteMatch
  }
  
  trait HttpRouteAction extends js.Object {
    /**
      * The targets that traffic is routed to when a request matches the route. You can specify
      one or more targets and their relative weights to distribute traffic with.
      */
    var weightedTargets: WeightedTargets
  }
  
  trait HttpRouteMatch extends js.Object {
    /**
      * Specifies the path to match requests with. This parameter must always start with
      /, which by itself matches all requests to the virtual router service name.
      You can also match for path-based routing of requests. For example, if your virtual router
      service name is my-service.local and you want the route to match requests to
      my-service.local/metrics, your prefix should be
      /metrics.
      */
    var prefix: String
  }
  
  trait ListMeshesInput extends js.Object {
    /**
      * The maximum number of results returned by ListMeshes in paginated output.
      When you use this parameter, ListMeshes returns only limit
      results in a single page along with a nextToken response element. You can see the
      remaining results of the initial request by sending another
      ListMeshes request with the returned nextToken value. This
      value can be between 1 and 100. If you don't use this parameter,
      ListMeshes returns up to 100 results and a
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
      limit, you can use this value to retrieve the next page of
      results. This value is null when there are no more results to
      return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListRoutesInput extends js.Object {
    /**
      * The maximum number of results returned by ListRoutes in paginated output.
      When you use this parameter, ListRoutes returns only limit
      results in a single page along with a nextToken response element. You can see the
      remaining results of the initial request by sending another
      ListRoutes request with the returned nextToken value. This
      value can be between 1 and 100. If you don't use this parameter,
      ListRoutes returns up to 100 results and a
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
      * The name of the virtual router to list routes in.
      */
    var virtualRouterName: ResourceName
  }
  
  trait ListRoutesOutput extends js.Object {
    /**
      * The nextToken value to include in a future ListRoutes
      request. When the results of a ListRoutes request exceed
      limit, you can use this value to retrieve the next page of
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
      * The maximum number of results returned by ListVirtualNodes in paginated
      output. When you use this parameter, ListVirtualNodes returns only
      limit results in a single page along with a nextToken response
      element. You can see the remaining results of the initial request by sending another
      ListVirtualNodes request with the returned nextToken value.
      This value can be between 1 and 100. If you don't use this parameter,
      ListVirtualNodes returns up to 100 results and a
      nextToken value if applicable.
      */
    var limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined
    /**
      * The name of the service mesh to list virtual nodes in.
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
      limit, you can use this value to retrieve the next page of
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
      * The maximum number of results returned by ListVirtualRouters in paginated
      output. When you use this parameter, ListVirtualRouters returns only
      limit results in a single page along with a nextToken response
      element. You can see the remaining results of the initial request  by sending another
      ListVirtualRouters request with the returned nextToken value.
      This value can be between 1 and 100. If you don't use this parameter, 
      ListVirtualRouters returns up to 100 results and
      a nextToken value if applicable.
      */
    var limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined
    /**
      * The name of the service mesh to list virtual routers in.
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
      limit, you can use this value to retrieve the next page of
      results. This value is null when there are no more results to
      return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The list of existing virtual routers for the specified service mesh.
      */
    var virtualRouters: VirtualRouterList
  }
  
  trait ListVirtualServicesInput extends js.Object {
    /**
      * The maximum number of results returned by ListVirtualServices in paginated
      output. When you use this parameter, ListVirtualServices returns only
      limit results in a single page along with a nextToken response
      element. You can see the remaining results of the initial request by sending another
      ListVirtualServices request with the returned nextToken value.
      This value can be between 1 and 100. If you don't use this parameter,
      ListVirtualServices returns up to 100 results and
      a nextToken value if applicable.
      */
    var limit: js.UndefOr[ListVirtualServicesLimit] = js.undefined
    /**
      * The name of the service mesh to list virtual services in.
      */
    var meshName: ResourceName
    /**
      * The nextToken value returned from a previous paginated
      ListVirtualServices request where limit was used and the
      results exceeded the value of that parameter. Pagination continues from the end of the
      previous results that returned the nextToken value.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListVirtualServicesOutput extends js.Object {
    /**
      * The nextToken value to include in a future ListVirtualServices
      request. When the results of a ListVirtualServices request exceed
      limit, you can use this value to retrieve the next page of results. This
      value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * The list of existing virtual services for the specified service mesh.
      */
    var virtualServices: VirtualServiceList
  }
  
  trait Listener extends js.Object {
    /**
      * The health check information for the listener.
      */
    var healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined
    /**
      * The port mapping information for the listener.
      */
    var portMapping: PortMapping
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
    var status: MeshStatus
  }
  
  trait MeshRef extends js.Object {
    /**
      * The full Amazon Resource Name (ARN) of the service mesh.
      */
    var arn: Arn
    /**
      * The name of the service mesh.
      */
    var meshName: ResourceName
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
    var port: PortNumber
    /**
      * The protocol used for the port mapping.
      */
    var protocol: PortProtocol
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
    var arn: Arn
    /**
      * The Unix epoch timestamp in seconds for when the resource was created.
      */
    var createdAt: Timestamp
    /**
      * The Unix epoch timestamp in seconds for when the resource was last updated.
      */
    var lastUpdatedAt: Timestamp
    /**
      * The unique identifier for the resource.
      */
    var uid: String
    /**
      * The version of the resource. Resources are created at version 1, and this version is
      incremented each time that they're updated.
      */
    var version: Long
  }
  
  trait RouteData extends js.Object {
    /**
      * The name of the service mesh that the route resides in.
      */
    var meshName: ResourceName
    /**
      * The associated metadata for the route.
      */
    var metadata: ResourceMetadata
    /**
      * The name of the route.
      */
    var routeName: ResourceName
    /**
      * The specifications of the route.
      */
    var spec: RouteSpec
    /**
      * The status of the route.
      */
    var status: RouteStatus
    /**
      * The virtual router that the route is associated with.
      */
    var virtualRouterName: ResourceName
  }
  
  trait RouteRef extends js.Object {
    /**
      * The full Amazon Resource Name (ARN) for the route.
      */
    var arn: Arn
    /**
      * The name of the service mesh that the route resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the route.
      */
    var routeName: ResourceName
    /**
      * The virtual router that the route is associated with.
      */
    var virtualRouterName: ResourceName
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
    var status: RouteStatusCode
  }
  
  trait ServiceDiscovery extends js.Object {
    /**
      * Specifies the DNS information for the virtual node.
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
      After you create your service mesh, you can create virtual services, virtual nodes,
      virtual routers, and routes to distribute traffic between the applications in your
      mesh.
      */
    def createMesh(): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
      After you create your service mesh, you can create virtual services, virtual nodes,
      virtual routers, and routes to distribute traffic between the applications in your
      mesh.
      */
    def createMesh(params: CreateMeshInput): awsDashSdkLib.libRequestMod.Request[CreateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
      DNS service discovery hostname for your task group.
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
      DNS service discovery hostname for your task group.
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
      Any inbound traffic that your virtual router expects should be specified as a
      listener. 
      Virtual routers handle traffic for one or more service names within your mesh. After you
      create your virtual router, create and associate routes for your virtual router that direct
      incoming requests to different virtual nodes.
      */
    def createVirtualRouter(): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualRouter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new virtual router within a service mesh.
      Any inbound traffic that your virtual router expects should be specified as a
      listener. 
      Virtual routers handle traffic for one or more service names within your mesh. After you
      create your virtual router, create and associate routes for your virtual router that direct
      incoming requests to different virtual nodes.
      */
    def createVirtualRouter(params: CreateVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualRouter(
      params: CreateVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a virtual service within a service mesh.
      A virtual service is an abstraction of a real service that is either provided by a
      virtual node directly, or indirectly by means of a virtual router. Dependent services call
      your virtual service by its virtualServiceName, and those requests are routed
      to the virtual node or virtual router that is specified as the provider for the virtual
      service.
      */
    def createVirtualService(): awsDashSdkLib.libRequestMod.Request[CreateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a virtual service within a service mesh.
      A virtual service is an abstraction of a real service that is either provided by a
      virtual node directly, or indirectly by means of a virtual router. Dependent services call
      your virtual service by its virtualServiceName, and those requests are routed
      to the virtual node or virtual router that is specified as the provider for the virtual
      service.
      */
    def createVirtualService(params: CreateVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[CreateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVirtualService(
      params: CreateVirtualServiceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing service mesh.
      You must delete all resources (virtual services, routes, virtual routers, virtual nodes)
      in the service mesh before you can delete the mesh itself.
      */
    def deleteMesh(): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMesh(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing service mesh.
      You must delete all resources (virtual services, routes, virtual routers, virtual nodes)
      in the service mesh before you can delete the mesh itself.
      */
    def deleteMesh(params: DeleteMeshInput): awsDashSdkLib.libRequestMod.Request[DeleteMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
      You must delete any virtual services that list a virtual node as a service provider
      before you can delete the virtual node itself.
      */
    def deleteVirtualNode(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVirtualNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualNodeOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing virtual node.
      You must delete any virtual services that list a virtual node as a service provider
      before you can delete the virtual node itself.
      */
    def deleteVirtualNode(params: DeleteVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[DeleteVirtualNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def deleteVirtualRouter(
      params: DeleteVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing virtual service.
      */
    def deleteVirtualService(): awsDashSdkLib.libRequestMod.Request[DeleteVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVirtualService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing virtual service.
      */
    def deleteVirtualService(params: DeleteVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[DeleteVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVirtualService(
      params: DeleteVirtualServiceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing service mesh.
      */
    def describeMesh(): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMesh(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMeshOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing service mesh.
      */
    def describeMesh(params: DescribeMeshInput): awsDashSdkLib.libRequestMod.Request[DescribeMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def describeVirtualRouter(
      params: DescribeVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing virtual service.
      */
    def describeVirtualService(): awsDashSdkLib.libRequestMod.Request[DescribeVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVirtualService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an existing virtual service.
      */
    def describeVirtualService(params: DescribeVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[DescribeVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVirtualService(
      params: DescribeVirtualServiceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of existing service meshes.
      */
    def listMeshes(): awsDashSdkLib.libRequestMod.Request[ListMeshesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def listVirtualRouters(
      params: ListVirtualRoutersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualRoutersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualRoutersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of existing virtual services in a service mesh.
      */
    def listVirtualServices(): awsDashSdkLib.libRequestMod.Request[ListVirtualServicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVirtualServices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualServicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualServicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of existing virtual services in a service mesh.
      */
    def listVirtualServices(params: ListVirtualServicesInput): awsDashSdkLib.libRequestMod.Request[ListVirtualServicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVirtualServices(
      params: ListVirtualServicesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVirtualServicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVirtualServicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing route for a specified service mesh and virtual router.
      */
    def updateRoute(): awsDashSdkLib.libRequestMod.Request[UpdateRouteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def updateVirtualRouter(
      params: UpdateVirtualRouterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualRouterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualRouterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing virtual service in a specified service mesh.
      */
    def updateVirtualService(): awsDashSdkLib.libRequestMod.Request[UpdateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVirtualService(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing virtual service in a specified service mesh.
      */
    def updateVirtualService(params: UpdateVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[UpdateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVirtualService(
      params: UpdateVirtualServiceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVirtualServiceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVirtualServiceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateRouteInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh that the route resides in.
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
      * The name of the virtual router that the route is associated with.
      */
    var virtualRouterName: ResourceName
  }
  
  trait UpdateRouteOutput extends js.Object {
    /**
      * A full description of the route that was updated.
      */
    var route: RouteData
  }
  
  trait UpdateVirtualNodeInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh that the virtual node resides in.
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
    var virtualNode: VirtualNodeData
  }
  
  trait UpdateVirtualRouterInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh that the virtual router resides in.
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
    var virtualRouter: VirtualRouterData
  }
  
  trait UpdateVirtualServiceInput extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
    request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
      */
    var clientToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the service mesh that the virtual service resides in.
      */
    var meshName: ResourceName
    /**
      * The new virtual service specification to apply. This overwrites the existing
      data.
      */
    var spec: VirtualServiceSpec
    /**
      * The name of the virtual service to update.
      */
    var virtualServiceName: ServiceName
  }
  
  trait UpdateVirtualServiceOutput extends js.Object {
    /**
      * A full description of the virtual service that was updated.
      */
    var virtualService: VirtualServiceData
  }
  
  trait VirtualNodeData extends js.Object {
    /**
      * The name of the service mesh that the virtual node resides in.
      */
    var meshName: ResourceName
    /**
      * The associated metadata for the virtual node.
      */
    var metadata: ResourceMetadata
    /**
      * The specifications of the virtual node.
      */
    var spec: VirtualNodeSpec
    /**
      * The current status for the virtual node.
      */
    var status: VirtualNodeStatus
    /**
      * The name of the virtual node.
      */
    var virtualNodeName: ResourceName
  }
  
  trait VirtualNodeRef extends js.Object {
    /**
      * The full Amazon Resource Name (ARN) for the virtual node.
      */
    var arn: Arn
    /**
      * The name of the service mesh that the virtual node resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the virtual node.
      */
    var virtualNodeName: ResourceName
  }
  
  trait VirtualNodeServiceProvider extends js.Object {
    /**
      * The name of the virtual node that is acting as a service provider.
      */
    var virtualNodeName: ResourceName
  }
  
  trait VirtualNodeSpec extends js.Object {
    /**
      * The backends that the virtual node is expected to send outbound traffic to.
      */
    var backends: js.UndefOr[Backends] = js.undefined
    /**
      * The listeners that the virtual node is expected to receive inbound traffic from. Currently only one listener is supported per virtual node.
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
    var status: VirtualNodeStatusCode
  }
  
  trait VirtualRouterData extends js.Object {
    /**
      * The name of the service mesh that the virtual router resides in.
      */
    var meshName: ResourceName
    /**
      * The associated metadata for the virtual router.
      */
    var metadata: ResourceMetadata
    /**
      * The specifications of the virtual router.
      */
    var spec: VirtualRouterSpec
    /**
      * The current status of the virtual router.
      */
    var status: VirtualRouterStatus
    /**
      * The name of the virtual router.
      */
    var virtualRouterName: ResourceName
  }
  
  trait VirtualRouterListener extends js.Object {
    var portMapping: PortMapping
  }
  
  trait VirtualRouterRef extends js.Object {
    /**
      * The full Amazon Resource Name (ARN) for the virtual router.
      */
    var arn: Arn
    /**
      * The name of the service mesh that the virtual router resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the virtual router.
      */
    var virtualRouterName: ResourceName
  }
  
  trait VirtualRouterServiceProvider extends js.Object {
    /**
      * The name of the virtual router that is acting as a service provider.
      */
    var virtualRouterName: ResourceName
  }
  
  trait VirtualRouterSpec extends js.Object {
    /**
      * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is supported per virtual router.
      */
    var listeners: VirtualRouterListeners
  }
  
  trait VirtualRouterStatus extends js.Object {
    /**
      * The current status of the virtual router.
      */
    var status: VirtualRouterStatusCode
  }
  
  trait VirtualServiceBackend extends js.Object {
    /**
      * The name of the virtual service that is acting as a virtual node backend.
      */
    var virtualServiceName: ServiceName
  }
  
  trait VirtualServiceData extends js.Object {
    /**
      * The name of the service mesh that the virtual service resides in.
      */
    var meshName: ResourceName
    var metadata: ResourceMetadata
    /**
      * The specifications of the virtual service.
      */
    var spec: VirtualServiceSpec
    /**
      * The current status of the virtual service.
      */
    var status: VirtualServiceStatus
    /**
      * The name of the virtual service.
      */
    var virtualServiceName: ServiceName
  }
  
  trait VirtualServiceProvider extends js.Object {
    /**
      * The virtual node associated with a virtual service.
      */
    var virtualNode: js.UndefOr[VirtualNodeServiceProvider] = js.undefined
    /**
      * The virtual router associated with a virtual service.
      */
    var virtualRouter: js.UndefOr[VirtualRouterServiceProvider] = js.undefined
  }
  
  trait VirtualServiceRef extends js.Object {
    /**
      * The full Amazon Resource Name (ARN) for the virtual service.
      */
    var arn: Arn
    /**
      * The name of the service mesh that the virtual service resides in.
      */
    var meshName: ResourceName
    /**
      * The name of the virtual service.
      */
    var virtualServiceName: ServiceName
  }
  
  trait VirtualServiceSpec extends js.Object {
    /**
      * The App Mesh object that is acting as the provider for a virtual service. You can specify
      a single virtual node or virtual router.
      */
    var provider: js.UndefOr[VirtualServiceProvider] = js.undefined
  }
  
  trait VirtualServiceStatus extends js.Object {
    /**
      * The current status of the virtual service.
      */
    var status: VirtualServiceStatusCode
  }
  
  trait WeightedTarget extends js.Object {
    /**
      * The virtual node to associate with the weighted target.
      */
    var virtualNode: ResourceName
    /**
      * The relative weight of the weighted target.
      */
    var weight: PercentInt
  }
  
  trait _MeshStatusCode extends js.Object
  
  trait _PortProtocol extends js.Object
  
  trait _RouteStatusCode extends js.Object
  
  trait _VirtualNodeStatusCode extends js.Object
  
  trait _VirtualRouterStatusCode extends js.Object
  
  trait _VirtualServiceStatusCode extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type Backends = js.Array[Backend]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
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
  type MeshStatusCode = _MeshStatusCode | java.lang.String
  type PercentInt = scala.Double
  type PortNumber = scala.Double
  type PortProtocol = _PortProtocol | java.lang.String
  type ResourceName = java.lang.String
  type RouteList = js.Array[RouteRef]
  type RouteStatusCode = _RouteStatusCode | java.lang.String
  type ServiceName = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  type VirtualNodeStatusCode = _VirtualNodeStatusCode | java.lang.String
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterListeners = js.Array[VirtualRouterListener]
  type VirtualRouterStatusCode = _VirtualRouterStatusCode | java.lang.String
  type VirtualServiceList = js.Array[VirtualServiceRef]
  type VirtualServiceStatusCode = _VirtualServiceStatusCode | java.lang.String
  type WeightedTargets = js.Array[WeightedTarget]
  type apiVersion = _apiVersion | java.lang.String
}

