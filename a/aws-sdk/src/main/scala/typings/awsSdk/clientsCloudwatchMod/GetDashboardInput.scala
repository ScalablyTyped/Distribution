package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardInput extends StObject {
  
  /**
    * The name of the dashboard to be described.
    */
  var DashboardName: typings.awsSdk.clientsCloudwatchMod.DashboardName
}
object GetDashboardInput {
  
  inline def apply(DashboardName: DashboardName): GetDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardName = DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardInput]
  }
  
  extension [Self <: GetDashboardInput](x: Self) {
    
    inline def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
  }
}
