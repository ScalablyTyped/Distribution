package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchPredictionInput extends StObject {
  
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: EntityId
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId
  
  /**
    * A user-supplied name or description of the BatchPrediction. BatchPredictionName can only use the UTF-8 character set.
    */
  var BatchPredictionName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The ID of the MLModel that will generate predictions for the group of observations. 
    */
  var MLModelId: EntityId
  
  /**
    * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'. Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set permissions, see the Amazon Machine Learning Developer Guide.
    */
  var OutputUri: S3Url
}
object CreateBatchPredictionInput {
  
  inline def apply(
    BatchPredictionDataSourceId: EntityId,
    BatchPredictionId: EntityId,
    MLModelId: EntityId,
    OutputUri: S3Url
  ): CreateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionDataSourceId = BatchPredictionDataSourceId.asInstanceOf[js.Any], BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], MLModelId = MLModelId.asInstanceOf[js.Any], OutputUri = OutputUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchPredictionInput]
  }
  
  extension [Self <: CreateBatchPredictionInput](x: Self) {
    
    inline def setBatchPredictionDataSourceId(value: EntityId): Self = StObject.set(x, "BatchPredictionDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionName(value: EntityName): Self = StObject.set(x, "BatchPredictionName", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionNameUndefined: Self = StObject.set(x, "BatchPredictionName", js.undefined)
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setOutputUri(value: S3Url): Self = StObject.set(x, "OutputUri", value.asInstanceOf[js.Any])
  }
}
