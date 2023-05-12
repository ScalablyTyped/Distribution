package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDashboardIndicatorAction extends StObject {
  
  /**
    * Indicates whether the alert action is turned on.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ModelDashboardIndicatorAction {
  
  inline def apply(): ModelDashboardIndicatorAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDashboardIndicatorAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDashboardIndicatorAction] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
