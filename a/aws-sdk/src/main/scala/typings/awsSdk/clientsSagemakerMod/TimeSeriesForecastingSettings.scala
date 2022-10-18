package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesForecastingSettings extends StObject {
  
  /**
    * The IAM role that Canvas passes to Amazon Forecast for time series forecasting. By default, Canvas uses the execution role specified in the UserProfile that launches the Canvas app. If an execution role is not specified in the UserProfile, Canvas uses the execution role specified in the Domain that owns the UserProfile. To allow time series forecasting, this IAM role should have the  AmazonSageMakerCanvasForecastAccess policy attached and forecast.amazonaws.com added in the trust relationship as a service principal.
    */
  var AmazonForecastRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Describes whether time series forecasting is enabled or disabled in the Canvas app.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object TimeSeriesForecastingSettings {
  
  inline def apply(): TimeSeriesForecastingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesForecastingSettings]
  }
  
  extension [Self <: TimeSeriesForecastingSettings](x: Self) {
    
    inline def setAmazonForecastRoleArn(value: RoleArn): Self = StObject.set(x, "AmazonForecastRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAmazonForecastRoleArnUndefined: Self = StObject.set(x, "AmazonForecastRoleArn", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
