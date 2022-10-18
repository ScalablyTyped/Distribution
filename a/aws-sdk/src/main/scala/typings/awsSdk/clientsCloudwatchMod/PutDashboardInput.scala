package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDashboardInput extends StObject {
  
  /**
    * The detailed information about the dashboard in JSON format, including the widgets to include and their location on the dashboard. This parameter is required. For more information about the syntax, see Dashboard Body Structure and Syntax.
    */
  var DashboardBody: typings.awsSdk.clientsCloudwatchMod.DashboardBody
  
  /**
    * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
    */
  var DashboardName: typings.awsSdk.clientsCloudwatchMod.DashboardName
}
object PutDashboardInput {
  
  inline def apply(DashboardBody: DashboardBody, DashboardName: DashboardName): PutDashboardInput = {
    val __obj = js.Dynamic.literal(DashboardBody = DashboardBody.asInstanceOf[js.Any], DashboardName = DashboardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDashboardInput]
  }
  
  extension [Self <: PutDashboardInput](x: Self) {
    
    inline def setDashboardBody(value: DashboardBody): Self = StObject.set(x, "DashboardBody", value.asInstanceOf[js.Any])
    
    inline def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
  }
}
