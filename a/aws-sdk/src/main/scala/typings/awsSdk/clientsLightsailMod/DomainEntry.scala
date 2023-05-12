package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEntry extends StObject {
  
  /**
    * The ID of the domain recordset entry.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When true, specifies whether the domain entry is an alias used by the Lightsail load balancer, Lightsail container service, Lightsail content delivery network (CDN) distribution, or another Amazon Web Services resource. You can include an alias (A type) record in your request, which points to the DNS name of a load balancer, container service, CDN distribution, or other Amazon Web Services resource and routes traffic to that resource.
    */
  var isAlias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[DomainName] = js.undefined
  
  /**
    * (Deprecated) The options for the domain entry.  In releases prior to November 29, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var options: js.UndefOr[DomainEntryOptions] = js.undefined
  
  /**
    * The target IP address (e.g., 192.0.2.0), or AWS name server (e.g., ns-111.awsdns-22.com.). For Lightsail load balancers, the value looks like ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com. For Lightsail distributions, the value looks like exampled1182ne.cloudfront.net. For Lightsail container services, the value looks like container-service-1.example23scljs.us-west-2.cs.amazonlightsail.com. Be sure to also set isAlias to true when setting up an A record for a Lightsail load balancer, distribution, or container service.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The type of domain entry, such as address for IPv4 (A), address for IPv6 (AAAA), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The following domain entry types can be used:    A     AAAA     CNAME     MX     NS     SOA     SRV     TXT   
    */
  var `type`: js.UndefOr[DomainEntryType] = js.undefined
}
object DomainEntry {
  
  inline def apply(): DomainEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsAlias(value: Boolean): Self = StObject.set(x, "isAlias", value.asInstanceOf[js.Any])
    
    inline def setIsAliasUndefined: Self = StObject.set(x, "isAlias", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: DomainEntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: DomainEntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
