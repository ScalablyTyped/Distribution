package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDomain extends StObject {
  
  /**
    * A list of certificate CNAME records that's used for this domain name.
    */
  var CertificateValidationRecords: js.UndefOr[CertificateValidationRecordList] = js.undefined
  
  /**
    * An associated custom domain endpoint. It can be a root domain (for example, example.com), a subdomain (for example, login.example.com or admin.login.example.com), or a wildcard (for example, *.example.com).
    */
  var DomainName: typings.awsSdk.clientsApprunnerMod.DomainName
  
  /**
    * When true, the subdomain www.DomainName  is associated with the App Runner service in addition to the base domain.
    */
  var EnableWWWSubdomain: NullableBoolean
  
  /**
    * The current state of the domain name association.
    */
  var Status: CustomDomainAssociationStatus
}
object CustomDomain {
  
  inline def apply(DomainName: DomainName, EnableWWWSubdomain: NullableBoolean, Status: CustomDomainAssociationStatus): CustomDomain = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], EnableWWWSubdomain = EnableWWWSubdomain.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomDomain] (val x: Self) extends AnyVal {
    
    inline def setCertificateValidationRecords(value: CertificateValidationRecordList): Self = StObject.set(x, "CertificateValidationRecords", value.asInstanceOf[js.Any])
    
    inline def setCertificateValidationRecordsUndefined: Self = StObject.set(x, "CertificateValidationRecords", js.undefined)
    
    inline def setCertificateValidationRecordsVarargs(value: CertificateValidationRecord*): Self = StObject.set(x, "CertificateValidationRecords", js.Array(value*))
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEnableWWWSubdomain(value: NullableBoolean): Self = StObject.set(x, "EnableWWWSubdomain", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CustomDomainAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
