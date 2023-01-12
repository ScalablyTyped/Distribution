package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelVersionDetail extends StObject {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The timestamp when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The external events data details. This will be populated if the trainingDataSource for the model version is specified as EXTERNAL_EVENTS.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * The ingested events data details. This will be populated if the trainingDataSource for the model version is specified as INGESTED_EVENTS.
    */
  var ingestedEventsDetail: js.UndefOr[IngestedEventsDetail] = js.undefined
  
  /**
    * The timestamp when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.undefined
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.undefined
  
  /**
    * The model version number.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined
  
  /**
    * The status of the model version.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.undefined
  
  /**
    * The model version training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.undefined
  
  /**
    * The training results.
    */
  var trainingResult: js.UndefOr[TrainingResult] = js.undefined
  
  /**
    *  The training result details. The details include the relative importance of the variables. 
    */
  var trainingResultV2: js.UndefOr[TrainingResultV2] = js.undefined
}
object ModelVersionDetail {
  
  inline def apply(): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelVersionDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    inline def setIngestedEventsDetail(value: IngestedEventsDetail): Self = StObject.set(x, "ingestedEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setIngestedEventsDetailUndefined: Self = StObject.set(x, "ingestedEventsDetail", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    inline def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingDataSchema(value: TrainingDataSchema): Self = StObject.set(x, "trainingDataSchema", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSchemaUndefined: Self = StObject.set(x, "trainingDataSchema", js.undefined)
    
    inline def setTrainingDataSource(value: TrainingDataSourceEnum): Self = StObject.set(x, "trainingDataSource", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSourceUndefined: Self = StObject.set(x, "trainingDataSource", js.undefined)
    
    inline def setTrainingResult(value: TrainingResult): Self = StObject.set(x, "trainingResult", value.asInstanceOf[js.Any])
    
    inline def setTrainingResultUndefined: Self = StObject.set(x, "trainingResult", js.undefined)
    
    inline def setTrainingResultV2(value: TrainingResultV2): Self = StObject.set(x, "trainingResultV2", value.asInstanceOf[js.Any])
    
    inline def setTrainingResultV2Undefined: Self = StObject.set(x, "trainingResultV2", js.undefined)
  }
}
