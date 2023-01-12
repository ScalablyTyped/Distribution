package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource.
    */
  var MonitorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the monitor. States include:    ACTIVE     ACTIVE_STOPPING, ACTIVE_STOPPED     UPDATE_IN_PROGRESS     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object MonitorInfo {
  
  inline def apply(): MonitorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
