package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindowStateChange extends StObject {
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventWindowId] = js.undefined
  
  /**
    * The current state of the event window.
    */
  var State: js.UndefOr[InstanceEventWindowState] = js.undefined
}
object InstanceEventWindowStateChange {
  
  inline def apply(): InstanceEventWindowStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindowStateChange]
  }
  
  extension [Self <: InstanceEventWindowStateChange](x: Self) {
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowIdUndefined: Self = StObject.set(x, "InstanceEventWindowId", js.undefined)
    
    inline def setState(value: InstanceEventWindowState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
