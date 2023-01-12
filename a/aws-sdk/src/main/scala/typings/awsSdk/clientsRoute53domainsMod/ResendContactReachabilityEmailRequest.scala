package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResendContactReachabilityEmailRequest extends StObject {
  
  /**
    * The name of the domain for which you want Route 53 to resend a confirmation email to the registrant contact.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
}
object ResendContactReachabilityEmailRequest {
  
  inline def apply(): ResendContactReachabilityEmailRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendContactReachabilityEmailRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResendContactReachabilityEmailRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
  }
}
