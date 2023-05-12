package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSummary extends StObject {
  
  /**
    * Indicates whether the domain is automatically renewed upon expiration.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain that the summary information applies to.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.DomainName] = js.undefined
  
  /**
    * Expiration date of the domain in Unix time format and Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.undefined
}
object DomainSummary {
  
  inline def apply(): DomainSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainSummary] (val x: Self) extends AnyVal {
    
    inline def setAutoRenew(value: Boolean): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setExpiry(value: js.Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
    
    inline def setTransferLock(value: Boolean): Self = StObject.set(x, "TransferLock", value.asInstanceOf[js.Any])
    
    inline def setTransferLockUndefined: Self = StObject.set(x, "TransferLock", js.undefined)
  }
}
