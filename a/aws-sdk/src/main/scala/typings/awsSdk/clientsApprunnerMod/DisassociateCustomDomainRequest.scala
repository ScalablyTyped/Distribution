package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateCustomDomainRequest extends StObject {
  
  /**
    * The domain name that you want to disassociate from the App Runner service.
    */
  var DomainName: typings.awsSdk.clientsApprunnerMod.DomainName
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want to disassociate a custom domain name from.
    */
  var ServiceArn: AppRunnerResourceArn
}
object DisassociateCustomDomainRequest {
  
  inline def apply(DomainName: DomainName, ServiceArn: AppRunnerResourceArn): DisassociateCustomDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCustomDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateCustomDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
