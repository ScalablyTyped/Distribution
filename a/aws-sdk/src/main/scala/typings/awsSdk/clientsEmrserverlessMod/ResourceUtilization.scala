package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUtilization extends StObject {
  
  /**
    * The aggregated memory used per hour from the time the job starts executing until the job is terminated.
    */
  var memoryGBHour: js.UndefOr[Double] = js.undefined
  
  /**
    * The aggregated storage used per hour from the time the job starts executing until the job is terminated.
    */
  var storageGBHour: js.UndefOr[Double] = js.undefined
  
  /**
    * The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
    */
  var vCPUHour: js.UndefOr[Double] = js.undefined
}
object ResourceUtilization {
  
  inline def apply(): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceUtilization] (val x: Self) extends AnyVal {
    
    inline def setMemoryGBHour(value: Double): Self = StObject.set(x, "memoryGBHour", value.asInstanceOf[js.Any])
    
    inline def setMemoryGBHourUndefined: Self = StObject.set(x, "memoryGBHour", js.undefined)
    
    inline def setStorageGBHour(value: Double): Self = StObject.set(x, "storageGBHour", value.asInstanceOf[js.Any])
    
    inline def setStorageGBHourUndefined: Self = StObject.set(x, "storageGBHour", js.undefined)
    
    inline def setVCPUHour(value: Double): Self = StObject.set(x, "vCPUHour", value.asInstanceOf[js.Any])
    
    inline def setVCPUHourUndefined: Self = StObject.set(x, "vCPUHour", js.undefined)
  }
}
