package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDomainAvailabilityRequest extends StObject {
  
  /**
    * The name of the domain that you want to get availability for. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.   Internationalized domain names are not supported for some top-level domains. To determine whether the TLD that you want to use supports internationalized domain names, see Domains that You Can Register with Amazon Route 53. For more information, see Formatting Internationalized Domain Names. 
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.undefined
}
object CheckDomainAvailabilityRequest {
  
  inline def apply(DomainName: DomainName): CheckDomainAvailabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainAvailabilityRequest]
  }
  
  extension [Self <: CheckDomainAvailabilityRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIdnLangCode(value: LangCode): Self = StObject.set(x, "IdnLangCode", value.asInstanceOf[js.Any])
    
    inline def setIdnLangCodeUndefined: Self = StObject.set(x, "IdnLangCode", js.undefined)
  }
}
