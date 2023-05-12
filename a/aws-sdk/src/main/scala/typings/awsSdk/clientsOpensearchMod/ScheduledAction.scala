package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledAction extends StObject {
  
  /**
    * Whether or not the scheduled action is cancellable.
    */
  var Cancellable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the action to be taken.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the scheduled action.
    */
  var Id: String
  
  /**
    * Whether the action is required or optional.
    */
  var Mandatory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the action was scheduled manually (CUSTOMER, or by OpenSearch Service automatically (SYSTEM).
    */
  var ScheduledBy: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ScheduledBy] = js.undefined
  
  /**
    * The time when the change is scheduled to happen.
    */
  var ScheduledTime: Long
  
  /**
    * The severity of the action.
    */
  var Severity: ActionSeverity
  
  /**
    * The current status of the scheduled action.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
  
  /**
    * The type of action that will be taken on the domain.
    */
  var Type: ActionType
}
object ScheduledAction {
  
  inline def apply(Id: String, ScheduledTime: Long, Severity: ActionSeverity, Type: ActionType): ScheduledAction = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledAction] (val x: Self) extends AnyVal {
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "Cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancellableUndefined: Self = StObject.set(x, "Cancellable", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "Mandatory", value.asInstanceOf[js.Any])
    
    inline def setMandatoryUndefined: Self = StObject.set(x, "Mandatory", js.undefined)
    
    inline def setScheduledBy(value: ScheduledBy): Self = StObject.set(x, "ScheduledBy", value.asInstanceOf[js.Any])
    
    inline def setScheduledByUndefined: Self = StObject.set(x, "ScheduledBy", js.undefined)
    
    inline def setScheduledTime(value: Long): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: ActionSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ActionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
