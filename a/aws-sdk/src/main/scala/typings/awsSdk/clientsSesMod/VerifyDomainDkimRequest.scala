package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyDomainDkimRequest extends StObject {
  
  /**
    * The name of the domain to be verified for Easy DKIM signing.
    */
  var Domain: typings.awsSdk.clientsSesMod.Domain
}
object VerifyDomainDkimRequest {
  
  inline def apply(Domain: Domain): VerifyDomainDkimRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainDkimRequest]
  }
  
  extension [Self <: VerifyDomainDkimRequest](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
