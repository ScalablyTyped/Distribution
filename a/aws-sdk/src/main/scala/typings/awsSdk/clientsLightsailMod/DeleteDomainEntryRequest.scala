package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainEntryRequest extends StObject {
  
  /**
    * An array of key-value pairs containing information about your domain entries.
    */
  var domainEntry: DomainEntry
  
  /**
    * The name of the domain entry to delete.
    */
  var domainName: DomainName
}
object DeleteDomainEntryRequest {
  
  inline def apply(domainEntry: DomainEntry, domainName: DomainName): DeleteDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainEntryRequest]
  }
  
  extension [Self <: DeleteDomainEntryRequest](x: Self) {
    
    inline def setDomainEntry(value: DomainEntry): Self = StObject.set(x, "domainEntry", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
