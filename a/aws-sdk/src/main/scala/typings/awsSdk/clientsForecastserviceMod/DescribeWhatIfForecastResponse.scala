package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWhatIfForecastResponse extends StObject {
  
  /**
    * When the what-if forecast was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The approximate time remaining to complete the what-if forecast, in minutes.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * The quantiles at which probabilistic forecasts are generated. You can specify up to five quantiles per what-if forecast in the CreateWhatIfForecast operation. If you didn't specify quantiles, the default values are ["0.1", "0.5", "0.9"]. 
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastTypes] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the what-if forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the what-if forecast must be ACTIVE before you can access the forecast. 
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * An array of S3Config, Schema, and Format elements that describe the replacement time series.
    */
  var TimeSeriesReplacementsDataSource: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeSeriesReplacementsDataSource] = js.undefined
  
  /**
    * An array of Action and TimeSeriesConditions elements that describe what transformations were applied to which time series.
    */
  var TimeSeriesTransformations: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeSeriesTransformations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if analysis that contains this forecast.
    */
  var WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast.
    */
  var WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined
  
  /**
    * The name of the what-if forecast.
    */
  var WhatIfForecastName: js.UndefOr[Name] = js.undefined
}
object DescribeWhatIfForecastResponse {
  
  inline def apply(): DescribeWhatIfForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWhatIfForecastResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWhatIfForecastResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    inline def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    inline def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value*))
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimeSeriesReplacementsDataSource(value: TimeSeriesReplacementsDataSource): Self = StObject.set(x, "TimeSeriesReplacementsDataSource", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesReplacementsDataSourceUndefined: Self = StObject.set(x, "TimeSeriesReplacementsDataSource", js.undefined)
    
    inline def setTimeSeriesTransformations(value: TimeSeriesTransformations): Self = StObject.set(x, "TimeSeriesTransformations", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesTransformationsUndefined: Self = StObject.set(x, "TimeSeriesTransformations", js.undefined)
    
    inline def setTimeSeriesTransformationsVarargs(value: TimeSeriesTransformation*): Self = StObject.set(x, "TimeSeriesTransformations", js.Array(value*))
    
    inline def setWhatIfAnalysisArn(value: Arn): Self = StObject.set(x, "WhatIfAnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfAnalysisArnUndefined: Self = StObject.set(x, "WhatIfAnalysisArn", js.undefined)
    
    inline def setWhatIfForecastArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastArn", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastArnUndefined: Self = StObject.set(x, "WhatIfForecastArn", js.undefined)
    
    inline def setWhatIfForecastName(value: Name): Self = StObject.set(x, "WhatIfForecastName", value.asInstanceOf[js.Any])
    
    inline def setWhatIfForecastNameUndefined: Self = StObject.set(x, "WhatIfForecastName", js.undefined)
  }
}
