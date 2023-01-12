package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityMailFromDomainAttributesResponse extends StObject {
  
  /**
    * A map of identities to custom MAIL FROM attributes.
    */
  var MailFromDomainAttributes: typings.awsSdk.clientsSesMod.MailFromDomainAttributes
}
object GetIdentityMailFromDomainAttributesResponse {
  
  inline def apply(MailFromDomainAttributes: MailFromDomainAttributes): GetIdentityMailFromDomainAttributesResponse = {
    val __obj = js.Dynamic.literal(MailFromDomainAttributes = MailFromDomainAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityMailFromDomainAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setMailFromDomainAttributes(value: MailFromDomainAttributes): Self = StObject.set(x, "MailFromDomainAttributes", value.asInstanceOf[js.Any])
  }
}
