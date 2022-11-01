package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardAttributes extends StObject {
  
  /**
    * Specifies the status of your VDM engagement metrics collection. Can be one of the following:    ENABLED – Amazon SES enables engagement metrics for your account.    DISABLED – Amazon SES disables engagement metrics for your account.  
    */
  var EngagementMetrics: js.UndefOr[FeatureStatus] = js.undefined
}
object DashboardAttributes {
  
  inline def apply(): DashboardAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardAttributes]
  }
  
  extension [Self <: DashboardAttributes](x: Self) {
    
    inline def setEngagementMetrics(value: FeatureStatus): Self = StObject.set(x, "EngagementMetrics", value.asInstanceOf[js.Any])
    
    inline def setEngagementMetricsUndefined: Self = StObject.set(x, "EngagementMetrics", js.undefined)
  }
}
