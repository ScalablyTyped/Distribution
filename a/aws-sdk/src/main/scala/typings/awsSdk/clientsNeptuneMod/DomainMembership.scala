package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMembership extends StObject {
  
  /**
    * The identifier of the Active Directory Domain.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified domain name of the Active Directory Domain.
    */
  var FQDN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  var IAMRoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DomainMembership {
  
  inline def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  
  extension [Self <: DomainMembership](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setFQDN(value: String): Self = StObject.set(x, "FQDN", value.asInstanceOf[js.Any])
    
    inline def setFQDNUndefined: Self = StObject.set(x, "FQDN", js.undefined)
    
    inline def setIAMRoleName(value: String): Self = StObject.set(x, "IAMRoleName", value.asInstanceOf[js.Any])
    
    inline def setIAMRoleNameUndefined: Self = StObject.set(x, "IAMRoleName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
