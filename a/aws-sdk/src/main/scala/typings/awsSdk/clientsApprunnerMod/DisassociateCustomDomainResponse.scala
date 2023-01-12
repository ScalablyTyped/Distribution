package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateCustomDomainResponse extends StObject {
  
  /**
    * A description of the domain name that's being disassociated.
    */
  var CustomDomain: typings.awsSdk.clientsApprunnerMod.CustomDomain
  
  /**
    * The App Runner subdomain of the App Runner service. The disassociated custom domain name was mapped to this target name.
    */
  var DNSTarget: String
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that a custom domain name is disassociated from.
    */
  var ServiceArn: AppRunnerResourceArn
  
  /**
    * DNS Target records for the custom domains of this Amazon VPC. 
    */
  var VpcDNSTargets: VpcDNSTargetList
}
object DisassociateCustomDomainResponse {
  
  inline def apply(
    CustomDomain: CustomDomain,
    DNSTarget: String,
    ServiceArn: AppRunnerResourceArn,
    VpcDNSTargets: VpcDNSTargetList
  ): DisassociateCustomDomainResponse = {
    val __obj = js.Dynamic.literal(CustomDomain = CustomDomain.asInstanceOf[js.Any], DNSTarget = DNSTarget.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any], VpcDNSTargets = VpcDNSTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateCustomDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomDomain(value: CustomDomain): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    inline def setDNSTarget(value: String): Self = StObject.set(x, "DNSTarget", value.asInstanceOf[js.Any])
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setVpcDNSTargets(value: VpcDNSTargetList): Self = StObject.set(x, "VpcDNSTargets", value.asInstanceOf[js.Any])
    
    inline def setVpcDNSTargetsVarargs(value: VpcDNSTarget*): Self = StObject.set(x, "VpcDNSTargets", js.Array(value*))
  }
}
