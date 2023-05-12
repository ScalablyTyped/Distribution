package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackDetails extends StObject {
  
  /**
    * Indicates the value of InstancesToUpdate at the time the rollback started.
    */
  var InstancesToUpdateOnRollback: js.UndefOr[InstancesToUpdate] = js.undefined
  
  /**
    * Indicates the value of PercentageComplete at the time the rollback started.
    */
  var PercentageCompleteOnRollback: js.UndefOr[IntPercent] = js.undefined
  
  /**
    * Reports progress on replacing instances in an Auto Scaling group that has a warm pool. This includes separate details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
    */
  var ProgressDetailsOnRollback: js.UndefOr[InstanceRefreshProgressDetails] = js.undefined
  
  /**
    * The reason for this instance refresh rollback (for example, whether a manual or automatic rollback was initiated).
    */
  var RollbackReason: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The date and time at which the rollback began.
    */
  var RollbackStartTime: js.UndefOr[js.Date] = js.undefined
}
object RollbackDetails {
  
  inline def apply(): RollbackDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollbackDetails] (val x: Self) extends AnyVal {
    
    inline def setInstancesToUpdateOnRollback(value: InstancesToUpdate): Self = StObject.set(x, "InstancesToUpdateOnRollback", value.asInstanceOf[js.Any])
    
    inline def setInstancesToUpdateOnRollbackUndefined: Self = StObject.set(x, "InstancesToUpdateOnRollback", js.undefined)
    
    inline def setPercentageCompleteOnRollback(value: IntPercent): Self = StObject.set(x, "PercentageCompleteOnRollback", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteOnRollbackUndefined: Self = StObject.set(x, "PercentageCompleteOnRollback", js.undefined)
    
    inline def setProgressDetailsOnRollback(value: InstanceRefreshProgressDetails): Self = StObject.set(x, "ProgressDetailsOnRollback", value.asInstanceOf[js.Any])
    
    inline def setProgressDetailsOnRollbackUndefined: Self = StObject.set(x, "ProgressDetailsOnRollback", js.undefined)
    
    inline def setRollbackReason(value: XmlStringMaxLen1023): Self = StObject.set(x, "RollbackReason", value.asInstanceOf[js.Any])
    
    inline def setRollbackReasonUndefined: Self = StObject.set(x, "RollbackReason", js.undefined)
    
    inline def setRollbackStartTime(value: js.Date): Self = StObject.set(x, "RollbackStartTime", value.asInstanceOf[js.Any])
    
    inline def setRollbackStartTimeUndefined: Self = StObject.set(x, "RollbackStartTime", js.undefined)
  }
}
