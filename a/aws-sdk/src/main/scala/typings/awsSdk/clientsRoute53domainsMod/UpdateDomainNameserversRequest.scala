package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainNameserversRequest extends StObject {
  
  /**
    * The name of the domain that you want to change name servers for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * The authorization key for .fi domains
    */
  var FIAuthKey: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.FIAuthKey] = js.undefined
  
  /**
    * A list of new name servers for the domain.
    */
  var Nameservers: NameserverList
}
object UpdateDomainNameserversRequest {
  
  inline def apply(DomainName: DomainName, Nameservers: NameserverList): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
  
  extension [Self <: UpdateDomainNameserversRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFIAuthKey(value: FIAuthKey): Self = StObject.set(x, "FIAuthKey", value.asInstanceOf[js.Any])
    
    inline def setFIAuthKeyUndefined: Self = StObject.set(x, "FIAuthKey", js.undefined)
    
    inline def setNameservers(value: NameserverList): Self = StObject.set(x, "Nameservers", value.asInstanceOf[js.Any])
    
    inline def setNameserversVarargs(value: Nameserver*): Self = StObject.set(x, "Nameservers", js.Array(value*))
  }
}
