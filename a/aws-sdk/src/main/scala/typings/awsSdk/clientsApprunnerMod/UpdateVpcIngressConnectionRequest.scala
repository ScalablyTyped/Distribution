package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcIngressConnectionRequest extends StObject {
  
  /**
    * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that are used to update the VPC Ingress Connection resource.
    */
  var IngressVpcConfiguration: typings.awsSdk.clientsApprunnerMod.IngressVpcConfiguration
  
  /**
    * The Amazon Resource Name (Arn) for the App Runner VPC Ingress Connection resource that you want to update.
    */
  var VpcIngressConnectionArn: AppRunnerResourceArn
}
object UpdateVpcIngressConnectionRequest {
  
  inline def apply(IngressVpcConfiguration: IngressVpcConfiguration, VpcIngressConnectionArn: AppRunnerResourceArn): UpdateVpcIngressConnectionRequest = {
    val __obj = js.Dynamic.literal(IngressVpcConfiguration = IngressVpcConfiguration.asInstanceOf[js.Any], VpcIngressConnectionArn = VpcIngressConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcIngressConnectionRequest]
  }
  
  extension [Self <: UpdateVpcIngressConnectionRequest](x: Self) {
    
    inline def setIngressVpcConfiguration(value: IngressVpcConfiguration): Self = StObject.set(x, "IngressVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
  }
}
