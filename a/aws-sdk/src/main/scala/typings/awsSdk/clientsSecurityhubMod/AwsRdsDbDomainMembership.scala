package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbDomainMembership extends StObject {
  
  /**
    * The identifier of the Active Directory domain.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The fully qualified domain name of the Active Directory domain.
    */
  var Fqdn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the IAM role to use when making API calls to the Directory Service.
    */
  var IamRoleName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the Active Directory Domain membership for the DB instance.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbDomainMembership {
  
  inline def apply(): AwsRdsDbDomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbDomainMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbDomainMembership] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: NonEmptyString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setFqdn(value: NonEmptyString): Self = StObject.set(x, "Fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnUndefined: Self = StObject.set(x, "Fqdn", js.undefined)
    
    inline def setIamRoleName(value: NonEmptyString): Self = StObject.set(x, "IamRoleName", value.asInstanceOf[js.Any])
    
    inline def setIamRoleNameUndefined: Self = StObject.set(x, "IamRoleName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
