package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateCustomDomainRequest extends StObject {
  
  /**
    * A custom domain endpoint to associate. Specify a root domain (for example, example.com), a subdomain (for example, login.example.com or admin.login.example.com), or a wildcard (for example, *.example.com).
    */
  var DomainName: typings.awsSdk.clientsApprunnerMod.DomainName
  
  /**
    * Set to true to associate the subdomain www.DomainName  with the App Runner service in addition to the base domain. Default: true 
    */
  var EnableWWWSubdomain: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to associate a custom domain name with.
    */
  var ServiceArn: AppRunnerResourceArn
}
object AssociateCustomDomainRequest {
  
  inline def apply(DomainName: DomainName, ServiceArn: AppRunnerResourceArn): AssociateCustomDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCustomDomainRequest]
  }
  
  extension [Self <: AssociateCustomDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEnableWWWSubdomain(value: NullableBoolean): Self = StObject.set(x, "EnableWWWSubdomain", value.asInstanceOf[js.Any])
    
    inline def setEnableWWWSubdomainUndefined: Self = StObject.set(x, "EnableWWWSubdomain", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
