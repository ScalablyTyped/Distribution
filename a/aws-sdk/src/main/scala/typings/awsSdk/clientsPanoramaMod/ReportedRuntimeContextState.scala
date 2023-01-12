package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportedRuntimeContextState extends StObject {
  
  /**
    * The application's desired state.
    */
  var DesiredState: typings.awsSdk.clientsPanoramaMod.DesiredState
  
  /**
    * The application's reported status.
    */
  var DeviceReportedStatus: typings.awsSdk.clientsPanoramaMod.DeviceReportedStatus
  
  /**
    * When the device reported the application's state.
    */
  var DeviceReportedTime: js.Date
  
  /**
    * The device's name.
    */
  var RuntimeContextName: typings.awsSdk.clientsPanoramaMod.RuntimeContextName
}
object ReportedRuntimeContextState {
  
  inline def apply(
    DesiredState: DesiredState,
    DeviceReportedStatus: DeviceReportedStatus,
    DeviceReportedTime: js.Date,
    RuntimeContextName: RuntimeContextName
  ): ReportedRuntimeContextState = {
    val __obj = js.Dynamic.literal(DesiredState = DesiredState.asInstanceOf[js.Any], DeviceReportedStatus = DeviceReportedStatus.asInstanceOf[js.Any], DeviceReportedTime = DeviceReportedTime.asInstanceOf[js.Any], RuntimeContextName = RuntimeContextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportedRuntimeContextState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportedRuntimeContextState] (val x: Self) extends AnyVal {
    
    inline def setDesiredState(value: DesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDeviceReportedStatus(value: DeviceReportedStatus): Self = StObject.set(x, "DeviceReportedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceReportedTime(value: js.Date): Self = StObject.set(x, "DeviceReportedTime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeContextName(value: RuntimeContextName): Self = StObject.set(x, "RuntimeContextName", value.asInstanceOf[js.Any])
  }
}
