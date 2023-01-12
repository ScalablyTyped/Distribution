package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateControlPanelResponse extends StObject {
  
  /**
    * The control panel to update.
    */
  var ControlPanel: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.ControlPanel] = js.undefined
}
object UpdateControlPanelResponse {
  
  inline def apply(): UpdateControlPanelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateControlPanelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateControlPanelResponse] (val x: Self) extends AnyVal {
    
    inline def setControlPanel(value: ControlPanel): Self = StObject.set(x, "ControlPanel", value.asInstanceOf[js.Any])
    
    inline def setControlPanelUndefined: Self = StObject.set(x, "ControlPanel", js.undefined)
  }
}
