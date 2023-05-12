package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationSettings extends StObject {
  
  /**
    * The size of your target instance. Fleet Advisor calculates this value based on your data collection type, such as total capacity and resource utilization. Valid values include "total-capacity" and "utilization".
    */
  var InstanceSizingType: String
  
  /**
    * The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values include "development" and "production".
    */
  var WorkloadType: String
}
object RecommendationSettings {
  
  inline def apply(InstanceSizingType: String, WorkloadType: String): RecommendationSettings = {
    val __obj = js.Dynamic.literal(InstanceSizingType = InstanceSizingType.asInstanceOf[js.Any], WorkloadType = WorkloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationSettings] (val x: Self) extends AnyVal {
    
    inline def setInstanceSizingType(value: String): Self = StObject.set(x, "InstanceSizingType", value.asInstanceOf[js.Any])
    
    inline def setWorkloadType(value: String): Self = StObject.set(x, "WorkloadType", value.asInstanceOf[js.Any])
  }
}
