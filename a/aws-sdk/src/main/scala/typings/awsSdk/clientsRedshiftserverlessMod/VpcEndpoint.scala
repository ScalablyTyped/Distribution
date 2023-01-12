package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpoint extends StObject {
  
  /**
    * One or more network interfaces of the endpoint. Also known as an interface endpoint.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  
  /**
    * The connection endpoint ID for connecting to Amazon Redshift Serverless.
    */
  var vpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC identifier that the endpoint is associated with.
    */
  var vpcId: js.UndefOr[String] = js.undefined
}
object VpcEndpoint {
  
  inline def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
    
    inline def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
