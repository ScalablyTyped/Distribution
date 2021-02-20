package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentEvent extends StObject {
  
  /**
    * A description of the deployment event. Descriptions include, but are not limited to, the user account or the CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the case of an internal error, a recommendation to attempt a new deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a percentage update; the start or stop of a bake period; the start or completion of a rollback.
    */
  var EventType: js.UndefOr[DeploymentEventType] = js.native
  
  /**
    * The date and time the event occurred.
    */
  var OccurredAt: js.UndefOr[Iso8601DateTime] = js.native
  
  /**
    * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon CloudWatch alarm, or an internal error.
    */
  var TriggeredBy: js.UndefOr[typings.awsSdk.appconfigMod.TriggeredBy] = js.native
}
object DeploymentEvent {
  
  @scala.inline
  def apply(): DeploymentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentEvent]
  }
  
  @scala.inline
  implicit class DeploymentEventMutableBuilder[Self <: DeploymentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventType(value: DeploymentEventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setOccurredAt(value: Iso8601DateTime): Self = StObject.set(x, "OccurredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurredAtUndefined: Self = StObject.set(x, "OccurredAt", js.undefined)
    
    @scala.inline
    def setTriggeredBy(value: TriggeredBy): Self = StObject.set(x, "TriggeredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggeredByUndefined: Self = StObject.set(x, "TriggeredBy", js.undefined)
  }
}
