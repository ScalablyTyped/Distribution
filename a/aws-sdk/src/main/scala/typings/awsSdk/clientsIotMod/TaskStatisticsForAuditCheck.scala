package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskStatisticsForAuditCheck extends StObject {
  
  /**
    * The number of findings to which the mitigation action task was canceled when applied.
    */
  var canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.undefined
  
  /**
    * The number of findings for which at least one of the actions failed when applied.
    */
  var failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.undefined
  
  /**
    * The number of findings skipped because of filter conditions provided in the parameters to the command.
    */
  var skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.undefined
  
  /**
    * The number of findings for which all mitigation actions succeeded when applied.
    */
  var succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.undefined
  
  /**
    * The total number of findings to which a task is being applied.
    */
  var totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.undefined
}
object TaskStatisticsForAuditCheck {
  
  inline def apply(): TaskStatisticsForAuditCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatisticsForAuditCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskStatisticsForAuditCheck] (val x: Self) extends AnyVal {
    
    inline def setCanceledFindingsCount(value: CanceledFindingsCount): Self = StObject.set(x, "canceledFindingsCount", value.asInstanceOf[js.Any])
    
    inline def setCanceledFindingsCountUndefined: Self = StObject.set(x, "canceledFindingsCount", js.undefined)
    
    inline def setFailedFindingsCount(value: FailedFindingsCount): Self = StObject.set(x, "failedFindingsCount", value.asInstanceOf[js.Any])
    
    inline def setFailedFindingsCountUndefined: Self = StObject.set(x, "failedFindingsCount", js.undefined)
    
    inline def setSkippedFindingsCount(value: SkippedFindingsCount): Self = StObject.set(x, "skippedFindingsCount", value.asInstanceOf[js.Any])
    
    inline def setSkippedFindingsCountUndefined: Self = StObject.set(x, "skippedFindingsCount", js.undefined)
    
    inline def setSucceededFindingsCount(value: SucceededFindingsCount): Self = StObject.set(x, "succeededFindingsCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededFindingsCountUndefined: Self = StObject.set(x, "succeededFindingsCount", js.undefined)
    
    inline def setTotalFindingsCount(value: TotalFindingsCount): Self = StObject.set(x, "totalFindingsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalFindingsCountUndefined: Self = StObject.set(x, "totalFindingsCount", js.undefined)
  }
}
