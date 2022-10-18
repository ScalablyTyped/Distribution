package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExplainabilityResponse extends StObject {
  
  /**
    * When the Explainability resource was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var DataSource: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DataSource] = js.undefined
  
  /**
    * Whether the visualization was enabled for the Explainability resource.
    */
  var EnableVisualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If TimePointGranularity is set to SPECIFIC, the last time point in the Explainability.
    */
  var EndDateTime: js.UndefOr[LocalDateTime] = js.undefined
  
  /**
    * The estimated time remaining in minutes for the CreateExplainability job to complete.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability.
    */
  var ExplainabilityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The configuration settings that define the granularity of time series and time points for the Explainability.
    */
  var ExplainabilityConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ExplainabilityConfig] = js.undefined
  
  /**
    * The name of the Explainability.
    */
  var ExplainabilityName: js.UndefOr[Name] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, a message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Predictor or Forecast used to create the Explainability resource.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  var Schema: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Schema] = js.undefined
  
  /**
    * If TimePointGranularity is set to SPECIFIC, the first time point in the Explainability.
    */
  var StartDateTime: js.UndefOr[LocalDateTime] = js.undefined
  
  /**
    * The status of the Explainability resource. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object DescribeExplainabilityResponse {
  
  inline def apply(): DescribeExplainabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExplainabilityResponse]
  }
  
  extension [Self <: DescribeExplainabilityResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setEnableVisualization(value: Boolean): Self = StObject.set(x, "EnableVisualization", value.asInstanceOf[js.Any])
    
    inline def setEnableVisualizationUndefined: Self = StObject.set(x, "EnableVisualization", js.undefined)
    
    inline def setEndDateTime(value: LocalDateTime): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArnUndefined: Self = StObject.set(x, "ExplainabilityArn", js.undefined)
    
    inline def setExplainabilityConfig(value: ExplainabilityConfig): Self = StObject.set(x, "ExplainabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityConfigUndefined: Self = StObject.set(x, "ExplainabilityConfig", js.undefined)
    
    inline def setExplainabilityName(value: Name): Self = StObject.set(x, "ExplainabilityName", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityNameUndefined: Self = StObject.set(x, "ExplainabilityName", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setStartDateTime(value: LocalDateTime): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
