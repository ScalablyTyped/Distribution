package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoPredictorRequest extends StObject {
  
  /**
    * The data configuration for your dataset group and any additional datasets.
    */
  var DataConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DataConfig] = js.undefined
  
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  
  /**
    * Create an Explainability resource for the predictor.
    */
  var ExplainPredictor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of dimension (field) names that specify how to group the generated forecast. For example, if you are generating forecasts for item sales across all your stores, and your dataset contains a store_id field, you would specify store_id as a dimension to group sales forecasts for each store.
    */
  var ForecastDimensions: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastDimensions] = js.undefined
  
  /**
    * The frequency of predictions in a forecast. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min" indicates every five minutes. The frequency must be greater than or equal to the TARGET_TIME_SERIES dataset frequency. When a RELATED_TIME_SERIES dataset is provided, the frequency must be equal to the RELATED_TIME_SERIES dataset frequency.
    */
  var ForecastFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The number of time-steps that the model predicts. The forecast horizon is also called the prediction length. The maximum forecast horizon is the lesser of 500 time-steps or 1/4 of the TARGET_TIME_SERIES dataset length. If you are retraining an existing AutoPredictor, then the maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length. If you are upgrading to an AutoPredictor or retraining an existing AutoPredictor, you cannot update the forecast horizon parameter. You can meet this requirement by providing longer time-series in the dataset.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.undefined
  
  /**
    * The forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with mean.
    */
  var ForecastTypes: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ForecastTypes] = js.undefined
  
  /**
    * The configuration details for predictor monitoring. Provide a name for the monitor resource to enable predictor monitoring. Predictor monitoring allows you to see how your predictor's performance changes over time. For more information, see Predictor Monitoring.
    */
  var MonitorConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.MonitorConfig] = js.undefined
  
  /**
    * The accuracy metric used to optimize the predictor.
    */
  var OptimizationMetric: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.OptimizationMetric] = js.undefined
  
  /**
    * A unique name for the predictor
    */
  var PredictorName: Name
  
  /**
    * The ARN of the predictor to retrain or upgrade. This parameter is only used when retraining or upgrading a predictor. When creating a new predictor, do not specify a value for this parameter. When upgrading or retraining a predictor, only specify values for the ReferencePredictorArn and PredictorName. The value for PredictorName must be a unique predictor name.
    */
  var ReferencePredictorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Optional metadata to help you categorize and organize your predictors. Each tag consists of a key and an optional value, both of which you define. Tag keys and values are case sensitive. The following restrictions apply to tags:   For each resource, each tag key must be unique and each tag key must have one value.   Maximum number of tags per resource: 50.   Maximum key length: 128 Unicode characters in UTF-8.   Maximum value length: 256 Unicode characters in UTF-8.   Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging schema is used across other services and resources, the character restrictions of those services also apply.    Key prefixes cannot include any upper or lowercase combination of aws: or AWS:. Values can have this prefix. If a tag value has aws as its prefix but the key does not, Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit. You cannot edit or delete tag keys with this prefix.  
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
  
  /**
    * The time boundary Forecast uses to align and aggregate any data that doesn't align with your forecast frequency. Provide the unit of time and the time boundary as a key value pair. For more information on specifying a time boundary, see Specifying a Time Boundary. If you don't provide a time boundary, Forecast uses a set of Default Time Boundaries.
    */
  var TimeAlignmentBoundary: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeAlignmentBoundary] = js.undefined
}
object CreateAutoPredictorRequest {
  
  inline def apply(PredictorName: Name): CreateAutoPredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorName = PredictorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoPredictorRequest]
  }
  
  extension [Self <: CreateAutoPredictorRequest](x: Self) {
    
    inline def setDataConfig(value: DataConfig): Self = StObject.set(x, "DataConfig", value.asInstanceOf[js.Any])
    
    inline def setDataConfigUndefined: Self = StObject.set(x, "DataConfig", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setExplainPredictor(value: Boolean): Self = StObject.set(x, "ExplainPredictor", value.asInstanceOf[js.Any])
    
    inline def setExplainPredictorUndefined: Self = StObject.set(x, "ExplainPredictor", js.undefined)
    
    inline def setForecastDimensions(value: ForecastDimensions): Self = StObject.set(x, "ForecastDimensions", value.asInstanceOf[js.Any])
    
    inline def setForecastDimensionsUndefined: Self = StObject.set(x, "ForecastDimensions", js.undefined)
    
    inline def setForecastDimensionsVarargs(value: Name*): Self = StObject.set(x, "ForecastDimensions", js.Array(value*))
    
    inline def setForecastFrequency(value: Frequency): Self = StObject.set(x, "ForecastFrequency", value.asInstanceOf[js.Any])
    
    inline def setForecastFrequencyUndefined: Self = StObject.set(x, "ForecastFrequency", js.undefined)
    
    inline def setForecastHorizon(value: Integer): Self = StObject.set(x, "ForecastHorizon", value.asInstanceOf[js.Any])
    
    inline def setForecastHorizonUndefined: Self = StObject.set(x, "ForecastHorizon", js.undefined)
    
    inline def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    inline def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    inline def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value*))
    
    inline def setMonitorConfig(value: MonitorConfig): Self = StObject.set(x, "MonitorConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitorConfigUndefined: Self = StObject.set(x, "MonitorConfig", js.undefined)
    
    inline def setOptimizationMetric(value: OptimizationMetric): Self = StObject.set(x, "OptimizationMetric", value.asInstanceOf[js.Any])
    
    inline def setOptimizationMetricUndefined: Self = StObject.set(x, "OptimizationMetric", js.undefined)
    
    inline def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    inline def setReferencePredictorArn(value: Arn): Self = StObject.set(x, "ReferencePredictorArn", value.asInstanceOf[js.Any])
    
    inline def setReferencePredictorArnUndefined: Self = StObject.set(x, "ReferencePredictorArn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeAlignmentBoundary(value: TimeAlignmentBoundary): Self = StObject.set(x, "TimeAlignmentBoundary", value.asInstanceOf[js.Any])
    
    inline def setTimeAlignmentBoundaryUndefined: Self = StObject.set(x, "TimeAlignmentBoundary", js.undefined)
  }
}
