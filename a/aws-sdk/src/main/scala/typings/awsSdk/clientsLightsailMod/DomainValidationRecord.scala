package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainValidationRecord extends StObject {
  
  /**
    * The domain name of the certificate validation record. For example, example.com or www.example.com.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
    */
  var resourceRecord: js.UndefOr[ResourceRecord] = js.undefined
}
object DomainValidationRecord {
  
  inline def apply(): DomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainValidationRecord]
  }
  
  extension [Self <: DomainValidationRecord](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setResourceRecord(value: ResourceRecord): Self = StObject.set(x, "resourceRecord", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordUndefined: Self = StObject.set(x, "resourceRecord", js.undefined)
  }
}
