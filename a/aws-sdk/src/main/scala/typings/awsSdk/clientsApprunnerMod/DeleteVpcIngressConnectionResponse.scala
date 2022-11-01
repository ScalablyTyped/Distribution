package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcIngressConnectionResponse extends StObject {
  
  /**
    * A description of the App Runner VPC Ingress Connection that this request just deleted.
    */
  var VpcIngressConnection: typings.awsSdk.clientsApprunnerMod.VpcIngressConnection
}
object DeleteVpcIngressConnectionResponse {
  
  inline def apply(VpcIngressConnection: VpcIngressConnection): DeleteVpcIngressConnectionResponse = {
    val __obj = js.Dynamic.literal(VpcIngressConnection = VpcIngressConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcIngressConnectionResponse]
  }
  
  extension [Self <: DeleteVpcIngressConnectionResponse](x: Self) {
    
    inline def setVpcIngressConnection(value: VpcIngressConnection): Self = StObject.set(x, "VpcIngressConnection", value.asInstanceOf[js.Any])
  }
}
