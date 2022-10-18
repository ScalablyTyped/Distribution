package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HopDestination extends StObject {
  
  /**
    * Optional. When you set up a job to use queue hopping, you can specify a different relative priority for the job in the destination queue. If you don't specify, the relative priority will remain the same as in the previous queue.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.undefined
  
  /**
    * Optional unless the job is submitted on the default queue. When you set up a job to use queue hopping, you can specify a destination queue. This queue cannot be the original queue to which the job is submitted. If the original queue isn't the default queue and you don't specify the destination queue, the job will move to the default queue.
    */
  var Queue: js.UndefOr[string] = js.undefined
  
  /**
    * Required for setting up a job to use queue hopping. Minimum wait time in minutes until the job can hop to the destination queue. Valid range is 1 to 1440 minutes, inclusive.
    */
  var WaitMinutes: js.UndefOr[integer] = js.undefined
}
object HopDestination {
  
  inline def apply(): HopDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HopDestination]
  }
  
  extension [Self <: HopDestination](x: Self) {
    
    inline def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    inline def setWaitMinutes(value: integer): Self = StObject.set(x, "WaitMinutes", value.asInstanceOf[js.Any])
    
    inline def setWaitMinutesUndefined: Self = StObject.set(x, "WaitMinutes", js.undefined)
  }
}
