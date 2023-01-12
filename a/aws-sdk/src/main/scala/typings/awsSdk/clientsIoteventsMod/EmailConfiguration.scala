package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailConfiguration extends StObject {
  
  /**
    * Contains the subject and message of an email.
    */
  var content: js.UndefOr[EmailContent] = js.undefined
  
  /**
    * The email address that sends emails.  If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must verify the email address that sends emails in Amazon SES. 
    */
  var from: FromEmail
  
  /**
    * Contains the information of one or more recipients who receive the emails.  You must add the users that receive emails to your AWS SSO store. 
    */
  var recipients: EmailRecipients
}
object EmailConfiguration {
  
  inline def apply(from: FromEmail, recipients: EmailRecipients): EmailConfiguration = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContent(value: EmailContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFrom(value: FromEmail): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: EmailRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
  }
}
