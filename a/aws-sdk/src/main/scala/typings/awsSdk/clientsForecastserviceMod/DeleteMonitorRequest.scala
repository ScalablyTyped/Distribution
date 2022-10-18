package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMonitorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource to delete.
    */
  var MonitorArn: Arn
}
object DeleteMonitorRequest {
  
  inline def apply(MonitorArn: Arn): DeleteMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitorRequest]
  }
  
  extension [Self <: DeleteMonitorRequest](x: Self) {
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
