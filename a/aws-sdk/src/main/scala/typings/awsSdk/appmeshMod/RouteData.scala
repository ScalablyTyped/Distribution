package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteData extends StObject {
  
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
object RouteData {
  
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    routeName: ResourceName,
    spec: RouteSpec,
    status: RouteStatus,
    virtualRouterName: ResourceName
  ): RouteData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteData]
  }
  
  @scala.inline
  implicit class RouteDataMutableBuilder[Self <: RouteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteName(value: ResourceName): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: RouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: RouteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
