package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcIngressConnectionResponse extends StObject {
  
  /**
    * A description of the App Runner VPC Ingress Connection resource that's updated by this request.
    */
  var VpcIngressConnection: typings.awsSdk.clientsApprunnerMod.VpcIngressConnection
}
object UpdateVpcIngressConnectionResponse {
  
  inline def apply(VpcIngressConnection: VpcIngressConnection): UpdateVpcIngressConnectionResponse = {
    val __obj = js.Dynamic.literal(VpcIngressConnection = VpcIngressConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcIngressConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcIngressConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcIngressConnection(value: VpcIngressConnection): Self = StObject.set(x, "VpcIngressConnection", value.asInstanceOf[js.Any])
  }
}
