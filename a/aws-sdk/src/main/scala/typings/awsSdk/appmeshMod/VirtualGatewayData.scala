package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayData extends StObject {
  
  /**
    * The name of the service mesh that the virtual gateway resides in.
    */
  var meshName: ResourceName = js.native
  
  var metadata: ResourceMetadata = js.native
  
  /**
    * The specifications of the virtual gateway.
    */
  var spec: VirtualGatewaySpec = js.native
  
  /**
    * The current status of the virtual gateway.
    */
  var status: VirtualGatewayStatus = js.native
  
  /**
    * The name of the virtual gateway.
    */
  var virtualGatewayName: ResourceName = js.native
}
object VirtualGatewayData {
  
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualGatewaySpec,
    status: VirtualGatewayStatus,
    virtualGatewayName: ResourceName
  ): VirtualGatewayData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayData]
  }
  
  @scala.inline
  implicit class VirtualGatewayDataMutableBuilder[Self <: VirtualGatewayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: VirtualGatewaySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: VirtualGatewayStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
