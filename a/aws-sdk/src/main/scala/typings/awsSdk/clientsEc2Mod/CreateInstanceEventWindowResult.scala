package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceEventWindowResult extends StObject {
  
  /**
    * Information about the event window.
    */
  var InstanceEventWindow: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventWindow] = js.undefined
}
object CreateInstanceEventWindowResult {
  
  inline def apply(): CreateInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceEventWindowResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInstanceEventWindowResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceEventWindow(value: InstanceEventWindow): Self = StObject.set(x, "InstanceEventWindow", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowUndefined: Self = StObject.set(x, "InstanceEventWindow", js.undefined)
  }
}
