package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * The ARN for the Amazon SNS topic to which notifications should be published.
    */
  var NotificationTopicArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NotificationTopicArn] = js.undefined
}
object NotificationConfiguration {
  
  inline def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  extension [Self <: NotificationConfiguration](x: Self) {
    
    inline def setNotificationTopicArn(value: NotificationTopicArn): Self = StObject.set(x, "NotificationTopicArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationTopicArnUndefined: Self = StObject.set(x, "NotificationTopicArn", js.undefined)
  }
}
