package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelVersionRequest extends StObject {
  
  /**
    * Details of the external events data used for model version training. Required if trainingDataSource is EXTERNAL_EVENTS.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined
  
  /**
    * Details of the ingested events data used for model version training. Required if trainingDataSource is INGESTED_EVENTS.
    */
  var ingestedEventsDetail: js.UndefOr[IngestedEventsDetail] = js.undefined
  
  /**
    * The model ID. 
    */
  var modelId: modelIdentifier
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
  
  /**
    * The training data schema.
    */
  var trainingDataSchema: TrainingDataSchema
  
  /**
    * The training data source location in Amazon S3. 
    */
  var trainingDataSource: TrainingDataSourceEnum
}
object CreateModelVersionRequest {
  
  inline def apply(
    modelId: modelIdentifier,
    modelType: ModelTypeEnum,
    trainingDataSchema: TrainingDataSchema,
    trainingDataSource: TrainingDataSourceEnum
  ): CreateModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], trainingDataSchema = trainingDataSchema.asInstanceOf[js.Any], trainingDataSource = trainingDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelVersionRequest]
  }
  
  extension [Self <: CreateModelVersionRequest](x: Self) {
    
    inline def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    inline def setIngestedEventsDetail(value: IngestedEventsDetail): Self = StObject.set(x, "ingestedEventsDetail", value.asInstanceOf[js.Any])
    
    inline def setIngestedEventsDetailUndefined: Self = StObject.set(x, "ingestedEventsDetail", js.undefined)
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTrainingDataSchema(value: TrainingDataSchema): Self = StObject.set(x, "trainingDataSchema", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSource(value: TrainingDataSourceEnum): Self = StObject.set(x, "trainingDataSource", value.asInstanceOf[js.Any])
  }
}
