package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainEntryRequest extends StObject {
  
  /**
    * An array of key-value pairs containing information about the domain entry request.
    */
  var domainEntry: DomainEntry
  
  /**
    * The domain name (e.g., example.com) for which you want to create the domain entry.
    */
  var domainName: DomainName
}
object CreateDomainEntryRequest {
  
  inline def apply(domainEntry: DomainEntry, domainName: DomainName): CreateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainEntryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainEntryRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainEntry(value: DomainEntry): Self = StObject.set(x, "domainEntry", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
