package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringAlertActions extends StObject {
  
  /**
    * An alert action taken to light up an icon on the Model Dashboard when an alert goes into InAlert status.
    */
  var ModelDashboardIndicator: js.UndefOr[ModelDashboardIndicatorAction] = js.undefined
}
object MonitoringAlertActions {
  
  inline def apply(): MonitoringAlertActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringAlertActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringAlertActions] (val x: Self) extends AnyVal {
    
    inline def setModelDashboardIndicator(value: ModelDashboardIndicatorAction): Self = StObject.set(x, "ModelDashboardIndicator", value.asInstanceOf[js.Any])
    
    inline def setModelDashboardIndicatorUndefined: Self = StObject.set(x, "ModelDashboardIndicator", js.undefined)
  }
}
