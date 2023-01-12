package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplaceRootVolumeTaskResult extends StObject {
  
  /**
    * Information about the root volume replacement task.
    */
  var ReplaceRootVolumeTask: js.UndefOr[typings.awsSdk.clientsEc2Mod.ReplaceRootVolumeTask] = js.undefined
}
object CreateReplaceRootVolumeTaskResult {
  
  inline def apply(): CreateReplaceRootVolumeTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplaceRootVolumeTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplaceRootVolumeTaskResult] (val x: Self) extends AnyVal {
    
    inline def setReplaceRootVolumeTask(value: ReplaceRootVolumeTask): Self = StObject.set(x, "ReplaceRootVolumeTask", value.asInstanceOf[js.Any])
    
    inline def setReplaceRootVolumeTaskUndefined: Self = StObject.set(x, "ReplaceRootVolumeTask", js.undefined)
  }
}
