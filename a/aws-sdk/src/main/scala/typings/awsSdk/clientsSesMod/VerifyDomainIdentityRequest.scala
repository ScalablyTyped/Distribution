package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyDomainIdentityRequest extends StObject {
  
  /**
    * The domain to be verified.
    */
  var Domain: typings.awsSdk.clientsSesMod.Domain
}
object VerifyDomainIdentityRequest {
  
  inline def apply(Domain: Domain): VerifyDomainIdentityRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainIdentityRequest]
  }
  
  extension [Self <: VerifyDomainIdentityRequest](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
