package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeControlPanelResponse extends StObject {
  
  /**
    * Information about the control panel.
    */
  var ControlPanel: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.ControlPanel] = js.undefined
}
object DescribeControlPanelResponse {
  
  inline def apply(): DescribeControlPanelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeControlPanelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeControlPanelResponse] (val x: Self) extends AnyVal {
    
    inline def setControlPanel(value: ControlPanel): Self = StObject.set(x, "ControlPanel", value.asInstanceOf[js.Any])
    
    inline def setControlPanelUndefined: Self = StObject.set(x, "ControlPanel", js.undefined)
  }
}
