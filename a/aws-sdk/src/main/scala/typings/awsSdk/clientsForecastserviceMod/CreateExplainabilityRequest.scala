package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExplainabilityRequest extends StObject {
  
  var DataSource: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DataSource] = js.undefined
  
  /**
    * Create an Explainability visualization that is viewable within the AWS console.
    */
  var EnableVisualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If TimePointGranularity is set to SPECIFIC, define the last time point for the Explainability. Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
    */
  var EndDateTime: js.UndefOr[LocalDateTime] = js.undefined
  
  /**
    * The configuration settings that define the granularity of time series and time points for the Explainability.
    */
  var ExplainabilityConfig: typings.awsSdk.clientsForecastserviceMod.ExplainabilityConfig
  
  /**
    * A unique name for the Explainability.
    */
  var ExplainabilityName: Name
  
  /**
    * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability.
    */
  var ResourceArn: Arn
  
  var Schema: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Schema] = js.undefined
  
  /**
    * If TimePointGranularity is set to SPECIFIC, define the first point for the Explainability. Use the following timestamp format: yyyy-MM-ddTHH:mm:ss (example: 2015-01-01T20:00:00)
    */
  var StartDateTime: js.UndefOr[LocalDateTime] = js.undefined
  
  /**
    * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional value, both of which you define. Tag keys and values are case sensitive. The following restrictions apply to tags:   For each resource, each tag key must be unique and each tag key must have one value.   Maximum number of tags per resource: 50.   Maximum key length: 128 Unicode characters in UTF-8.   Maximum value length: 256 Unicode characters in UTF-8.   Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging schema is used across other services and resources, the character restrictions of those services also apply.    Key prefixes cannot include any upper or lowercase combination of aws: or AWS:. Values can have this prefix. If a tag value has aws as its prefix but the key does not, Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit. You cannot edit or delete tag keys with this prefix.  
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
}
object CreateExplainabilityRequest {
  
  inline def apply(ExplainabilityConfig: ExplainabilityConfig, ExplainabilityName: Name, ResourceArn: Arn): CreateExplainabilityRequest = {
    val __obj = js.Dynamic.literal(ExplainabilityConfig = ExplainabilityConfig.asInstanceOf[js.Any], ExplainabilityName = ExplainabilityName.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExplainabilityRequest]
  }
  
  extension [Self <: CreateExplainabilityRequest](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setEnableVisualization(value: Boolean): Self = StObject.set(x, "EnableVisualization", value.asInstanceOf[js.Any])
    
    inline def setEnableVisualizationUndefined: Self = StObject.set(x, "EnableVisualization", js.undefined)
    
    inline def setEndDateTime(value: LocalDateTime): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setExplainabilityConfig(value: ExplainabilityConfig): Self = StObject.set(x, "ExplainabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityName(value: Name): Self = StObject.set(x, "ExplainabilityName", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setStartDateTime(value: LocalDateTime): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
