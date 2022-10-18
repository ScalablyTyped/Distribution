package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the Amazon QuickSight settings that you want to list.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The default namespace for this Amazon Web Services account. Currently, the default is default. Identity and Access Management (IAM) users that register for the first time with Amazon QuickSight provide an email address that becomes associated with the default namespace. 
    */
  var DefaultNamespace: Namespace
  
  /**
    * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon Web Services account or Amazon QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.undefined
}
object UpdateAccountSettingsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DefaultNamespace: Namespace): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DefaultNamespace = DefaultNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
  
  extension [Self <: UpdateAccountSettingsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDefaultNamespace(value: Namespace): Self = StObject.set(x, "DefaultNamespace", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailUndefined: Self = StObject.set(x, "NotificationEmail", js.undefined)
  }
}
