package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRumMetricsDestinationRequest extends StObject {
  
  /**
    * The name of the app monitor that is sending metrics to the destination that you want to delete.
    */
  var AppMonitorName: typings.awsSdk.clientsRumMod.AppMonitorName
  
  /**
    * The type of destination to delete. Valid values are CloudWatch and Evidently.
    */
  var Destination: MetricDestination
  
  /**
    * This parameter is required if Destination is Evidently. If Destination is CloudWatch, do not use this parameter. This parameter specifies the ARN of the Evidently experiment that corresponds to the destination to delete.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRumMod.DestinationArn] = js.undefined
}
object DeleteRumMetricsDestinationRequest {
  
  inline def apply(AppMonitorName: AppMonitorName, Destination: MetricDestination): DeleteRumMetricsDestinationRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRumMetricsDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRumMetricsDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
  }
}
