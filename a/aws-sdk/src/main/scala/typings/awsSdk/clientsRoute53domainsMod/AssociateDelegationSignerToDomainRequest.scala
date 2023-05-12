package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDelegationSignerToDomainRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * The information about a key, including the algorithm, public key-value, and flags.
    */
  var SigningAttributes: DnssecSigningAttributes
}
object AssociateDelegationSignerToDomainRequest {
  
  inline def apply(DomainName: DomainName, SigningAttributes: DnssecSigningAttributes): AssociateDelegationSignerToDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], SigningAttributes = SigningAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDelegationSignerToDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateDelegationSignerToDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setSigningAttributes(value: DnssecSigningAttributes): Self = StObject.set(x, "SigningAttributes", value.asInstanceOf[js.Any])
  }
}
