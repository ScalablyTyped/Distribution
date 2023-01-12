package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPanel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that includes the control panel.
    */
  var ClusterArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * A flag that Amazon Route 53 Application Recovery Controller sets to true to designate the default control panel for a cluster. When you create a cluster, Amazon Route 53 Application Recovery Controller creates a control panel, and sets this flag for that control panel. If you create a control panel yourself, this flag is set to false.
    */
  var DefaultControlPanel: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the control panel. You can use any non-white space character in the name.
    */
  var Name: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The number of routing controls in the control panel.
    */
  var RoutingControlCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The deployment status of control panel. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.Status] = js.undefined
}
object ControlPanel {
  
  inline def apply(): ControlPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPanel] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelArnUndefined: Self = StObject.set(x, "ControlPanelArn", js.undefined)
    
    inline def setDefaultControlPanel(value: boolean): Self = StObject.set(x, "DefaultControlPanel", value.asInstanceOf[js.Any])
    
    inline def setDefaultControlPanelUndefined: Self = StObject.set(x, "DefaultControlPanel", js.undefined)
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoutingControlCount(value: integer): Self = StObject.set(x, "RoutingControlCount", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlCountUndefined: Self = StObject.set(x, "RoutingControlCount", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
