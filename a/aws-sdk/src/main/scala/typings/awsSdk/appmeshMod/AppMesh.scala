package typings.awsSdk.appmeshMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppMesh extends Service {
  @JSName("config")
  var config_AppMesh: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a gateway route.
    A gateway route is attached to a virtual gateway and routes traffic to an existing
    virtual service. If a route matches a request, it can distribute traffic to a target virtual service.
    For more information about gateway routes, see Gateway routes.
    */
  def createGatewayRoute(): Request[CreateGatewayRouteOutput, AWSError] = js.native
  def createGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayRouteOutput, Unit]): Request[CreateGatewayRouteOutput, AWSError] = js.native
  /**
    * Creates a gateway route.
    A gateway route is attached to a virtual gateway and routes traffic to an existing
    virtual service. If a route matches a request, it can distribute traffic to a target virtual service.
    For more information about gateway routes, see Gateway routes.
    */
  def createGatewayRoute(params: CreateGatewayRouteInput): Request[CreateGatewayRouteOutput, AWSError] = js.native
  def createGatewayRoute(
    params: CreateGatewayRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayRouteOutput, Unit]
  ): Request[CreateGatewayRouteOutput, AWSError] = js.native
  /**
    * Creates a service mesh.
    A service mesh is a logical boundary for network traffic between services that are
    represented by resources within the mesh. After you create your service mesh, you can
    create virtual services, virtual nodes, virtual routers, and routes to distribute traffic
    between the applications in your mesh.
    For more information about service meshes, see Service meshes.
    */
  def createMesh(): Request[CreateMeshOutput, AWSError] = js.native
  def createMesh(callback: js.Function2[/* err */ AWSError, /* data */ CreateMeshOutput, Unit]): Request[CreateMeshOutput, AWSError] = js.native
  /**
    * Creates a service mesh.
    A service mesh is a logical boundary for network traffic between services that are
    represented by resources within the mesh. After you create your service mesh, you can
    create virtual services, virtual nodes, virtual routers, and routes to distribute traffic
    between the applications in your mesh.
    For more information about service meshes, see Service meshes.
    */
  def createMesh(params: CreateMeshInput): Request[CreateMeshOutput, AWSError] = js.native
  def createMesh(
    params: CreateMeshInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMeshOutput, Unit]
  ): Request[CreateMeshOutput, AWSError] = js.native
  /**
    * Creates a route that is associated with a virtual router.
    You can route several different protocols and define a retry policy for a route.
    Traffic can be routed to one or more virtual nodes.
    For more information about routes, see Routes.
    */
  def createRoute(): Request[CreateRouteOutput, AWSError] = js.native
  def createRoute(callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteOutput, Unit]): Request[CreateRouteOutput, AWSError] = js.native
  /**
    * Creates a route that is associated with a virtual router.
    You can route several different protocols and define a retry policy for a route.
    Traffic can be routed to one or more virtual nodes.
    For more information about routes, see Routes.
    */
  def createRoute(params: CreateRouteInput): Request[CreateRouteOutput, AWSError] = js.native
  def createRoute(
    params: CreateRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRouteOutput, Unit]
  ): Request[CreateRouteOutput, AWSError] = js.native
  /**
    * Creates a virtual gateway.
    A virtual gateway allows resources outside your mesh to communicate to resources that
    are inside your mesh. The virtual gateway represents an Envoy proxy running in an Amazon ECS
    task, in a Kubernetes service, or on an Amazon EC2 instance. Unlike a virtual node, which
    represents an Envoy running with an application, a virtual gateway represents Envoy deployed by itself.
    For more information about virtual gateways, see Virtual gateways.
    */
  def createVirtualGateway(): Request[CreateVirtualGatewayOutput, AWSError] = js.native
  def createVirtualGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualGatewayOutput, Unit]): Request[CreateVirtualGatewayOutput, AWSError] = js.native
  /**
    * Creates a virtual gateway.
    A virtual gateway allows resources outside your mesh to communicate to resources that
    are inside your mesh. The virtual gateway represents an Envoy proxy running in an Amazon ECS
    task, in a Kubernetes service, or on an Amazon EC2 instance. Unlike a virtual node, which
    represents an Envoy running with an application, a virtual gateway represents Envoy deployed by itself.
    For more information about virtual gateways, see Virtual gateways.
    */
  def createVirtualGateway(params: CreateVirtualGatewayInput): Request[CreateVirtualGatewayOutput, AWSError] = js.native
  def createVirtualGateway(
    params: CreateVirtualGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualGatewayOutput, Unit]
  ): Request[CreateVirtualGatewayOutput, AWSError] = js.native
  /**
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you can specify the
    service discovery information for your task group, and whether the proxy running in a task
    group will communicate with other proxies using Transport Layer Security (TLS).
    You define a listener for any inbound traffic that your virtual node
    expects. Any virtual service that your virtual node expects to communicate to is specified
    as a backend.
    The response metadata for your new virtual node contains the arn that is
    associated with the virtual node. Set this value (either the full ARN or the truncated
    resource name: for example, mesh/default/virtualNode/simpleapp) as the
    APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
    proxy container in your task definition or pod spec. This is then mapped to the
    node.id and node.cluster Envoy parameters.
    
    If you require your Envoy stats or tracing to use a different name, you can override
    the node.cluster value that is set by
    APPMESH_VIRTUAL_NODE_NAME with the
    APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
    
    For more information about virtual nodes, see Virtual nodes.
    */
  def createVirtualNode(): Request[CreateVirtualNodeOutput, AWSError] = js.native
  def createVirtualNode(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualNodeOutput, Unit]): Request[CreateVirtualNodeOutput, AWSError] = js.native
  /**
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you can specify the
    service discovery information for your task group, and whether the proxy running in a task
    group will communicate with other proxies using Transport Layer Security (TLS).
    You define a listener for any inbound traffic that your virtual node
    expects. Any virtual service that your virtual node expects to communicate to is specified
    as a backend.
    The response metadata for your new virtual node contains the arn that is
    associated with the virtual node. Set this value (either the full ARN or the truncated
    resource name: for example, mesh/default/virtualNode/simpleapp) as the
    APPMESH_VIRTUAL_NODE_NAME environment variable for your task group's Envoy
    proxy container in your task definition or pod spec. This is then mapped to the
    node.id and node.cluster Envoy parameters.
    
    If you require your Envoy stats or tracing to use a different name, you can override
    the node.cluster value that is set by
    APPMESH_VIRTUAL_NODE_NAME with the
    APPMESH_VIRTUAL_NODE_CLUSTER environment variable.
    
    For more information about virtual nodes, see Virtual nodes.
    */
  def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput, AWSError] = js.native
  def createVirtualNode(
    params: CreateVirtualNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualNodeOutput, Unit]
  ): Request[CreateVirtualNodeOutput, AWSError] = js.native
  /**
    * Creates a virtual router within a service mesh.
    Specify a listener for any inbound traffic that your virtual router
    receives. Create a virtual router for each protocol and port that you need to route.
    Virtual routers handle traffic for one or more virtual services within your mesh. After you
    create your virtual router, create and associate routes for your virtual router that direct
    incoming requests to different virtual nodes.
    For more information about virtual routers, see Virtual routers.
    */
  def createVirtualRouter(): Request[CreateVirtualRouterOutput, AWSError] = js.native
  def createVirtualRouter(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualRouterOutput, Unit]): Request[CreateVirtualRouterOutput, AWSError] = js.native
  /**
    * Creates a virtual router within a service mesh.
    Specify a listener for any inbound traffic that your virtual router
    receives. Create a virtual router for each protocol and port that you need to route.
    Virtual routers handle traffic for one or more virtual services within your mesh. After you
    create your virtual router, create and associate routes for your virtual router that direct
    incoming requests to different virtual nodes.
    For more information about virtual routers, see Virtual routers.
    */
  def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput, AWSError] = js.native
  def createVirtualRouter(
    params: CreateVirtualRouterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualRouterOutput, Unit]
  ): Request[CreateVirtualRouterOutput, AWSError] = js.native
  /**
    * Creates a virtual service within a service mesh.
    A virtual service is an abstraction of a real service that is provided by a virtual node
    directly or indirectly by means of a virtual router. Dependent services call your virtual
    service by its virtualServiceName, and those requests are routed to the
    virtual node or virtual router that is specified as the provider for the virtual
    service.
    For more information about virtual services, see Virtual services.
    */
  def createVirtualService(): Request[CreateVirtualServiceOutput, AWSError] = js.native
  def createVirtualService(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualServiceOutput, Unit]): Request[CreateVirtualServiceOutput, AWSError] = js.native
  /**
    * Creates a virtual service within a service mesh.
    A virtual service is an abstraction of a real service that is provided by a virtual node
    directly or indirectly by means of a virtual router. Dependent services call your virtual
    service by its virtualServiceName, and those requests are routed to the
    virtual node or virtual router that is specified as the provider for the virtual
    service.
    For more information about virtual services, see Virtual services.
    */
  def createVirtualService(params: CreateVirtualServiceInput): Request[CreateVirtualServiceOutput, AWSError] = js.native
  def createVirtualService(
    params: CreateVirtualServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualServiceOutput, Unit]
  ): Request[CreateVirtualServiceOutput, AWSError] = js.native
  /**
    * Deletes an existing gateway route.
    */
  def deleteGatewayRoute(): Request[DeleteGatewayRouteOutput, AWSError] = js.native
  def deleteGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayRouteOutput, Unit]): Request[DeleteGatewayRouteOutput, AWSError] = js.native
  /**
    * Deletes an existing gateway route.
    */
  def deleteGatewayRoute(params: DeleteGatewayRouteInput): Request[DeleteGatewayRouteOutput, AWSError] = js.native
  def deleteGatewayRoute(
    params: DeleteGatewayRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayRouteOutput, Unit]
  ): Request[DeleteGatewayRouteOutput, AWSError] = js.native
  /**
    * Deletes an existing service mesh.
    You must delete all resources (virtual services, routes, virtual routers, and virtual
    nodes) in the service mesh before you can delete the mesh itself.
    */
  def deleteMesh(): Request[DeleteMeshOutput, AWSError] = js.native
  def deleteMesh(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMeshOutput, Unit]): Request[DeleteMeshOutput, AWSError] = js.native
  /**
    * Deletes an existing service mesh.
    You must delete all resources (virtual services, routes, virtual routers, and virtual
    nodes) in the service mesh before you can delete the mesh itself.
    */
  def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput, AWSError] = js.native
  def deleteMesh(
    params: DeleteMeshInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMeshOutput, Unit]
  ): Request[DeleteMeshOutput, AWSError] = js.native
  /**
    * Deletes an existing route.
    */
  def deleteRoute(): Request[DeleteRouteOutput, AWSError] = js.native
  def deleteRoute(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteOutput, Unit]): Request[DeleteRouteOutput, AWSError] = js.native
  /**
    * Deletes an existing route.
    */
  def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput, AWSError] = js.native
  def deleteRoute(
    params: DeleteRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRouteOutput, Unit]
  ): Request[DeleteRouteOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual gateway. You cannot delete a virtual gateway if any gateway
    routes are associated to it.
    */
  def deleteVirtualGateway(): Request[DeleteVirtualGatewayOutput, AWSError] = js.native
  def deleteVirtualGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualGatewayOutput, Unit]): Request[DeleteVirtualGatewayOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual gateway. You cannot delete a virtual gateway if any gateway
    routes are associated to it.
    */
  def deleteVirtualGateway(params: DeleteVirtualGatewayInput): Request[DeleteVirtualGatewayOutput, AWSError] = js.native
  def deleteVirtualGateway(
    params: DeleteVirtualGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualGatewayOutput, Unit]
  ): Request[DeleteVirtualGatewayOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual node.
    You must delete any virtual services that list a virtual node as a service provider
    before you can delete the virtual node itself.
    */
  def deleteVirtualNode(): Request[DeleteVirtualNodeOutput, AWSError] = js.native
  def deleteVirtualNode(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualNodeOutput, Unit]): Request[DeleteVirtualNodeOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual node.
    You must delete any virtual services that list a virtual node as a service provider
    before you can delete the virtual node itself.
    */
  def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput, AWSError] = js.native
  def deleteVirtualNode(
    params: DeleteVirtualNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualNodeOutput, Unit]
  ): Request[DeleteVirtualNodeOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual router.
    You must delete any routes associated with the virtual router before you can delete the
    router itself.
    */
  def deleteVirtualRouter(): Request[DeleteVirtualRouterOutput, AWSError] = js.native
  def deleteVirtualRouter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualRouterOutput, Unit]): Request[DeleteVirtualRouterOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual router.
    You must delete any routes associated with the virtual router before you can delete the
    router itself.
    */
  def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput, AWSError] = js.native
  def deleteVirtualRouter(
    params: DeleteVirtualRouterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualRouterOutput, Unit]
  ): Request[DeleteVirtualRouterOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual service.
    */
  def deleteVirtualService(): Request[DeleteVirtualServiceOutput, AWSError] = js.native
  def deleteVirtualService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualServiceOutput, Unit]): Request[DeleteVirtualServiceOutput, AWSError] = js.native
  /**
    * Deletes an existing virtual service.
    */
  def deleteVirtualService(params: DeleteVirtualServiceInput): Request[DeleteVirtualServiceOutput, AWSError] = js.native
  def deleteVirtualService(
    params: DeleteVirtualServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualServiceOutput, Unit]
  ): Request[DeleteVirtualServiceOutput, AWSError] = js.native
  /**
    * Describes an existing gateway route.
    */
  def describeGatewayRoute(): Request[DescribeGatewayRouteOutput, AWSError] = js.native
  def describeGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayRouteOutput, Unit]): Request[DescribeGatewayRouteOutput, AWSError] = js.native
  /**
    * Describes an existing gateway route.
    */
  def describeGatewayRoute(params: DescribeGatewayRouteInput): Request[DescribeGatewayRouteOutput, AWSError] = js.native
  def describeGatewayRoute(
    params: DescribeGatewayRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayRouteOutput, Unit]
  ): Request[DescribeGatewayRouteOutput, AWSError] = js.native
  /**
    * Describes an existing service mesh.
    */
  def describeMesh(): Request[DescribeMeshOutput, AWSError] = js.native
  def describeMesh(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMeshOutput, Unit]): Request[DescribeMeshOutput, AWSError] = js.native
  /**
    * Describes an existing service mesh.
    */
  def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput, AWSError] = js.native
  def describeMesh(
    params: DescribeMeshInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMeshOutput, Unit]
  ): Request[DescribeMeshOutput, AWSError] = js.native
  /**
    * Describes an existing route.
    */
  def describeRoute(): Request[DescribeRouteOutput, AWSError] = js.native
  def describeRoute(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteOutput, Unit]): Request[DescribeRouteOutput, AWSError] = js.native
  /**
    * Describes an existing route.
    */
  def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput, AWSError] = js.native
  def describeRoute(
    params: DescribeRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRouteOutput, Unit]
  ): Request[DescribeRouteOutput, AWSError] = js.native
  /**
    * Describes an existing virtual gateway.
    */
  def describeVirtualGateway(): Request[DescribeVirtualGatewayOutput, AWSError] = js.native
  def describeVirtualGateway(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualGatewayOutput, Unit]): Request[DescribeVirtualGatewayOutput, AWSError] = js.native
  /**
    * Describes an existing virtual gateway.
    */
  def describeVirtualGateway(params: DescribeVirtualGatewayInput): Request[DescribeVirtualGatewayOutput, AWSError] = js.native
  def describeVirtualGateway(
    params: DescribeVirtualGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualGatewayOutput, Unit]
  ): Request[DescribeVirtualGatewayOutput, AWSError] = js.native
  /**
    * Describes an existing virtual node.
    */
  def describeVirtualNode(): Request[DescribeVirtualNodeOutput, AWSError] = js.native
  def describeVirtualNode(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualNodeOutput, Unit]): Request[DescribeVirtualNodeOutput, AWSError] = js.native
  /**
    * Describes an existing virtual node.
    */
  def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput, AWSError] = js.native
  def describeVirtualNode(
    params: DescribeVirtualNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualNodeOutput, Unit]
  ): Request[DescribeVirtualNodeOutput, AWSError] = js.native
  /**
    * Describes an existing virtual router.
    */
  def describeVirtualRouter(): Request[DescribeVirtualRouterOutput, AWSError] = js.native
  def describeVirtualRouter(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualRouterOutput, Unit]): Request[DescribeVirtualRouterOutput, AWSError] = js.native
  /**
    * Describes an existing virtual router.
    */
  def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput, AWSError] = js.native
  def describeVirtualRouter(
    params: DescribeVirtualRouterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualRouterOutput, Unit]
  ): Request[DescribeVirtualRouterOutput, AWSError] = js.native
  /**
    * Describes an existing virtual service.
    */
  def describeVirtualService(): Request[DescribeVirtualServiceOutput, AWSError] = js.native
  def describeVirtualService(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualServiceOutput, Unit]): Request[DescribeVirtualServiceOutput, AWSError] = js.native
  /**
    * Describes an existing virtual service.
    */
  def describeVirtualService(params: DescribeVirtualServiceInput): Request[DescribeVirtualServiceOutput, AWSError] = js.native
  def describeVirtualService(
    params: DescribeVirtualServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualServiceOutput, Unit]
  ): Request[DescribeVirtualServiceOutput, AWSError] = js.native
  /**
    * Returns a list of existing gateway routes that are associated to a virtual
    gateway.
    */
  def listGatewayRoutes(): Request[ListGatewayRoutesOutput, AWSError] = js.native
  def listGatewayRoutes(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayRoutesOutput, Unit]): Request[ListGatewayRoutesOutput, AWSError] = js.native
  /**
    * Returns a list of existing gateway routes that are associated to a virtual
    gateway.
    */
  def listGatewayRoutes(params: ListGatewayRoutesInput): Request[ListGatewayRoutesOutput, AWSError] = js.native
  def listGatewayRoutes(
    params: ListGatewayRoutesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayRoutesOutput, Unit]
  ): Request[ListGatewayRoutesOutput, AWSError] = js.native
  /**
    * Returns a list of existing service meshes.
    */
  def listMeshes(): Request[ListMeshesOutput, AWSError] = js.native
  def listMeshes(callback: js.Function2[/* err */ AWSError, /* data */ ListMeshesOutput, Unit]): Request[ListMeshesOutput, AWSError] = js.native
  /**
    * Returns a list of existing service meshes.
    */
  def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput, AWSError] = js.native
  def listMeshes(
    params: ListMeshesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMeshesOutput, Unit]
  ): Request[ListMeshesOutput, AWSError] = js.native
  /**
    * Returns a list of existing routes in a service mesh.
    */
  def listRoutes(): Request[ListRoutesOutput, AWSError] = js.native
  def listRoutes(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutesOutput, Unit]): Request[ListRoutesOutput, AWSError] = js.native
  /**
    * Returns a list of existing routes in a service mesh.
    */
  def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput, AWSError] = js.native
  def listRoutes(
    params: ListRoutesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutesOutput, Unit]
  ): Request[ListRoutesOutput, AWSError] = js.native
  /**
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual gateways in a service mesh.
    */
  def listVirtualGateways(): Request[ListVirtualGatewaysOutput, AWSError] = js.native
  def listVirtualGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualGatewaysOutput, Unit]): Request[ListVirtualGatewaysOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual gateways in a service mesh.
    */
  def listVirtualGateways(params: ListVirtualGatewaysInput): Request[ListVirtualGatewaysOutput, AWSError] = js.native
  def listVirtualGateways(
    params: ListVirtualGatewaysInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualGatewaysOutput, Unit]
  ): Request[ListVirtualGatewaysOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual nodes.
    */
  def listVirtualNodes(): Request[ListVirtualNodesOutput, AWSError] = js.native
  def listVirtualNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualNodesOutput, Unit]): Request[ListVirtualNodesOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual nodes.
    */
  def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput, AWSError] = js.native
  def listVirtualNodes(
    params: ListVirtualNodesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualNodesOutput, Unit]
  ): Request[ListVirtualNodesOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual routers in a service mesh.
    */
  def listVirtualRouters(): Request[ListVirtualRoutersOutput, AWSError] = js.native
  def listVirtualRouters(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualRoutersOutput, Unit]): Request[ListVirtualRoutersOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual routers in a service mesh.
    */
  def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput, AWSError] = js.native
  def listVirtualRouters(
    params: ListVirtualRoutersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualRoutersOutput, Unit]
  ): Request[ListVirtualRoutersOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual services in a service mesh.
    */
  def listVirtualServices(): Request[ListVirtualServicesOutput, AWSError] = js.native
  def listVirtualServices(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualServicesOutput, Unit]): Request[ListVirtualServicesOutput, AWSError] = js.native
  /**
    * Returns a list of existing virtual services in a service mesh.
    */
  def listVirtualServices(params: ListVirtualServicesInput): Request[ListVirtualServicesOutput, AWSError] = js.native
  def listVirtualServices(
    params: ListVirtualServicesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualServicesOutput, Unit]
  ): Request[ListVirtualServicesOutput, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn.
    If existing tags on a resource aren't specified in the request parameters, they aren't
    changed. When a resource is deleted, the tags associated with that resource are also
    deleted.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn.
    If existing tags on a resource aren't specified in the request parameters, they aren't
    changed. When a resource is deleted, the tags associated with that resource are also
    deleted.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Updates an existing gateway route that is associated to a specified virtual gateway in a
    service mesh.
    */
  def updateGatewayRoute(): Request[UpdateGatewayRouteOutput, AWSError] = js.native
  def updateGatewayRoute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayRouteOutput, Unit]): Request[UpdateGatewayRouteOutput, AWSError] = js.native
  /**
    * Updates an existing gateway route that is associated to a specified virtual gateway in a
    service mesh.
    */
  def updateGatewayRoute(params: UpdateGatewayRouteInput): Request[UpdateGatewayRouteOutput, AWSError] = js.native
  def updateGatewayRoute(
    params: UpdateGatewayRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayRouteOutput, Unit]
  ): Request[UpdateGatewayRouteOutput, AWSError] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(): Request[UpdateMeshOutput, AWSError] = js.native
  def updateMesh(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMeshOutput, Unit]): Request[UpdateMeshOutput, AWSError] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(params: UpdateMeshInput): Request[UpdateMeshOutput, AWSError] = js.native
  def updateMesh(
    params: UpdateMeshInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMeshOutput, Unit]
  ): Request[UpdateMeshOutput, AWSError] = js.native
  /**
    * Updates an existing route for a specified service mesh and virtual router.
    */
  def updateRoute(): Request[UpdateRouteOutput, AWSError] = js.native
  def updateRoute(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteOutput, Unit]): Request[UpdateRouteOutput, AWSError] = js.native
  /**
    * Updates an existing route for a specified service mesh and virtual router.
    */
  def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput, AWSError] = js.native
  def updateRoute(
    params: UpdateRouteInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRouteOutput, Unit]
  ): Request[UpdateRouteOutput, AWSError] = js.native
  /**
    * Updates an existing virtual gateway in a specified service mesh.
    */
  def updateVirtualGateway(): Request[UpdateVirtualGatewayOutput, AWSError] = js.native
  def updateVirtualGateway(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualGatewayOutput, Unit]): Request[UpdateVirtualGatewayOutput, AWSError] = js.native
  /**
    * Updates an existing virtual gateway in a specified service mesh.
    */
  def updateVirtualGateway(params: UpdateVirtualGatewayInput): Request[UpdateVirtualGatewayOutput, AWSError] = js.native
  def updateVirtualGateway(
    params: UpdateVirtualGatewayInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualGatewayOutput, Unit]
  ): Request[UpdateVirtualGatewayOutput, AWSError] = js.native
  /**
    * Updates an existing virtual node in a specified service mesh.
    */
  def updateVirtualNode(): Request[UpdateVirtualNodeOutput, AWSError] = js.native
  def updateVirtualNode(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualNodeOutput, Unit]): Request[UpdateVirtualNodeOutput, AWSError] = js.native
  /**
    * Updates an existing virtual node in a specified service mesh.
    */
  def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput, AWSError] = js.native
  def updateVirtualNode(
    params: UpdateVirtualNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualNodeOutput, Unit]
  ): Request[UpdateVirtualNodeOutput, AWSError] = js.native
  /**
    * Updates an existing virtual router in a specified service mesh.
    */
  def updateVirtualRouter(): Request[UpdateVirtualRouterOutput, AWSError] = js.native
  def updateVirtualRouter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualRouterOutput, Unit]): Request[UpdateVirtualRouterOutput, AWSError] = js.native
  /**
    * Updates an existing virtual router in a specified service mesh.
    */
  def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput, AWSError] = js.native
  def updateVirtualRouter(
    params: UpdateVirtualRouterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualRouterOutput, Unit]
  ): Request[UpdateVirtualRouterOutput, AWSError] = js.native
  /**
    * Updates an existing virtual service in a specified service mesh.
    */
  def updateVirtualService(): Request[UpdateVirtualServiceOutput, AWSError] = js.native
  def updateVirtualService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualServiceOutput, Unit]): Request[UpdateVirtualServiceOutput, AWSError] = js.native
  /**
    * Updates an existing virtual service in a specified service mesh.
    */
  def updateVirtualService(params: UpdateVirtualServiceInput): Request[UpdateVirtualServiceOutput, AWSError] = js.native
  def updateVirtualService(
    params: UpdateVirtualServiceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVirtualServiceOutput, Unit]
  ): Request[UpdateVirtualServiceOutput, AWSError] = js.native
}

