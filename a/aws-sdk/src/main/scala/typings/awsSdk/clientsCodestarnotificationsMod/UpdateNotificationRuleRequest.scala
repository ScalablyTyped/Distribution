package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn
  
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in Amazon CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.DetailType] = js.undefined
  
  /**
    * A list of event types associated with this notification rule. For a complete list of event types and IDs, see Notification concepts in the Developer Tools Console User Guide.
    */
  var EventTypeIds: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.EventTypeIds] = js.undefined
  
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.undefined
  
  /**
    * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.undefined
  
  /**
    * The address and type of the targets to receive notifications from this notification rule.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.Targets] = js.undefined
}
object UpdateNotificationRuleRequest {
  
  inline def apply(Arn: NotificationRuleArn): UpdateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNotificationRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    inline def setEventTypeIds(value: EventTypeIds): Self = StObject.set(x, "EventTypeIds", value.asInstanceOf[js.Any])
    
    inline def setEventTypeIdsUndefined: Self = StObject.set(x, "EventTypeIds", js.undefined)
    
    inline def setEventTypeIdsVarargs(value: EventTypeId*): Self = StObject.set(x, "EventTypeIds", js.Array(value*))
    
    inline def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
