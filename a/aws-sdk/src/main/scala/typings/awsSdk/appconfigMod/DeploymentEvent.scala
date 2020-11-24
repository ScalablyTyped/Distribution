package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentEvent extends js.Object {
  
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
  implicit class DeploymentEventOps[Self <: DeploymentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEventType(value: DeploymentEventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    
    @scala.inline
    def setOccurredAt(value: Iso8601DateTime): Self = this.set("OccurredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurredAt: Self = this.set("OccurredAt", js.undefined)
    
    @scala.inline
    def setTriggeredBy(value: TriggeredBy): Self = this.set("TriggeredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggeredBy: Self = this.set("TriggeredBy", js.undefined)
  }
}
