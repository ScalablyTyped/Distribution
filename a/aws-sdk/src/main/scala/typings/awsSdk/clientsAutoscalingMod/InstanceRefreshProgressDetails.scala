package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRefreshProgressDetails extends StObject {
  
  /**
    * Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
    */
  var LivePoolProgress: js.UndefOr[InstanceRefreshLivePoolProgress] = js.undefined
  
  /**
    * Indicates the progress of an instance refresh on instances that are in the warm pool.
    */
  var WarmPoolProgress: js.UndefOr[InstanceRefreshWarmPoolProgress] = js.undefined
}
object InstanceRefreshProgressDetails {
  
  inline def apply(): InstanceRefreshProgressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRefreshProgressDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceRefreshProgressDetails] (val x: Self) extends AnyVal {
    
    inline def setLivePoolProgress(value: InstanceRefreshLivePoolProgress): Self = StObject.set(x, "LivePoolProgress", value.asInstanceOf[js.Any])
    
    inline def setLivePoolProgressUndefined: Self = StObject.set(x, "LivePoolProgress", js.undefined)
    
    inline def setWarmPoolProgress(value: InstanceRefreshWarmPoolProgress): Self = StObject.set(x, "WarmPoolProgress", value.asInstanceOf[js.Any])
    
    inline def setWarmPoolProgressUndefined: Self = StObject.set(x, "WarmPoolProgress", js.undefined)
  }
}
