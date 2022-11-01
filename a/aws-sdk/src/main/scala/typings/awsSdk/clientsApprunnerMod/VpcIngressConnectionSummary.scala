package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcIngressConnectionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection. 
    */
  var ServiceArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the VPC Ingress Connection. 
    */
  var VpcIngressConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
}
object VpcIngressConnectionSummary {
  
  inline def apply(): VpcIngressConnectionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIngressConnectionSummary]
  }
  
  extension [Self <: VpcIngressConnectionSummary](x: Self) {
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "ServiceArn", js.undefined)
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionArnUndefined: Self = StObject.set(x, "VpcIngressConnectionArn", js.undefined)
  }
}
