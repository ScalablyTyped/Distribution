package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationAction extends StObject {
  
  /**
    * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the AWS Lambda function provided by AWS IoT Events.
    */
  var action: NotificationTargetActions
  
  /**
    * Contains the configuration information of email notifications.
    */
  var emailConfigurations: js.UndefOr[EmailConfigurations] = js.undefined
  
  /**
    * Contains the configuration information of SMS notifications.
    */
  var smsConfigurations: js.UndefOr[SMSConfigurations] = js.undefined
}
object NotificationAction {
  
  inline def apply(action: NotificationTargetActions): NotificationAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NotificationTargetActions): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurations(value: EmailConfigurations): Self = StObject.set(x, "emailConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationsUndefined: Self = StObject.set(x, "emailConfigurations", js.undefined)
    
    inline def setEmailConfigurationsVarargs(value: EmailConfiguration*): Self = StObject.set(x, "emailConfigurations", js.Array(value*))
    
    inline def setSmsConfigurations(value: SMSConfigurations): Self = StObject.set(x, "smsConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationsUndefined: Self = StObject.set(x, "smsConfigurations", js.undefined)
    
    inline def setSmsConfigurationsVarargs(value: SMSConfiguration*): Self = StObject.set(x, "smsConfigurations", js.Array(value*))
  }
}
