package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDashboardModel extends StObject {
  
  /**
    * The endpoints that host a model.
    */
  var Endpoints: js.UndefOr[ModelDashboardEndpoints] = js.undefined
  
  var LastBatchTransformJob: js.UndefOr[TransformJob] = js.undefined
  
  /**
    * A model displayed in the Model Dashboard.
    */
  var Model: js.UndefOr[typings.awsSdk.clientsSagemakerMod.Model] = js.undefined
  
  /**
    * The model card for a model.
    */
  var ModelCard: js.UndefOr[ModelDashboardModelCard] = js.undefined
  
  /**
    * The monitoring schedules for a model.
    */
  var MonitoringSchedules: js.UndefOr[ModelDashboardMonitoringSchedules] = js.undefined
}
object ModelDashboardModel {
  
  inline def apply(): ModelDashboardModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDashboardModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDashboardModel] (val x: Self) extends AnyVal {
    
    inline def setEndpoints(value: ModelDashboardEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: ModelDashboardEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setLastBatchTransformJob(value: TransformJob): Self = StObject.set(x, "LastBatchTransformJob", value.asInstanceOf[js.Any])
    
    inline def setLastBatchTransformJobUndefined: Self = StObject.set(x, "LastBatchTransformJob", js.undefined)
    
    inline def setModel(value: Model): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelCard(value: ModelDashboardModelCard): Self = StObject.set(x, "ModelCard", value.asInstanceOf[js.Any])
    
    inline def setModelCardUndefined: Self = StObject.set(x, "ModelCard", js.undefined)
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setMonitoringSchedules(value: ModelDashboardMonitoringSchedules): Self = StObject.set(x, "MonitoringSchedules", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSchedulesUndefined: Self = StObject.set(x, "MonitoringSchedules", js.undefined)
    
    inline def setMonitoringSchedulesVarargs(value: ModelDashboardMonitoringSchedule*): Self = StObject.set(x, "MonitoringSchedules", js.Array(value*))
  }
}
