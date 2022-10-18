package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCustomVerificationEmailRequest extends StObject {
  
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The email address to verify.
    */
  var EmailAddress: typings.awsSdk.clientsSesv2Mod.EmailAddress
  
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: EmailTemplateName
}
object SendCustomVerificationEmailRequest {
  
  inline def apply(EmailAddress: EmailAddress, TemplateName: EmailTemplateName): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
  
  extension [Self <: SendCustomVerificationEmailRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
