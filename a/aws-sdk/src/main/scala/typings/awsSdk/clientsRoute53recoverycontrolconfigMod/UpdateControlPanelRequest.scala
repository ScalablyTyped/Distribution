package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateControlPanelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The name of the control panel.
    */
  var ControlPanelName: stringMin1Max64PatternS
}
object UpdateControlPanelRequest {
  
  inline def apply(ControlPanelArn: stringMin1Max256PatternAZaZ09, ControlPanelName: stringMin1Max64PatternS): UpdateControlPanelRequest = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any], ControlPanelName = ControlPanelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateControlPanelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateControlPanelRequest] (val x: Self) extends AnyVal {
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelName(value: stringMin1Max64PatternS): Self = StObject.set(x, "ControlPanelName", value.asInstanceOf[js.Any])
  }
}
