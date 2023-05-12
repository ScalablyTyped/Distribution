package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressStatus extends StObject {
  
  /**
    * Information about the stages that the pipeline is going through to perform the configuration change.
    */
  var ChangeProgressStages: js.UndefOr[ChangeProgressStageList] = js.undefined
  
  /**
    * The time at which the configuration change is made on the pipeline.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The overall status of the pipeline configuration change.
    */
  var Status: js.UndefOr[ChangeProgressStatuses] = js.undefined
  
  /**
    * The total number of stages required for the pipeline configuration change.
    */
  var TotalNumberOfStages: js.UndefOr[Integer] = js.undefined
}
object ChangeProgressStatus {
  
  inline def apply(): ChangeProgressStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeProgressStatus] (val x: Self) extends AnyVal {
    
    inline def setChangeProgressStages(value: ChangeProgressStageList): Self = StObject.set(x, "ChangeProgressStages", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressStagesUndefined: Self = StObject.set(x, "ChangeProgressStages", js.undefined)
    
    inline def setChangeProgressStagesVarargs(value: ChangeProgressStage*): Self = StObject.set(x, "ChangeProgressStages", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: ChangeProgressStatuses): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTotalNumberOfStages(value: Integer): Self = StObject.set(x, "TotalNumberOfStages", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfStagesUndefined: Self = StObject.set(x, "TotalNumberOfStages", js.undefined)
  }
}
