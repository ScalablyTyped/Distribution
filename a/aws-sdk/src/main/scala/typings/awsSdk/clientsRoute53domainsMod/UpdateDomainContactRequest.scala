package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainContactRequest extends StObject {
  
  /**
    * Provides detailed contact information.
    */
  var AdminContact: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * The name of the domain that you want to update contact information for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * Provides detailed contact information.
    */
  var TechContact: js.UndefOr[ContactDetail] = js.undefined
}
object UpdateDomainContactRequest {
  
  inline def apply(DomainName: DomainName): UpdateDomainContactRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactRequest]
  }
  
  extension [Self <: UpdateDomainContactRequest](x: Self) {
    
    inline def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
    inline def setAdminContactUndefined: Self = StObject.set(x, "AdminContact", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setRegistrantContact(value: ContactDetail): Self = StObject.set(x, "RegistrantContact", value.asInstanceOf[js.Any])
    
    inline def setRegistrantContactUndefined: Self = StObject.set(x, "RegistrantContact", js.undefined)
    
    inline def setTechContact(value: ContactDetail): Self = StObject.set(x, "TechContact", value.asInstanceOf[js.Any])
    
    inline def setTechContactUndefined: Self = StObject.set(x, "TechContact", js.undefined)
  }
}
