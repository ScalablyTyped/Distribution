package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannelConfig extends StObject {
  
  /**
    *  The filter configurations for the Amazon SNS notification topic you use with DevOps Guru. If you do not provide filter configurations, the default configurations are to receive notifications for all message types of High or Medium severity. 
    */
  var Filters: js.UndefOr[NotificationFilterConfig] = js.undefined
  
  /**
    *  Information about a notification channel configured in DevOps Guru to send notifications when insights are created.  If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard SNS topics. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in your account. For more information, see Permissions for cross account Amazon SNS topics. If you use an Amazon SNS topic that is encrypted by an Amazon Web Services Key Management Service customer-managed key (CMK), then you must add permissions to the CMK. For more information, see Permissions for Amazon Web Services KMS–encrypted Amazon SNS topics.
    */
  var Sns: SnsChannelConfig
}
object NotificationChannelConfig {
  
  inline def apply(Sns: SnsChannelConfig): NotificationChannelConfig = {
    val __obj = js.Dynamic.literal(Sns = Sns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationChannelConfig] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: NotificationFilterConfig): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setSns(value: SnsChannelConfig): Self = StObject.set(x, "Sns", value.asInstanceOf[js.Any])
  }
}
