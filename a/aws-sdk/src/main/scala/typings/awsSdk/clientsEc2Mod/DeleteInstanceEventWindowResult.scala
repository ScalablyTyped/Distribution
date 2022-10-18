package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceEventWindowResult extends StObject {
  
  /**
    * The state of the event window.
    */
  var InstanceEventWindowState: js.UndefOr[InstanceEventWindowStateChange] = js.undefined
}
object DeleteInstanceEventWindowResult {
  
  inline def apply(): DeleteInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInstanceEventWindowResult]
  }
  
  extension [Self <: DeleteInstanceEventWindowResult](x: Self) {
    
    inline def setInstanceEventWindowState(value: InstanceEventWindowStateChange): Self = StObject.set(x, "InstanceEventWindowState", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowStateUndefined: Self = StObject.set(x, "InstanceEventWindowState", js.undefined)
  }
}
