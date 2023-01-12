package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceFleetReportRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
}
object GetDeviceFleetReportRequest {
  
  inline def apply(DeviceFleetName: EntityName): GetDeviceFleetReportRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceFleetReportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceFleetReportRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
  }
}
