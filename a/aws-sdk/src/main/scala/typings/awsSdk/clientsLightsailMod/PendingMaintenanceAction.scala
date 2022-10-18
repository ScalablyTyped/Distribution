package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending database maintenance action.
    */
  var action: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The effective date of the pending database maintenance action.
    */
  var currentApplyDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Additional detail about the pending database maintenance action.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
}
object PendingMaintenanceAction {
  
  inline def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  
  extension [Self <: PendingMaintenanceAction](x: Self) {
    
    inline def setAction(value: NonEmptyString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCurrentApplyDate(value: js.Date): Self = StObject.set(x, "currentApplyDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplyDateUndefined: Self = StObject.set(x, "currentApplyDate", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
