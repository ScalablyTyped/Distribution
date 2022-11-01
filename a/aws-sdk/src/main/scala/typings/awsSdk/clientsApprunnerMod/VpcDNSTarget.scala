package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcDNSTarget extends StObject {
  
  /**
    * The domain name of your target DNS that is associated with the Amazon VPC.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.DomainName] = js.undefined
  
  /**
    * The ID of the Amazon VPC that is associated with the custom domain name of the target DNS.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the VPC Ingress Connection that is associated with your service.
    */
  var VpcIngressConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
}
object VpcDNSTarget {
  
  inline def apply(): VpcDNSTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDNSTarget]
  }
  
  extension [Self <: VpcDNSTarget](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionArnUndefined: Self = StObject.set(x, "VpcIngressConnectionArn", js.undefined)
  }
}
