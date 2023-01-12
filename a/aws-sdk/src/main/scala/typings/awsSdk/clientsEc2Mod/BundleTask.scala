package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleTask extends StObject {
  
  /**
    * The ID of the bundle task.
    */
  var BundleId: js.UndefOr[String] = js.undefined
  
  /**
    * If the task fails, a description of the error.
    */
  var BundleTaskError: js.UndefOr[typings.awsSdk.clientsEc2Mod.BundleTaskError] = js.undefined
  
  /**
    * The ID of the instance associated with this bundle task.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The level of task completion, as a percent (for example, 20%).
    */
  var Progress: js.UndefOr[String] = js.undefined
  
  /**
    * The time this task started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the task.
    */
  var State: js.UndefOr[BundleTaskState] = js.undefined
  
  /**
    * The Amazon S3 storage locations.
    */
  var Storage: js.UndefOr[typings.awsSdk.clientsEc2Mod.Storage] = js.undefined
  
  /**
    * The time of the most recent update for the task.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.undefined
}
object BundleTask {
  
  inline def apply(): BundleTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleTask] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setBundleTaskError(value: BundleTaskError): Self = StObject.set(x, "BundleTaskError", value.asInstanceOf[js.Any])
    
    inline def setBundleTaskErrorUndefined: Self = StObject.set(x, "BundleTaskError", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: BundleTaskState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStorage(value: Storage): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
