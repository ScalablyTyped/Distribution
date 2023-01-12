package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRequestAction extends StObject {
  
  /**
    * Indicates whether the targeted port is blocked.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain information for the API request.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The network connection protocol observed in the activity that prompted GuardDuty to generate the finding.
    */
  var Protocol: js.UndefOr[String] = js.undefined
}
object DnsRequestAction {
  
  inline def apply(): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRequestAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsRequestAction] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
