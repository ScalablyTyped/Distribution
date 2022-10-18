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
}
object DisassociateCustomDomainResponse {
  
  inline def apply(CustomDomain: CustomDomain, DNSTarget: String, ServiceArn: AppRunnerResourceArn): DisassociateCustomDomainResponse = {
    val __obj = js.Dynamic.literal(CustomDomain = CustomDomain.asInstanceOf[js.Any], DNSTarget = DNSTarget.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomDomainResponse]
  }
  
  extension [Self <: DisassociateCustomDomainResponse](x: Self) {
    
    inline def setCustomDomain(value: CustomDomain): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    inline def setDNSTarget(value: String): Self = StObject.set(x, "DNSTarget", value.asInstanceOf[js.Any])
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
