package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressStatusDetails extends StObject {
  
  /**
    * The unique change identifier associated with a specific domain configuration change.
    */
  var ChangeId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The specific stages that the domain is going through to perform the configuration change.
    */
  var ChangeProgressStages: js.UndefOr[ChangeProgressStageList] = js.undefined
  
  /**
    * The list of properties in the domain configuration change that have completed.
    */
  var CompletedProperties: js.UndefOr[StringList] = js.undefined
  
  /**
    * The list of properties in the domain configuration change that are still pending.
    */
  var PendingProperties: js.UndefOr[StringList] = js.undefined
  
  /**
    * The time at which the configuration change is made on the domain.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The overall status of the domain configuration change.
    */
  var Status: js.UndefOr[OverallChangeStatus] = js.undefined
  
  /**
    * The total number of stages required for the configuration change.
    */
  var TotalNumberOfStages: js.UndefOr[typings.awsSdk.clientsOpensearchMod.TotalNumberOfStages] = js.undefined
}
object ChangeProgressStatusDetails {
  
  inline def apply(): ChangeProgressStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressStatusDetails]
  }
  
  extension [Self <: ChangeProgressStatusDetails](x: Self) {
    
    inline def setChangeId(value: GUID): Self = StObject.set(x, "ChangeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "ChangeId", js.undefined)
    
    inline def setChangeProgressStages(value: ChangeProgressStageList): Self = StObject.set(x, "ChangeProgressStages", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressStagesUndefined: Self = StObject.set(x, "ChangeProgressStages", js.undefined)
    
    inline def setChangeProgressStagesVarargs(value: ChangeProgressStage*): Self = StObject.set(x, "ChangeProgressStages", js.Array(value*))
    
    inline def setCompletedProperties(value: StringList): Self = StObject.set(x, "CompletedProperties", value.asInstanceOf[js.Any])
    
    inline def setCompletedPropertiesUndefined: Self = StObject.set(x, "CompletedProperties", js.undefined)
    
    inline def setCompletedPropertiesVarargs(value: String*): Self = StObject.set(x, "CompletedProperties", js.Array(value*))
    
    inline def setPendingProperties(value: StringList): Self = StObject.set(x, "PendingProperties", value.asInstanceOf[js.Any])
    
    inline def setPendingPropertiesUndefined: Self = StObject.set(x, "PendingProperties", js.undefined)
    
    inline def setPendingPropertiesVarargs(value: String*): Self = StObject.set(x, "PendingProperties", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: OverallChangeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTotalNumberOfStages(value: TotalNumberOfStages): Self = StObject.set(x, "TotalNumberOfStages", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfStagesUndefined: Self = StObject.set(x, "TotalNumberOfStages", js.undefined)
  }
}
