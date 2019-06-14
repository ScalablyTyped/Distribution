package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppMesh
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppMesh: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a service mesh. A service mesh is a logical boundary for network traffic between
    the services that reside within it.
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
    * Creates a service mesh. A service mesh is a logical boundary for network traffic between
    the services that reside within it.
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
    * Creates a route that is associated with a virtual router.
    You can use the prefix parameter in your route specification for path-based
    routing of requests. For example, if your virtual service name is
    my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
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
    * Creates a route that is associated with a virtual router.
    You can use the prefix parameter in your route specification for path-based
    routing of requests. For example, if your virtual service name is
    my-service.local and you want the route to match requests to
    my-service.local/metrics, your prefix should be
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
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you can specify the
    service discovery information for your task group.
    Any inbound traffic that your virtual node expects should be specified as a
    listener. Any outbound traffic that your virtual node expects to reach
    should be specified as a backend.
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
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you can specify the
    service discovery information for your task group.
    Any inbound traffic that your virtual node expects should be specified as a
    listener. Any outbound traffic that your virtual node expects to reach
    should be specified as a backend.
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
    * Creates a virtual router within a service mesh.
    Any inbound traffic that your virtual router expects should be specified as a
    listener. 
    Virtual routers handle traffic for one or more virtual services within your mesh. After
    you create your virtual router, create and associate routes for your virtual router that
    direct incoming requests to different virtual nodes.
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
    * Creates a virtual router within a service mesh.
    Any inbound traffic that your virtual router expects should be specified as a
    listener. 
    Virtual routers handle traffic for one or more virtual services within your mesh. After
    you create your virtual router, create and associate routes for your virtual router that
    direct incoming requests to different virtual nodes.
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
    A virtual service is an abstraction of a real service that is provided by a virtual node
    directly or indirectly by means of a virtual router. Dependent services call your virtual
    service by its virtualServiceName, and those requests are routed to the
    virtual node or virtual router that is specified as the provider for the virtual
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
    A virtual service is an abstraction of a real service that is provided by a virtual node
    directly or indirectly by means of a virtual router. Dependent services call your virtual
    service by its virtualServiceName, and those requests are routed to the
    virtual node or virtual router that is specified as the provider for the virtual
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
    You must delete all resources (virtual services, routes, virtual routers, and virtual
    nodes) in the service mesh before you can delete the mesh itself.
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
    You must delete all resources (virtual services, routes, virtual routers, and virtual
    nodes) in the service mesh before you can delete the mesh itself.
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
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Associates the specified tags to a resource with the specified resourceArn.
    If existing tags on a resource aren't specified in the request parameters, they aren't
    changed. When a resource is deleted, the tags associated with that resource are also
    deleted.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn.
    If existing tags on a resource aren't specified in the request parameters, they aren't
    changed. When a resource is deleted, the tags associated with that resource are also
    deleted.
    */
  def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(): awsDashSdkLib.libRequestMod.Request[UpdateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMesh(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(params: UpdateMeshInput): awsDashSdkLib.libRequestMod.Request[UpdateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMesh(
    params: UpdateMeshInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMeshOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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

