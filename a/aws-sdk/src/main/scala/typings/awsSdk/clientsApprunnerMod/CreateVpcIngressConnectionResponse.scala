package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcIngressConnectionResponse extends StObject {
  
  /**
    * A description of the App Runner VPC Ingress Connection resource that's created by this request. 
    */
  var VpcIngressConnection: typings.awsSdk.clientsApprunnerMod.VpcIngressConnection
}
object CreateVpcIngressConnectionResponse {
  
  inline def apply(VpcIngressConnection: VpcIngressConnection): CreateVpcIngressConnectionResponse = {
    val __obj = js.Dynamic.literal(VpcIngressConnection = VpcIngressConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcIngressConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcIngressConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcIngressConnection(value: VpcIngressConnection): Self = StObject.set(x, "VpcIngressConnection", value.asInstanceOf[js.Any])
  }
}
