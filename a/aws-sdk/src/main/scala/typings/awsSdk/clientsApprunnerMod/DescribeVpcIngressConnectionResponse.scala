package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcIngressConnectionResponse extends StObject {
  
  /**
    * A description of the App Runner VPC Ingress Connection that you specified in this request.
    */
  var VpcIngressConnection: typings.awsSdk.clientsApprunnerMod.VpcIngressConnection
}
object DescribeVpcIngressConnectionResponse {
  
  inline def apply(VpcIngressConnection: VpcIngressConnection): DescribeVpcIngressConnectionResponse = {
    val __obj = js.Dynamic.literal(VpcIngressConnection = VpcIngressConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcIngressConnectionResponse]
  }
  
  extension [Self <: DescribeVpcIngressConnectionResponse](x: Self) {
    
    inline def setVpcIngressConnection(value: VpcIngressConnection): Self = StObject.set(x, "VpcIngressConnection", value.asInstanceOf[js.Any])
  }
}
