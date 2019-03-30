package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppMesh
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppMesh: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ClientConfiguration = js.native
  /**
    * Creates a service mesh. A service mesh is a logical boundary for network traffic
    between the services that reside within it.
    After you create your service mesh, you can create virtual services, virtual nodes,
    virtual routers, and routes to distribute traffic between the applications in your
    mesh.
    */
  def createMesh(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMesh(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a service mesh. A service mesh is a logical boundary for network traffic
    between the services that reside within it.
    After you create your service mesh, you can create virtual services, virtual nodes,
    virtual routers, and routes to distribute traffic between the applications in your
    mesh.
    */
  def createMesh(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMesh(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def createRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def createRoute(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRoute(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you must specify the
    DNS service discovery hostname for your task group.
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
  def createVirtualNode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual node within a service mesh.
    A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
    service or a Kubernetes deployment. When you create a virtual node, you must specify the
    DNS service discovery hostname for your task group.
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
  def createVirtualNode(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualNode(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual router within a service mesh.
    Any inbound traffic that your virtual router expects should be specified as a
    listener. 
    Virtual routers handle traffic for one or more virtual services within your mesh. After
    you create your virtual router, create and associate routes for your virtual router that
    direct incoming requests to different virtual nodes.
    */
  def createVirtualRouter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualRouter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual router within a service mesh.
    Any inbound traffic that your virtual router expects should be specified as a
    listener. 
    Virtual routers handle traffic for one or more virtual services within your mesh. After
    you create your virtual router, create and associate routes for your virtual router that
    direct incoming requests to different virtual nodes.
    */
  def createVirtualRouter(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualRouter(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual service within a service mesh.
    A virtual service is an abstraction of a real service that is provided by a
    virtual node directly or indirectly by means of a virtual router. Dependent services call
    your virtual service by its virtualServiceName, and those requests are routed
    to the virtual node or virtual router that is specified as the provider for the virtual
    service.
    */
  def createVirtualService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a virtual service within a service mesh.
    A virtual service is an abstraction of a real service that is provided by a
    virtual node directly or indirectly by means of a virtual router. Dependent services call
    your virtual service by its virtualServiceName, and those requests are routed
    to the virtual node or virtual router that is specified as the provider for the virtual
    service.
    */
  def createVirtualService(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVirtualService(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.CreateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing service mesh.
    You must delete all resources (virtual services, routes, virtual routers, and virtual nodes)
    in the service mesh before you can delete the mesh itself.
    */
  def deleteMesh(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMesh(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing service mesh.
    You must delete all resources (virtual services, routes, virtual routers, and virtual nodes)
    in the service mesh before you can delete the mesh itself.
    */
  def deleteMesh(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMesh(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing route.
    */
  def deleteRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing route.
    */
  def deleteRoute(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRoute(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual node.
    You must delete any virtual services that list a virtual node as a service provider
    before you can delete the virtual node itself.
    */
  def deleteVirtualNode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual node.
    You must delete any virtual services that list a virtual node as a service provider
    before you can delete the virtual node itself.
    */
  def deleteVirtualNode(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualNode(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual router.
    You must delete any routes associated with the virtual router before you can delete the
    router itself.
    */
  def deleteVirtualRouter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualRouter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual router.
    You must delete any routes associated with the virtual router before you can delete the
    router itself.
    */
  def deleteVirtualRouter(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualRouter(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual service.
    */
  def deleteVirtualService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing virtual service.
    */
  def deleteVirtualService(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVirtualService(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DeleteVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing service mesh.
    */
  def describeMesh(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMesh(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing service mesh.
    */
  def describeMesh(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMesh(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing route.
    */
  def describeRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing route.
    */
  def describeRoute(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRoute(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual node.
    */
  def describeVirtualNode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual node.
    */
  def describeVirtualNode(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualNode(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual router.
    */
  def describeVirtualRouter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualRouter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual router.
    */
  def describeVirtualRouter(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualRouter(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual service.
    */
  def describeVirtualService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an existing virtual service.
    */
  def describeVirtualService(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVirtualService(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.DescribeVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing service meshes.
    */
  def listMeshes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMeshes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing service meshes.
    */
  def listMeshes(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMeshes(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListMeshesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing routes in a service mesh.
    */
  def listRoutes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRoutes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing routes in a service mesh.
    */
  def listRoutes(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRoutes(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListRoutesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for an App Mesh resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual nodes.
    */
  def listVirtualNodes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualNodes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual nodes.
    */
  def listVirtualNodes(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualNodes(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualNodesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual routers in a service mesh.
    */
  def listVirtualRouters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualRouters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual routers in a service mesh.
    */
  def listVirtualRouters(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualRouters(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualRoutersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual services in a service mesh.
    */
  def listVirtualServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing virtual services in a service mesh.
    */
  def listVirtualServices(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVirtualServices(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.ListVirtualServicesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified tags to a resource with the specified
    resourceArn. If existing tags on a resource aren't specified in the
    request parameters, they aren't changed. When a resource is deleted, the tags
    associated with that resource are also deleted.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified tags to a resource with the specified
    resourceArn. If existing tags on a resource aren't specified in the
    request parameters, they aren't changed. When a resource is deleted, the tags
    associated with that resource are also deleted.
    */
  def tagResource(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMesh(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing service mesh.
    */
  def updateMesh(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMesh(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateMeshOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing route for a specified service mesh and virtual router.
    */
  def updateRoute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRoute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing route for a specified service mesh and virtual router.
    */
  def updateRoute(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRoute(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateRouteOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual node in a specified service mesh.
    */
  def updateVirtualNode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual node in a specified service mesh.
    */
  def updateVirtualNode(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualNode(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualNodeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual router in a specified service mesh.
    */
  def updateVirtualRouter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualRouter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual router in a specified service mesh.
    */
  def updateVirtualRouter(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualRouter(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualRouterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual service in a specified service mesh.
    */
  def updateVirtualService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing virtual service in a specified service mesh.
    */
  def updateVirtualService(params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVirtualService(
    params: awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppmeshMod.AppMeshNs.UpdateVirtualServiceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

