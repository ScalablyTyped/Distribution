package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDashboardsInput extends StObject {
  
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typings.awsSdk.clientsCloudwatchMod.DashboardNames
}
object DeleteDashboardsInput {
  
  inline def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDashboardsInput] (val x: Self) extends AnyVal {
    
    inline def setDashboardNames(value: DashboardNames): Self = StObject.set(x, "DashboardNames", value.asInstanceOf[js.Any])
    
    inline def setDashboardNamesVarargs(value: DashboardName*): Self = StObject.set(x, "DashboardNames", js.Array(value*))
  }
}
