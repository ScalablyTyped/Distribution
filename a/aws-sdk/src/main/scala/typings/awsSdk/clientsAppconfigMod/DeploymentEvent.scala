package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentEvent extends StObject {
  
  /**
    * The list of extensions that were invoked as part of the deployment.
    */
  var ActionInvocations: js.UndefOr[typings.awsSdk.clientsAppconfigMod.ActionInvocations] = js.undefined
  
  /**
    * A description of the deployment event. Descriptions include, but are not limited to, the user account or the Amazon CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the case of an internal error, a recommendation to attempt a new deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a percentage update; the start or stop of a bake period; and the start or completion of a rollback.
    */
  var EventType: js.UndefOr[DeploymentEventType] = js.undefined
  
  /**
    * The date and time the event occurred.
    */
  var OccurredAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The entity that triggered the deployment event. Events can be triggered by a user, AppConfig, an Amazon CloudWatch alarm, or an internal error.
    */
  var TriggeredBy: js.UndefOr[typings.awsSdk.clientsAppconfigMod.TriggeredBy] = js.undefined
}
object DeploymentEvent {
  
  inline def apply(): DeploymentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentEvent] (val x: Self) extends AnyVal {
    
    inline def setActionInvocations(value: ActionInvocations): Self = StObject.set(x, "ActionInvocations", value.asInstanceOf[js.Any])
    
    inline def setActionInvocationsUndefined: Self = StObject.set(x, "ActionInvocations", js.undefined)
    
    inline def setActionInvocationsVarargs(value: ActionInvocation*): Self = StObject.set(x, "ActionInvocations", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventType(value: DeploymentEventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    inline def setOccurredAt(value: js.Date): Self = StObject.set(x, "OccurredAt", value.asInstanceOf[js.Any])
    
    inline def setOccurredAtUndefined: Self = StObject.set(x, "OccurredAt", js.undefined)
    
    inline def setTriggeredBy(value: TriggeredBy): Self = StObject.set(x, "TriggeredBy", value.asInstanceOf[js.Any])
    
    inline def setTriggeredByUndefined: Self = StObject.set(x, "TriggeredBy", js.undefined)
  }
}
