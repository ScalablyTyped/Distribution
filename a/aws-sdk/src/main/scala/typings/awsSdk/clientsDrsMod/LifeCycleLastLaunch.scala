package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastLaunch extends StObject {
  
  /**
    * An object containing information regarding the initiation of the last launch of a Source Server.
    */
  var initiated: js.UndefOr[LifeCycleLastLaunchInitiated] = js.undefined
  
  /**
    * Status of Source Server's last launch.
    */
  var status: js.UndefOr[LaunchStatus] = js.undefined
}
object LifeCycleLastLaunch {
  
  inline def apply(): LifeCycleLastLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastLaunch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastLaunch] (val x: Self) extends AnyVal {
    
    inline def setInitiated(value: LifeCycleLastLaunchInitiated): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
    
    inline def setInitiatedUndefined: Self = StObject.set(x, "initiated", js.undefined)
    
    inline def setStatus(value: LaunchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
