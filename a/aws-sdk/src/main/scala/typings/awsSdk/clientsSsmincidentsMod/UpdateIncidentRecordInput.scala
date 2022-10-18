package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIncidentRecordInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident record you are updating.
    */
  var arn: Arn
  
  /**
    * The Chatbot chat channel where responders can collaborate.
    */
  var chatChannel: js.UndefOr[ChatChannel] = js.undefined
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Defines the impact of the incident to customers and applications. Providing an impact overwrites the impact provided by the response plan.  Possible impacts:     1 - Critical impact, full application failure that impacts many to all customers.     2 - High impact, partial application failure with impact to many customers.    3 - Medium impact, the application is providing reduced service to customers.    4 - Low impact, customer aren't impacted by the problem yet.    5 - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.  
    */
  var impact: js.UndefOr[Impact] = js.undefined
  
  /**
    * The Amazon SNS targets that are notified when updates are made to an incident. Using multiple SNS topics creates redundancy in the event that a Region is down during the incident.
    */
  var notificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined
  
  /**
    * The status of the incident. An incident can be Open or Resolved.
    */
  var status: js.UndefOr[IncidentRecordStatus] = js.undefined
  
  /**
    * A longer description of what occurred during the incident.
    */
  var summary: js.UndefOr[IncidentSummary] = js.undefined
  
  /**
    * A brief description of the incident.
    */
  var title: js.UndefOr[IncidentTitle] = js.undefined
}
object UpdateIncidentRecordInput {
  
  inline def apply(arn: Arn): UpdateIncidentRecordInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIncidentRecordInput]
  }
  
  extension [Self <: UpdateIncidentRecordInput](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setChatChannel(value: ChatChannel): Self = StObject.set(x, "chatChannel", value.asInstanceOf[js.Any])
    
    inline def setChatChannelUndefined: Self = StObject.set(x, "chatChannel", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setNotificationTargets(value: NotificationTargetSet): Self = StObject.set(x, "notificationTargets", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetsUndefined: Self = StObject.set(x, "notificationTargets", js.undefined)
    
    inline def setNotificationTargetsVarargs(value: NotificationTargetItem*): Self = StObject.set(x, "notificationTargets", js.Array(value*))
    
    inline def setStatus(value: IncidentRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: IncidentSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTitle(value: IncidentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
