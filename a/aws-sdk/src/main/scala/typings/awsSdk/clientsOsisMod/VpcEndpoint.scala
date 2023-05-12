package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpoint extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for your VPC. Amazon Web Services PrivateLink generates this value when you create a VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the VPC, including associated subnets and security groups.
    */
  var VpcOptions: js.UndefOr[typings.awsSdk.clientsOsisMod.VpcOptions] = js.undefined
}
object VpcEndpoint {
  
  inline def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcOptions(value: VpcOptions): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
    
    inline def setVpcOptionsUndefined: Self = StObject.set(x, "VpcOptions", js.undefined)
  }
}
