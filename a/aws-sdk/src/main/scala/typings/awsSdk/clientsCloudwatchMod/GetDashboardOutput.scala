package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.DashboardArn] = js.undefined
  
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see Dashboard Body Structure and Syntax. 
    */
  var DashboardBody: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.DashboardBody] = js.undefined
  
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.DashboardName] = js.undefined
}
object GetDashboardOutput {
  
  inline def apply(): GetDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardOutput]
  }
  
  extension [Self <: GetDashboardOutput](x: Self) {
    
    inline def setDashboardArn(value: DashboardArn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    inline def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    inline def setDashboardBody(value: DashboardBody): Self = StObject.set(x, "DashboardBody", value.asInstanceOf[js.Any])
    
    inline def setDashboardBodyUndefined: Self = StObject.set(x, "DashboardBody", js.undefined)
    
    inline def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
    
    inline def setDashboardNameUndefined: Self = StObject.set(x, "DashboardName", js.undefined)
  }
}
