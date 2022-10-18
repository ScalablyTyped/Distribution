package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityMailFromAttributesRequest extends StObject {
  
  /**
    * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email. When you set this value to UseDefaultValue, Amazon Pinpoint uses amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, Amazon Pinpoint returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMxFailure: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.BehaviorOnMxFailure] = js.undefined
  
  /**
    * The verified email identity that you want to set up the custom MAIL FROM domain for.
    */
  var EmailIdentity: Identity
  
  /**
    *  The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the following criteria:   It has to be a subdomain of the verified identity.   It can't be used to receive email.   It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.  
    */
  var MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
}
object PutEmailIdentityMailFromAttributesRequest {
  
  inline def apply(EmailIdentity: Identity): PutEmailIdentityMailFromAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
  }
  
  extension [Self <: PutEmailIdentityMailFromAttributesRequest](x: Self) {
    
    inline def setBehaviorOnMxFailure(value: BehaviorOnMxFailure): Self = StObject.set(x, "BehaviorOnMxFailure", value.asInstanceOf[js.Any])
    
    inline def setBehaviorOnMxFailureUndefined: Self = StObject.set(x, "BehaviorOnMxFailure", js.undefined)
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    inline def setMailFromDomain(value: MailFromDomainName): Self = StObject.set(x, "MailFromDomain", value.asInstanceOf[js.Any])
    
    inline def setMailFromDomainUndefined: Self = StObject.set(x, "MailFromDomain", js.undefined)
  }
}
