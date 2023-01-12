package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountDetailsRequest extends StObject {
  
  /**
    * Additional email addresses that you would like to be notified regarding Amazon SES matters.
    */
  var AdditionalContactEmailAddresses: js.UndefOr[typings.awsSdk.clientsSesv2Mod.AdditionalContactEmailAddresses] = js.undefined
  
  /**
    * The language you would prefer to be contacted with.
    */
  var ContactLanguage: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ContactLanguage] = js.undefined
  
  /**
    * The type of email your account will send.
    */
  var MailType: typings.awsSdk.clientsSesv2Mod.MailType
  
  /**
    * Indicates whether or not your account should have production access in the current Amazon Web Services Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[EnabledWrapper] = js.undefined
  
  /**
    * A description of the types of email that you plan to send.
    */
  var UseCaseDescription: typings.awsSdk.clientsSesv2Mod.UseCaseDescription
  
  /**
    * The URL of your website. This information helps us better understand the type of content that you plan to send.
    */
  var WebsiteURL: typings.awsSdk.clientsSesv2Mod.WebsiteURL
}
object PutAccountDetailsRequest {
  
  inline def apply(MailType: MailType, UseCaseDescription: UseCaseDescription, WebsiteURL: WebsiteURL): PutAccountDetailsRequest = {
    val __obj = js.Dynamic.literal(MailType = MailType.asInstanceOf[js.Any], UseCaseDescription = UseCaseDescription.asInstanceOf[js.Any], WebsiteURL = WebsiteURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalContactEmailAddresses(value: AdditionalContactEmailAddresses): Self = StObject.set(x, "AdditionalContactEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setAdditionalContactEmailAddressesUndefined: Self = StObject.set(x, "AdditionalContactEmailAddresses", js.undefined)
    
    inline def setAdditionalContactEmailAddressesVarargs(value: AdditionalContactEmailAddress*): Self = StObject.set(x, "AdditionalContactEmailAddresses", js.Array(value*))
    
    inline def setContactLanguage(value: ContactLanguage): Self = StObject.set(x, "ContactLanguage", value.asInstanceOf[js.Any])
    
    inline def setContactLanguageUndefined: Self = StObject.set(x, "ContactLanguage", js.undefined)
    
    inline def setMailType(value: MailType): Self = StObject.set(x, "MailType", value.asInstanceOf[js.Any])
    
    inline def setProductionAccessEnabled(value: EnabledWrapper): Self = StObject.set(x, "ProductionAccessEnabled", value.asInstanceOf[js.Any])
    
    inline def setProductionAccessEnabledUndefined: Self = StObject.set(x, "ProductionAccessEnabled", js.undefined)
    
    inline def setUseCaseDescription(value: UseCaseDescription): Self = StObject.set(x, "UseCaseDescription", value.asInstanceOf[js.Any])
    
    inline def setWebsiteURL(value: WebsiteURL): Self = StObject.set(x, "WebsiteURL", value.asInstanceOf[js.Any])
  }
}
