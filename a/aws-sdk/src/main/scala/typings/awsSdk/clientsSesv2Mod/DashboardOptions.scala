package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardOptions extends StObject {
  
  /**
    * Specifies the status of your VDM engagement metrics collection. Can be one of the following:    ENABLED – Amazon SES enables engagement metrics for the configuration set.    DISABLED – Amazon SES disables engagement metrics for the configuration set.  
    */
  var EngagementMetrics: js.UndefOr[FeatureStatus] = js.undefined
}
object DashboardOptions {
  
  inline def apply(): DashboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardOptions] (val x: Self) extends AnyVal {
    
    inline def setEngagementMetrics(value: FeatureStatus): Self = StObject.set(x, "EngagementMetrics", value.asInstanceOf[js.Any])
    
    inline def setEngagementMetricsUndefined: Self = StObject.set(x, "EngagementMetrics", js.undefined)
  }
}
