package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateDelegationSignerFromDomainRequest extends StObject {
  
  /**
    * Name of the domain.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * An internal identification number assigned to each DS record after it’s created. You can retrieve it as part of DNSSEC information returned by GetDomainDetail.
    */
  var Id: String
}
object DisassociateDelegationSignerFromDomainRequest {
  
  inline def apply(DomainName: DomainName, Id: String): DisassociateDelegationSignerFromDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDelegationSignerFromDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateDelegationSignerFromDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
