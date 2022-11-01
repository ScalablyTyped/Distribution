package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcIngressConnectionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner VPC Ingress Connection that you want to delete.
    */
  var VpcIngressConnectionArn: AppRunnerResourceArn
}
object DeleteVpcIngressConnectionRequest {
  
  inline def apply(VpcIngressConnectionArn: AppRunnerResourceArn): DeleteVpcIngressConnectionRequest = {
    val __obj = js.Dynamic.literal(VpcIngressConnectionArn = VpcIngressConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcIngressConnectionRequest]
  }
  
  extension [Self <: DeleteVpcIngressConnectionRequest](x: Self) {
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
  }
}
