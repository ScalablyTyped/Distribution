package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledAutoTuneDetails extends StObject {
  
  /**
    * A description of the Auto-Tune action.
    */
  var Action: js.UndefOr[ScheduledAutoTuneDescription] = js.undefined
  
  /**
    * The type of Auto-Tune action.
    */
  var ActionType: js.UndefOr[ScheduledAutoTuneActionType] = js.undefined
  
  /**
    * The date and time when the Auto-Tune action is scheduled for the domain.
    */
  var Date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The severity of the Auto-Tune action. Valid values are LOW, MEDIUM, and HIGH.
    */
  var Severity: js.UndefOr[ScheduledAutoTuneSeverityType] = js.undefined
}
object ScheduledAutoTuneDetails {
  
  inline def apply(): ScheduledAutoTuneDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledAutoTuneDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledAutoTuneDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ScheduledAutoTuneDescription): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: ScheduledAutoTuneActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setSeverity(value: ScheduledAutoTuneSeverityType): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
