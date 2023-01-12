package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainValidationRecord extends StObject {
  
  /**
    * An object that describes the state of the canonical name (CNAME) records that are automatically added by Lightsail to the DNS of the domain to validate domain ownership.
    */
  var dnsRecordCreationState: js.UndefOr[DnsRecordCreationState] = js.undefined
  
  /**
    * The domain name of the certificate validation record. For example, example.com or www.example.com.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
    */
  var resourceRecord: js.UndefOr[ResourceRecord] = js.undefined
  
  /**
    * The validation status of the record.
    */
  var validationStatus: js.UndefOr[CertificateDomainValidationStatus] = js.undefined
}
object DomainValidationRecord {
  
  inline def apply(): DomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainValidationRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainValidationRecord] (val x: Self) extends AnyVal {
    
    inline def setDnsRecordCreationState(value: DnsRecordCreationState): Self = StObject.set(x, "dnsRecordCreationState", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordCreationStateUndefined: Self = StObject.set(x, "dnsRecordCreationState", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setResourceRecord(value: ResourceRecord): Self = StObject.set(x, "resourceRecord", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordUndefined: Self = StObject.set(x, "resourceRecord", js.undefined)
    
    inline def setValidationStatus(value: CertificateDomainValidationStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
  }
}
